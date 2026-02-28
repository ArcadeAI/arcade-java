package dev.arcade.example;

import dev.arcade.client.ArcadeClient;
import dev.arcade.client.okhttp.ArcadeOkHttpClient;
import dev.arcade.models.tools.ExecuteToolRequest;
import dev.arcade.models.tools.ExecuteToolResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Example of calling a tool using the Arcade Java SDK.
 * <p>
 * Both the {@code ARCADE_USER_ID} and {@code ARCADE_API_KEY} environment variables must be set.
 * See the <a href="https://docs.arcade.dev/en/get-started/setup/api-keys">Getting Your API Key</a> guide to create an API Key.
 * Your username can be found in the lower left corner of your <a href="https://app.arcade.dev/home">Arcade console</a>.
 */
public class PlaySpotifyExample {

    private static final Logger logger = LoggerFactory.getLogger(PlaySpotifyExample.class);

    public static void main(String[] args) {

        String userId = System.getenv("ARCADE_USER_ID"); // the Spotify tool requires a userId
        if (userId == null) {
            throw new IllegalArgumentException("ARCADE_USER_ID and ARCADE_API_KEY environment variables must be set");
        }

        // Configures using the `ARCADE_API_KEY` environment variable
        ArcadeClient client = ArcadeOkHttpClient.fromEnv();

        ExecuteToolResponse response = client.tools()
                .execute(ExecuteToolRequest.builder()
                        .toolName("Spotify.ResumePlayback@1.0.2")
                        .userId(userId)
                        .build());

        response.output()
                .ifPresentOrElse(
                        output -> logger.info("Tool output: {}", output._value()),
                        () -> logger.info("No output for this tool"));
    }
}
