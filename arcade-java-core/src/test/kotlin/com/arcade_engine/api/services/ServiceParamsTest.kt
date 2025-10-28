// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.services

import com.arcade_engine.api.client.ArcadeClient
import com.arcade_engine.api.client.okhttp.ArcadeOkHttpClient
import com.arcade_engine.api.core.JsonValue
import com.arcade_engine.api.core.jsonMapper
import com.arcade_engine.api.models.AuthorizationContext
import com.arcade_engine.api.models.AuthorizationResponse
import com.arcade_engine.api.models.ChatCompletionCreateParams
import com.arcade_engine.api.models.ChatMessage
import com.arcade_engine.api.models.ChatRequest
import com.arcade_engine.api.models.ChatResponse
import com.arcade_engine.api.models.Choice
import com.arcade_engine.api.models.ExecuteToolRequest
import com.arcade_engine.api.models.ExecuteToolResponse
import com.arcade_engine.api.models.ToolExecuteParams
import com.arcade_engine.api.models.Usage
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
                                .status(AuthorizationResponse.Status.NOT_STARTED)
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
                                .status(AuthorizationResponse.Status.NOT_STARTED)
                                .url("url")
                                .userId("user_id")
                                .build()
                        )
                        .error(
                            ExecuteToolResponse.Output.Error.builder()
                                .canRetry(true)
                                .kind(ExecuteToolResponse.Output.Error.Kind.TOOLKIT_LOAD_FAILED)
                                .message("message")
                                .additionalPromptContent("additional_prompt_content")
                                .developerMessage("developer_message")
                                .extra(
                                    ExecuteToolResponse.Output.Error.Extra.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .retryAfterMs(0L)
                                .stacktrace("stacktrace")
                                .statusCode(0L)
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
