package dev.arcade.example;

import dev.arcade.client.ArcadeClient;
import dev.arcade.client.okhttp.ArcadeOkHttpClient;
import dev.arcade.core.JsonValue;
import dev.arcade.models.AuthorizationResponse;
import dev.arcade.models.tools.AuthorizeToolRequest;
import dev.arcade.models.tools.ExecuteToolRequest;
import dev.arcade.models.tools.ExecuteToolResponse.Output;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QuickStartExample {

    private static final Logger logger = LoggerFactory.getLogger(QuickStartExample.class);

    public static void main(String[] args) {

        // You can also set the `ARCADE_API_KEY` environment variable instead of passing it as a
        // parameter by using ArcadeOkHttpClient.fromEnv().
        ArcadeClient client =
                ArcadeOkHttpClient.builder().apiKey("{arcade_api_key}").build();

        // Arcade needs a unique identifier for your application user (this could be an email address, a UUID, etc).
        // In this example, use the email you used to sign up for Arcade.dev:
        String userId = "{arcade_user_id}";

        Map<String, JsonValue> searchResult = authorizeAndRunTool(
                client, "GoogleNews.SearchNewsStories", Map.of("keywords", "MCP URL mode elicitation"), userId);

        // Extract the list of news results from the tool output
        List<JsonValue> news = searchResult
                .getOrDefault("news_results", JsonValue.from(List.of()))
                .toListOrEmpty();

        String output = "latest news about MCP URL mode elicitation:\n"
                + news.stream()
                        .map(item -> {
                            Map<String, JsonValue> newsItem = item.toMapOrEmpty();
                            return newsItem.get("source").asStringOrThrow() + " - "
                                    + newsItem.get("title").asStringOrThrow() + "\n"
                                    + newsItem.get("link").asStringOrThrow() + "\n\n";
                        })
                        .collect(Collectors.joining("\n"));

        // Create a Google Doc with the news results
        // If the user has not previously authorized the Google Docs tool, they will be prompted to authorize the tool
        // call.
        Map<String, JsonValue> createDocResult = authorizeAndRunTool(
                client,
                "GoogleDocs.CreateDocumentFromText",
                Map.of("title", "News about MCP URL mode elicitation", "text_content", output),
                userId);

        String googleDocUrl = createDocResult.get("documentUrl").asStringOrThrow();

        String emailBody =
                "You can find the news about MCP URL mode elicitation in the following Google Doc: " + googleDocUrl;

        Map<String, JsonValue> sendEmailResult = authorizeAndRunTool(
                client,
                "Gmail.SendEmail",
                Map.of("recipient", userId, "subject", "News about MCP URL mode elicitation", "body", emailBody),
                userId);

        // Print the response from the tool call
        logger.info(
                """
                Success! Check your email at {}

                You just chained 3 tools together:
                  1. Searched Google News for stories about MCP URL mode elicitation
                  2. Created a Google Doc with the results
                  3. Sent yourself an email with the document link

                Email metadata: {}
                """,
                userId,
                sendEmailResult);
    }

    /**
     * Authorize (if needed) and execute a tool, returning the output as a Map.
     */
    public static Map<String, JsonValue> authorizeAndRunTool(
            ArcadeClient client, String toolName, Map<String, Object> input, String userId) {
        // Start the authorization process
        AuthorizationResponse authResponse = client.tools()
                .authorize(AuthorizeToolRequest.builder()
                        .toolName(toolName)
                        .userId(userId)
                        .build());

        // If the authorization is not completed, print the authorization URL and wait for the user to authorize the
        // app.
        // Tools that do not require authorization will have the status "completed" already.
        authResponse
                .status()
                .filter(status -> status != AuthorizationResponse.Status.COMPLETED)
                .flatMap(status -> authResponse.url())
                .ifPresent(url -> logger.info(
                        """
                        Click this link to authorize {}:
                        {}.
                        The process will continue once you have authorized the app.
                        """,
                        toolName,
                        url));
        client.auth().waitForCompletion(authResponse);

        // Execute the tool and extract the output as a Map
        return client.tools()
                .execute(ExecuteToolRequest.builder()
                        .toolName(toolName)
                        .input(input)
                        .userId(userId)
                        .includeErrorStacktrace(true)
                        .build())
                .output()
                .flatMap(Output::valueAsObject)
                .orElse(Map.of());
    }
}
