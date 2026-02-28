package dev.arcade.example.springboot;

import dev.arcade.client.ArcadeClient;
import dev.arcade.models.tools.ExecuteToolRequest;
import dev.arcade.models.tools.ExecuteToolResponse;
import dev.arcade.models.tools.ToolExecuteParams;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Example of calling a tool using the Arcade Java SDK.
 */
@SpringBootApplication
public class SpringBootExample {

    /**
     * Starts the Spring Boot application.
     * @param args All args are passed into the SpringApplication
     */
    public static void main(String[] args) {
        SpringApplication.run(SpringBootExample.class, args);
    }

    /**
     * Injects an <code>ArcadeClient</code>, and returns an ApplicationRunner that makes a tool call.
     * @param client Arcade Client is autoinjected if ARCADE_API_KEY, or equivalent application.properties var is set.
     * @return Runs code on application start.
     */
    @Bean
    ApplicationRunner appRunner(ArcadeClient client) {
        return args -> {
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
        };
    }
}
