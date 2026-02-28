package dev.arcade.example;

import dev.arcade.client.ArcadeClient;
import dev.arcade.client.okhttp.ArcadeOkHttpClient;
import dev.arcade.models.AuthorizationResponse;
import java.util.List;

public class AuthExample {

    public static void main(String[] args) {

        // As the developer, you must identify the user you're authorizing
        // and pass a unique identifier for them (e.g. an email or user ID) to Arcade:
        String userId = System.getenv("ARCADE_USER_ID");
        if (userId == null) {
            throw new IllegalArgumentException("Missing environment variable ARCADE_USER_ID");
        }

        ArcadeClient client = ArcadeOkHttpClient.builder().fromEnv().build();

        // get the auth service, and call start
        AuthorizationResponse authResponse = client.auth().start(userId, "github", "oauth2", List.of("repo"));

        // check the response status
        authResponse
                .status()
                .filter(status -> status != AuthorizationResponse.Status.COMPLETED)
                .flatMap(status -> authResponse.url())
                .ifPresent(url -> System.out.println("Click this link to authorize: " + url));

        // if the authorization is NOT complete, you can wait using the following method (for CLI applications):
        client.auth().waitForCompletion(authResponse);
    }
}
