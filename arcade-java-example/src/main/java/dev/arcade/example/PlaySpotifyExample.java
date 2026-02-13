package dev.arcade.example;

import dev.arcade.client.ArcadeClient;
import dev.arcade.client.okhttp.ArcadeOkHttpClient;
import dev.arcade.models.tools.ExecuteToolRequest;
import dev.arcade.models.tools.ExecuteToolResponse;
import dev.arcade.models.tools.ToolExecuteParams;

/**
 * Example of calling a tool using the Arcade Java SDK.
 */
public class PlaySpotifyExample {

    /**
     * Executes the Spotify.ResumePlayback, both the <code>ARCADE_USER_ID</code> and <code>ARCADE_API_KEY</code> environment variables must be set.
     * See the <a href="https://docs.arcade.dev/en/get-started/setup/api-keys">Getting Your API Key</a> guide to create an API Key.
     * Your username can be found in the lower left corner of your <a href="https://app.arcade.dev/home">Arcade console</a>.
     * @param args Not used.
     */
    public static void main(String[] args) {

        String userId = System.getenv("ARCADE_USER_ID"); // the Spotify tool requires a userId
        if (userId == null) {
            throw new IllegalArgumentException("ARCADE_USER_ID and ARCADE_API_KEY environment variables must be set");
        }

        // Configures using the `ARCADE_API_KEY` environment variable
        ArcadeClient client = ArcadeOkHttpClient.fromEnv();

        ToolExecuteParams params = ToolExecuteParams.builder()
                .executeToolRequest(ExecuteToolRequest.builder()
                        .toolName("Spotify.ResumePlayback@1.0.2")
                        .userId(userId)
                        .build())
                .build();
        ExecuteToolResponse executeToolResponse = client.tools().execute(params);
        executeToolResponse
                .output()
                .ifPresentOrElse(
                        output -> System.out.println("Tool output: " + output._value()),
                        () -> System.out.println("No output for this tool"));
    }
}
