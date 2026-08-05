// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.async

import dev.arcade.TestServerExtension
import dev.arcade.client.okhttp.ArcadeOkHttpClientAsync
import dev.arcade.core.JsonValue
import dev.arcade.models.tools.AuthorizeToolRequest
import dev.arcade.models.tools.ExecuteToolRequest
import dev.arcade.models.tools.ToolGetParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ToolServiceAsyncTest {

    @Test
    fun list() {
        val client =
            ArcadeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val toolServiceAsync = client.tools()

        val pageFuture = toolServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun authorize() {
        val client =
            ArcadeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val toolServiceAsync = client.tools()

        val authorizationResponseFuture =
            toolServiceAsync.authorize(
                AuthorizeToolRequest.builder()
                    .toolName("tool_name")
                    .nextUri("next_uri")
                    .toolVersion("tool_version")
                    .userId("user_id")
                    .build()
            )

        val authorizationResponse = authorizationResponseFuture.get()
        authorizationResponse.validate()
    }

    @Test
    fun execute() {
        val client =
            ArcadeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val toolServiceAsync = client.tools()

        val executeToolResponseFuture =
            toolServiceAsync.execute(
                ExecuteToolRequest.builder()
                    .toolName("tool_name")
                    .includeErrorStacktrace(true)
                    .input(
                        ExecuteToolRequest.Input.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .queryId("query_id")
                    .runAt("run_at")
                    .toolVersion("tool_version")
                    .userId("user_id")
                    .build()
            )

        val executeToolResponse = executeToolResponseFuture.get()
        executeToolResponse.validate()
    }

    @Test
    fun get() {
        val client =
            ArcadeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val toolServiceAsync = client.tools()

        val toolDefinitionFuture =
            toolServiceAsync.get(
                ToolGetParams.builder()
                    .name("name")
                    .addIncludeFormat(ToolGetParams.IncludeFormat.ARCADE)
                    .userId("user_id")
                    .build()
            )

        val toolDefinition = toolDefinitionFuture.get()
        toolDefinition.validate()
    }
}
