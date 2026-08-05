// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.blocking

import dev.arcade.TestServerExtension
import dev.arcade.client.okhttp.ArcadeOkHttpClient
import dev.arcade.core.JsonValue
import dev.arcade.models.tools.AuthorizeToolRequest
import dev.arcade.models.tools.ExecuteToolRequest
import dev.arcade.models.tools.ToolGetParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ToolServiceTest {

    @Test
    fun list() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val toolService = client.tools()

        val page = toolService.list()

        page.response().validate()
    }

    @Test
    fun authorize() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val toolService = client.tools()

        val authorizationResponse =
            toolService.authorize(
                AuthorizeToolRequest.builder()
                    .toolName("tool_name")
                    .nextUri("next_uri")
                    .toolVersion("tool_version")
                    .userId("user_id")
                    .build()
            )

        authorizationResponse.validate()
    }

    @Test
    fun execute() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val toolService = client.tools()

        val executeToolResponse =
            toolService.execute(
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

        executeToolResponse.validate()
    }

    @Test
    fun get() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val toolService = client.tools()

        val toolDefinition =
            toolService.get(
                ToolGetParams.builder()
                    .name("name")
                    .addIncludeFormat(ToolGetParams.IncludeFormat.ARCADE)
                    .userId("user_id")
                    .build()
            )

        toolDefinition.validate()
    }
}
