// File generated from our OpenAPI spec by Stainless.

package org.arcadeai.api.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.arcadeai.api.client.ArcadeClient
import org.arcadeai.api.client.okhttp.ArcadeOkHttpClient
import org.arcadeai.api.core.JsonValue
import org.arcadeai.api.core.jsonMapper
import org.arcadeai.api.models.AuthorizationContext
import org.arcadeai.api.models.AuthorizationResponse
import org.arcadeai.api.models.ChatCompletionCreateParams
import org.arcadeai.api.models.ChatMessage
import org.arcadeai.api.models.ChatRequest
import org.arcadeai.api.models.ChatResponse
import org.arcadeai.api.models.Choice
import org.arcadeai.api.models.ExecuteToolRequest
import org.arcadeai.api.models.ExecuteToolResponse
import org.arcadeai.api.models.ToolExecuteParams
import org.arcadeai.api.models.Usage
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@WireMockTest
class ServiceParamsTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private lateinit var client: ArcadeClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            ArcadeOkHttpClient.builder()
                .apiKey("My API Key")
                .baseUrl(wmRuntimeInfo.getHttpBaseUrl())
                .build()
    }

    @Test
    fun completionsCreateWithAdditionalParams() {
        val additionalHeaders = mutableMapOf<String, List<String>>()

        additionalHeaders.put("x-test-header", listOf("abc1234"))

        val additionalQueryParams = mutableMapOf<String, List<String>>()

        additionalQueryParams.put("test_query_param", listOf("def567"))

        val params =
            ChatCompletionCreateParams.builder()
                .chatRequest(
                    ChatRequest.builder()
                        .frequencyPenalty(0.0)
                        .logitBias(
                            ChatRequest.LogitBias.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .logprobs(true)
                        .maxTokens(0L)
                        .addMessage(
                            ChatMessage.builder()
                                .content("content")
                                .role("role")
                                .name("name")
                                .toolCallId("tool_call_id")
                                .addToolCall(
                                    ChatMessage.ToolCall.builder()
                                        .id("id")
                                        .function(
                                            ChatMessage.ToolCall.Function.builder()
                                                .arguments("arguments")
                                                .name("name")
                                                .build()
                                        )
                                        .type(ChatMessage.ToolCall.Type.FUNCTION)
                                        .build()
                                )
                                .build()
                        )
                        .model("model")
                        .n(0L)
                        .parallelToolCalls(true)
                        .presencePenalty(0.0)
                        .responseFormat(
                            ChatRequest.ResponseFormat.builder()
                                .type(ChatRequest.ResponseFormat.Type.JSON_OBJECT)
                                .build()
                        )
                        .seed(0L)
                        .addStop("string")
                        .stream(true)
                        .streamOptions(
                            ChatRequest.StreamOptions.builder().includeUsage(true).build()
                        )
                        .temperature(0.0)
                        .toolChoice(JsonValue.from(mapOf<String, Any>()))
                        .tools(JsonValue.from(mapOf<String, Any>()))
                        .topLogprobs(0L)
                        .topP(0.0)
                        .user("user")
                        .build()
                )
                .additionalHeaders(additionalHeaders)
                .additionalQueryParams(additionalQueryParams)
                .build()

        val apiResponse =
            ChatResponse.builder()
                .id("id")
                .addChoice(
                    Choice.builder()
                        .finishReason("finish_reason")
                        .index(0L)
                        .logprobs(JsonValue.from(mapOf<String, Any>()))
                        .message(
                            ChatMessage.builder()
                                .content("content")
                                .role("role")
                                .name("name")
                                .toolCallId("tool_call_id")
                                .addToolCall(
                                    ChatMessage.ToolCall.builder()
                                        .id("id")
                                        .function(
                                            ChatMessage.ToolCall.Function.builder()
                                                .arguments("arguments")
                                                .name("name")
                                                .build()
                                        )
                                        .type(ChatMessage.ToolCall.Type.FUNCTION)
                                        .build()
                                )
                                .build()
                        )
                        .addToolAuthorization(
                            AuthorizationResponse.builder()
                                .id("id")
                                .context(
                                    AuthorizationContext.builder()
                                        .token("token")
                                        .userInfo(
                                            AuthorizationContext.UserInfo.builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .build()
                                )
                                .providerId("provider_id")
                                .addScope("string")
                                .status(AuthorizationResponse.Status.PENDING)
                                .url("url")
                                .userId("user_id")
                                .build()
                        )
                        .addToolMessage(
                            ChatMessage.builder()
                                .content("content")
                                .role("role")
                                .name("name")
                                .toolCallId("tool_call_id")
                                .addToolCall(
                                    ChatMessage.ToolCall.builder()
                                        .id("id")
                                        .function(
                                            ChatMessage.ToolCall.Function.builder()
                                                .arguments("arguments")
                                                .name("name")
                                                .build()
                                        )
                                        .type(ChatMessage.ToolCall.Type.FUNCTION)
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .created(0L)
                .model("model")
                .object_("object")
                .systemFingerprint("system_fingerprint")
                .usage(
                    Usage.builder().completionTokens(0L).promptTokens(0L).totalTokens(0L).build()
                )
                .build()

        stubFor(
            post(anyUrl())
                .withHeader("x-test-header", equalTo("abc1234"))
                .withQueryParam("test_query_param", equalTo("def567"))
                .willReturn(ok(JSON_MAPPER.writeValueAsString(apiResponse)))
        )

        client.chat().completions().create(params)

        verify(postRequestedFor(anyUrl()))
    }

    @Test
    fun toolsExecuteWithAdditionalParams() {
        val additionalHeaders = mutableMapOf<String, List<String>>()

        additionalHeaders.put("x-test-header", listOf("abc1234"))

        val additionalQueryParams = mutableMapOf<String, List<String>>()

        additionalQueryParams.put("test_query_param", listOf("def567"))

        val params =
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
                .additionalHeaders(additionalHeaders)
                .additionalQueryParams(additionalQueryParams)
                .build()

        val apiResponse =
            ExecuteToolResponse.builder()
                .id("id")
                .duration(0.0)
                .executionId("execution_id")
                .executionType("execution_type")
                .finishedAt("finished_at")
                .output(
                    ExecuteToolResponse.Output.builder()
                        .authorization(
                            AuthorizationResponse.builder()
                                .id("id")
                                .context(
                                    AuthorizationContext.builder()
                                        .token("token")
                                        .userInfo(
                                            AuthorizationContext.UserInfo.builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .build()
                                )
                                .providerId("provider_id")
                                .addScope("string")
                                .status(AuthorizationResponse.Status.PENDING)
                                .url("url")
                                .userId("user_id")
                                .build()
                        )
                        .error(
                            ExecuteToolResponse.Output.Error.builder()
                                .message("message")
                                .additionalPromptContent("additional_prompt_content")
                                .canRetry(true)
                                .developerMessage("developer_message")
                                .retryAfterMs(0L)
                                .build()
                        )
                        .addLog(
                            ExecuteToolResponse.Output.Log.builder()
                                .level("level")
                                .message("message")
                                .subtype("subtype")
                                .build()
                        )
                        .value(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .runAt("run_at")
                .status("status")
                .success(true)
                .build()

        stubFor(
            post(anyUrl())
                .withHeader("x-test-header", equalTo("abc1234"))
                .withQueryParam("test_query_param", equalTo("def567"))
                .willReturn(ok(JSON_MAPPER.writeValueAsString(apiResponse)))
        )

        client.tools().execute(params)

        verify(postRequestedFor(anyUrl()))
    }
}
