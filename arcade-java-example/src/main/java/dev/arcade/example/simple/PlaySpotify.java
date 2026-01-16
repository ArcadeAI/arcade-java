package dev.arcade.example.simple;

import dev.arcade.client.ArcadeClient;
import dev.arcade.client.okhttp.ArcadeOkHttpClient;
import dev.arcade.models.ExecuteToolRequest;
import dev.arcade.models.ExecuteToolResponse;
import dev.arcade.models.ToolExecuteParams;

/**
 * Example of calling a tool using the Arcade Java SDK.
 */
public class PlaySpotify {

    /**
     * Simple main method example.
     * @param args Not used.
     */
    public static void main(String[] args) {

        // Configures using the `ARCADE_API_KEY` environment variable
        ArcadeClient client = ArcadeOkHttpClient.fromEnv();

        String userId = System.getenv("ARCADE_USER_ID"); // the Spotify tool require a userId
        if (userId == null) {
            throw new IllegalArgumentException("Missing ARCADE_USER_ID environment variable");
        }

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
