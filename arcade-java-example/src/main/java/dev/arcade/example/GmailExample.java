package dev.arcade.example;

import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.services.gmail.Gmail;
import com.google.api.services.gmail.model.Message;
import dev.arcade.client.ArcadeClient;
import dev.arcade.client.okhttp.ArcadeOkHttpClient;
import dev.arcade.models.AuthorizationContext;
import dev.arcade.models.AuthorizationResponse;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GmailExample {

    private static final Logger logger = LoggerFactory.getLogger(GmailExample.class);

    public static void main(String[] args) throws Exception {

        // As the developer, you must identify the user you're authorizing
        // and pass a unique identifier for them (e.g. an email or user ID) to Arcade:
        String userId = System.getenv("ARCADE_USER_ID");
        if (userId == null) {
            throw new IllegalArgumentException("Missing environment variable ARCADE_USER_ID");
        }

        ArcadeClient client = ArcadeOkHttpClient.fromEnv();

        // get the auth service and call start
        AuthorizationResponse authResponse = client.auth()
                .start(userId, "google", "oauth2", List.of("https://www.googleapis.com/auth/gmail.readonly"));

        // check the response status
        authResponse
                .status()
                .filter(status -> status != AuthorizationResponse.Status.COMPLETED)
                .flatMap(status -> authResponse.url())
                .ifPresent(url -> logger.info("Click this link to authorize: {}", url));

        // if the authorization is NOT complete, you can wait using the following method (for CLI applications):
        AuthorizationResponse completedAuthResponse = client.auth().waitForCompletion(authResponse);

        // Use the credential
        String token = completedAuthResponse
                .context()
                .flatMap(AuthorizationContext::token)
                .get();

        JsonFactory jsonFactory = GsonFactory.getDefaultInstance();
        HttpTransport httpTransport = new NetHttpTransport();
        GoogleCredential credential = new GoogleCredential().setAccessToken(token);

        Gmail gmail = new Gmail.Builder(httpTransport, jsonFactory, credential)
                .setApplicationName("Your Application Name")
                .build();

        // List email messages
        List<Message> messages = gmail.users().messages().list("me").execute().getMessages();
        logger.info("Messages: {}", messages);
    }
}
