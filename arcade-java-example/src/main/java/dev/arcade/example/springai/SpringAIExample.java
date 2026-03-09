package dev.arcade.example.springai;

import dev.arcade.client.ArcadeClient;
import dev.arcade.models.AuthorizationResponse;
import dev.arcade.models.tools.AuthorizeToolRequest;
import dev.arcade.models.tools.ExecuteToolRequest;
import dev.arcade.models.tools.ExecuteToolResponse;
import java.util.Map;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class SpringAIExample {

    private static final String SYSTEM_PROMPT = """
        You are a specialized Music Assistant with access to two MCP tools: get_spotify_state and play_song.
        Your goal is to provide a seamless, proactive audio experience. Follow these operational guidelines:
        Context Awareness: Before playing any music, always use get_spotify_state to see if music is already playing. If it is, acknowledge what is currently playing before switching to the new track.
        Proactive Assistance: If the user asks for a song and Spotify is currently paused, inform the user you are resuming playback or starting the session for them.
        Error Handling: If a song fails to play or the tool returns an error, check the state again to see if the player is disconnected or if the track simply wasn't found.
        Tone: Be concise, upbeat, and music-focused.
        Chain of Thought: When a user asks for a song, your internal logic should be: Check State -> Inform User -> Execute Play.
        """;

    public static void main(String[] args) {
        SpringApplication.run(SpringAIExample.class, args);
    }

    @Bean
    ApplicationRunner runner(ChatClient.Builder chatClientBuilder, ArcadeToolProvider arcadeToolProvider) {
        return args -> {
            ChatClient chatClient = chatClientBuilder
                    .defaultSystem(SYSTEM_PROMPT)
                    .defaultTools(arcadeToolProvider) // see below, each tool is annotated with @Tool
                    .build();

            String summary = chatClient
                    .prompt()
                    .user("If my music is not currently playing, play something to get me in the mood to write code.")
                    .call()
                    .content();

            System.out.println(summary);
        };
    }

    /**
     * Exposes Arcade Tools to Spring AI.
     */
    @Service
    public static class ArcadeToolProvider {
        private final Logger log = LoggerFactory.getLogger(ArcadeToolProvider.class);
        private final ArcadeClient client;
        private final String userId;

        ArcadeToolProvider(ArcadeClient client, @Value("${arcade.user-id}") String userId) {
            this.client = client;
            this.userId = userId;
        }

        /**
         * Exposes an Arcade Tool call to Spotify.GetPlaybackState, using Spring AI annotations.
         *
         * @return A string object of the playback state.
         */
        @Tool(
                name = "play_song",
                description = "Plays a song by an artist and queues four more songs by the same artist")
        String play(@ToolParam(description = "The name of the artist to play") String name) {
            return executeTool("Spotify.PlayArtistByName", Map.of("name", name));
        }

        /**
         * Exposes an Arcade Tool call to Spotify.GetPlaybackState, using Spring AI annotations.
         *
         * @return A string object of the playback state.
         */
        @Tool(name = "get_spotify_state", description = """
            Get information about the user's current playback state,
            including track or episode, and active device.
            This tool does not perform any actions. Use other tools to control playback.
            """)
        String playbackState() {
            return executeTool("Spotify.GetPlaybackState", Map.of());
        }

        /**
         * Executes the specified tool with the provided input. Handles authorization and errors.
         *
         * @param toolName the name of the tool to be executed
         * @param input the input parameters required for tool execution
         * @return the result of the tool execution as a string; the result may include
         *         the output of the tool, an error message, or an authorization requirement
         */
        private String executeTool(String toolName, Map<String, Object> input) {
            log.debug("Executing tool {}, with input: {}", toolName, input);
            try {
                ExecuteToolResponse response = client.tools()
                        .execute(ExecuteToolRequest.builder()
                                .toolName(toolName)
                                .userId(userId)
                                .input(input)
                                .build());

                log.debug(
                        "Tool {} executed, with a status of '{}'",
                        toolName,
                        response.status().orElse(null));

                // process the result
                if (response.success().orElse(false)) {
                    String result =
                            response.output().map(o -> o._value().toString()).orElse("{}");
                    log.debug("Tool {} returned: {}", toolName, result);
                    return result;
                }

                Optional<ExecuteToolResponse.Output.Error> error =
                        response.output().flatMap(ExecuteToolResponse.Output::error);

                if (error.isPresent()) {
                    String errorMessage = error.get().message();

                    if (errorMessage.contains("authorization required")) {
                        AuthorizationResult auth = requestAuthorization(toolName);
                        if (auth.requiresAction()) {
                            log.debug("Tool {} requires authorization, open a browser to {}", toolName, auth.url());
                            return String.format(
                                    "The '%s' tool requires authorization, open a browser to %s to continue.",
                                    toolName, auth.url());
                        }
                    }
                    log.warn("Tool {} returned an error: {}", toolName, errorMessage);
                    return "Error: " + errorMessage;
                }

                return "Error: Tool execution failed";
            } catch (Exception e) {
                String message = e.getMessage();
                if (message != null && message.contains("authorization")) {
                    AuthorizationResult auth = requestAuthorization(toolName);
                    if (auth.requiresAction()) {
                        log.debug("Tool {} requires authorization, open a browser to {}", toolName, auth.url());
                        return String.format(
                                "The '%s' tool requires authorization, open a browser to %s to continue.",
                                toolName, auth.url());
                    }
                }
                log.error("Tool execution failed for {}: {}", toolName, message);
                return "Error: " + message;
            }
        }

        /**
         * Requests authorization for a tool and returns the OAuth URL.
         */
        public AuthorizationResult requestAuthorization(String toolName) {
            try {
                AuthorizationResponse response = client.tools()
                        .authorize(AuthorizeToolRequest.builder()
                                .toolName(toolName)
                                .userId(userId)
                                .build());

                Optional<String> url = response.url();
                String statusValue =
                        response.status().map(s -> s.value().name()).orElse("unknown");

                if ("PENDING".equalsIgnoreCase(statusValue) && url.isPresent()) {
                    return new AuthorizationResult(toolName, url.get(), statusValue);
                }
                return new AuthorizationResult(toolName, null, statusValue);
            } catch (Exception e) {
                log.error("Failed to request authorization for {}: {}", toolName, e.getMessage());
                return new AuthorizationResult(toolName, null, "error: " + e.getMessage());
            }
        }

        public record AuthorizationResult(String toolName, String url, String status) {
            public boolean requiresAction() {
                return url != null && "PENDING".equalsIgnoreCase(status);
            }
        }
    }
}
