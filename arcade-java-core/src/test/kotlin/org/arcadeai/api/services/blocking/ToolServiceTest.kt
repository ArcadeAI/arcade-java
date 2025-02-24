// File generated from our OpenAPI spec by Stainless.

package org.arcadeai.api.services.blocking

import org.arcadeai.api.TestServerExtension
import org.arcadeai.api.client.okhttp.ArcadeOkHttpClient
import org.arcadeai.api.core.JsonValue
import org.arcadeai.api.models.AuthorizeToolRequest
import org.arcadeai.api.models.ExecuteToolRequest
import org.arcadeai.api.models.ToolAuthorizeParams
import org.arcadeai.api.models.ToolExecuteParams
import org.arcadeai.api.models.ToolGetParams
import org.arcadeai.api.models.ToolListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ToolServiceTest {

    @Test
    fun callList() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val toolService = client.tools()
        val schemasOffsetPageSchemasToolResponse =
            toolService.list(ToolListParams.builder().build())
        println(schemasOffsetPageSchemasToolResponse)
        schemasOffsetPageSchemasToolResponse.items().forEach { it.validate() }
    }

    @Test
    fun callAuthorize() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val toolService = client.tools()
        val authorizationResponse =
            toolService.authorize(
                ToolAuthorizeParams.builder()
                    .authorizeToolRequest(
                        AuthorizeToolRequest.builder()
                            .toolName("tool_name")
                            .toolVersion("tool_version")
                            .userId("user_id")
                            .build()
                    )
                    .build()
            )
        println(authorizationResponse)
        authorizationResponse.validate()
    }

    @Test
    fun callExecute() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val toolService = client.tools()
        val executeToolResponse =
            toolService.execute(
                ToolExecuteParams.builder()
                    .executeToolRequest(
                        ExecuteToolRequest.builder()
                            .toolName("tool_name")
                            .input(
                                ExecuteToolRequest.Input.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .runAt("run_at")
                            .toolVersion("tool_version")
                            .userId("user_id")
                            .build()
                    )
                    .build()
            )
        println(executeToolResponse)
        executeToolResponse.validate()
    }

    @Test
    fun callGet() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val toolService = client.tools()
        val toolDefinition = toolService.get(ToolGetParams.builder().name("name").build())
        println(toolDefinition)
        toolDefinition.validate()
    }
}
