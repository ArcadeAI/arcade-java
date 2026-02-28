package dev.arcade.example.springboot;

import dev.arcade.client.ArcadeClient;
import dev.arcade.models.tools.ExecuteToolRequest;
import dev.arcade.models.tools.ExecuteToolResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Example of calling a tool using the Arcade Java SDK with Spring Boot.
 * <p>
 * The {@code ArcadeClient} bean is auto-configured when the {@code ARCADE_API_KEY} environment variable
 * (or equivalent {@code application.properties} value) is set.
 */
@SpringBootApplication
public class SpringBootExample {

    private static final Logger logger = LoggerFactory.getLogger(SpringBootExample.class);

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
            String userId = System.getenv("ARCADE_USER_ID"); // the Spotify tool requires a userId
            if (userId == null) {
                throw new IllegalArgumentException("Missing ARCADE_USER_ID environment variable");
            }

            ExecuteToolResponse response = client.tools()
                    .execute(ExecuteToolRequest.builder()
                            .toolName("Spotify.ResumePlayback")
                            .userId(userId)
                            .build());

            response.output()
                    .ifPresentOrElse(
                            output -> logger.info("Tool output: {}", output._value()),
                            () -> logger.info("No output for this tool"));
        };
    }
}
