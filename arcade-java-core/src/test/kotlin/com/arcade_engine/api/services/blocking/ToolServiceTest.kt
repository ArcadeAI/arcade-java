// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.services.blocking

import com.arcade_engine.api.TestServerExtension
import com.arcade_engine.api.client.okhttp.ArcadeOkHttpClient
import com.arcade_engine.api.core.JsonValue
import com.arcade_engine.api.models.AuthorizeToolRequest
import com.arcade_engine.api.models.ExecuteToolRequest
import com.arcade_engine.api.models.ToolAuthorizeParams
import com.arcade_engine.api.models.ToolExecuteParams
import com.arcade_engine.api.models.ToolGetParams
import com.arcade_engine.api.models.ToolListParams
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
                            .nextUri("next_uri")
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
                            .includeErrorStacktrace(true)
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
        val toolDefinition =
            toolService.get(
                ToolGetParams.builder()
                    .name("name")
                    .addIncludeFormat(ToolGetParams.IncludeFormat.ARCADE)
                    .userId("user_id")
                    .build()
            )
        println(toolDefinition)
        toolDefinition.validate()
    }
}
