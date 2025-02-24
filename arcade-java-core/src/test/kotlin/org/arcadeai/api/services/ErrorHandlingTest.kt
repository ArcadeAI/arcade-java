// File generated from our OpenAPI spec by Stainless.

package org.arcadeai.api.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.arcadeai.api.client.ArcadeClient
import org.arcadeai.api.client.okhttp.ArcadeOkHttpClient
import org.arcadeai.api.core.JsonValue
import org.arcadeai.api.core.http.Headers
import org.arcadeai.api.core.jsonMapper
import org.arcadeai.api.errors.ArcadeError
import org.arcadeai.api.errors.ArcadeException
import org.arcadeai.api.errors.BadRequestException
import org.arcadeai.api.errors.InternalServerException
import org.arcadeai.api.errors.NotFoundException
import org.arcadeai.api.errors.PermissionDeniedException
import org.arcadeai.api.errors.RateLimitException
import org.arcadeai.api.errors.UnauthorizedException
import org.arcadeai.api.errors.UnexpectedStatusCodeException
import org.arcadeai.api.errors.UnprocessableEntityException
import org.arcadeai.api.models.AuthorizationContext
import org.arcadeai.api.models.AuthorizationResponse
import org.arcadeai.api.models.ChatCompletionCreateParams
import org.arcadeai.api.models.ChatMessage
import org.arcadeai.api.models.ChatRequest
import org.arcadeai.api.models.ChatResponse
import org.arcadeai.api.models.Choice
import org.arcadeai.api.models.Usage
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.assertj.core.api.InstanceOfAssertFactories
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@WireMockTest
class ErrorHandlingTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private val ARCADE_ERROR: ArcadeError =
        ArcadeError.builder().putAdditionalProperty("key", JsonValue.from("value")).build()

    private lateinit var client: ArcadeClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            ArcadeOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.getHttpBaseUrl())
                .apiKey("My API Key")
                .build()
    }

    @Test
    fun completionsCreate200() {
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
                .build()

        val expected =
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

        stubFor(post(anyUrl()).willReturn(ok().withBody(toJson(expected))))

        assertThat(client.chat().completions().create(params)).isEqualTo(expected)
    }

    @Test
    fun completionsCreate400() {
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
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(400).withHeader("Foo", "Bar").withBody(toJson(ARCADE_ERROR)))
        )

        assertThatThrownBy({ client.chat().completions().create(params) })
            .satisfies({ e ->
                assertBadRequest(e, Headers.builder().put("Foo", "Bar").build(), ARCADE_ERROR)
            })
    }

    @Test
    fun completionsCreate401() {
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
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(401).withHeader("Foo", "Bar").withBody(toJson(ARCADE_ERROR)))
        )

        assertThatThrownBy({ client.chat().completions().create(params) })
            .satisfies({ e ->
                assertUnauthorized(e, Headers.builder().put("Foo", "Bar").build(), ARCADE_ERROR)
            })
    }

    @Test
    fun completionsCreate403() {
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
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(403).withHeader("Foo", "Bar").withBody(toJson(ARCADE_ERROR)))
        )

        assertThatThrownBy({ client.chat().completions().create(params) })
            .satisfies({ e ->
                assertPermissionDenied(e, Headers.builder().put("Foo", "Bar").build(), ARCADE_ERROR)
            })
    }

    @Test
    fun completionsCreate404() {
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
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(404).withHeader("Foo", "Bar").withBody(toJson(ARCADE_ERROR)))
        )

        assertThatThrownBy({ client.chat().completions().create(params) })
            .satisfies({ e ->
                assertNotFound(e, Headers.builder().put("Foo", "Bar").build(), ARCADE_ERROR)
            })
    }

    @Test
    fun completionsCreate422() {
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
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(422).withHeader("Foo", "Bar").withBody(toJson(ARCADE_ERROR)))
        )

        assertThatThrownBy({ client.chat().completions().create(params) })
            .satisfies({ e ->
                assertUnprocessableEntity(
                    e,
                    Headers.builder().put("Foo", "Bar").build(),
                    ARCADE_ERROR,
                )
            })
    }

    @Test
    fun completionsCreate429() {
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
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(429).withHeader("Foo", "Bar").withBody(toJson(ARCADE_ERROR)))
        )

        assertThatThrownBy({ client.chat().completions().create(params) })
            .satisfies({ e ->
                assertRateLimit(e, Headers.builder().put("Foo", "Bar").build(), ARCADE_ERROR)
            })
    }

    @Test
    fun completionsCreate500() {
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
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(500).withHeader("Foo", "Bar").withBody(toJson(ARCADE_ERROR)))
        )

        assertThatThrownBy({ client.chat().completions().create(params) })
            .satisfies({ e ->
                assertInternalServer(e, Headers.builder().put("Foo", "Bar").build(), ARCADE_ERROR)
            })
    }

    @Test
    fun unexpectedStatusCode() {
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
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(999).withHeader("Foo", "Bar").withBody(toJson(ARCADE_ERROR)))
        )

        assertThatThrownBy({ client.chat().completions().create(params) })
            .satisfies({ e ->
                assertUnexpectedStatusCodeException(
                    e,
                    999,
                    Headers.builder().put("Foo", "Bar").build(),
                    toJson(ARCADE_ERROR),
                )
            })
    }

    @Test
    fun invalidBody() {
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
                .build()

        stubFor(post(anyUrl()).willReturn(status(200).withBody("Not JSON")))

        assertThatThrownBy({ client.chat().completions().create(params) })
            .satisfies({ e ->
                assertThat(e)
                    .isInstanceOf(ArcadeException::class.java)
                    .hasMessage("Error reading response")
            })
    }

    @Test
    fun invalidErrorBody() {
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
                .build()

        stubFor(post(anyUrl()).willReturn(status(400).withBody("Not JSON")))

        assertThatThrownBy({ client.chat().completions().create(params) })
            .satisfies({ e ->
                assertBadRequest(e, Headers.builder().build(), ArcadeError.builder().build())
            })
    }

    private fun <T> toJson(body: T): ByteArray {
        return JSON_MAPPER.writeValueAsBytes(body)
    }

    private fun assertUnexpectedStatusCodeException(
        throwable: Throwable,
        statusCode: Int,
        headers: Headers,
        responseBody: ByteArray,
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnexpectedStatusCodeException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(statusCode)
                assertThat(e.body()).isEqualTo(String(responseBody))
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertBadRequest(throwable: Throwable, headers: Headers, error: ArcadeError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(BadRequestException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(400)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertUnauthorized(throwable: Throwable, headers: Headers, error: ArcadeError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(UnauthorizedException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(401)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertPermissionDenied(throwable: Throwable, headers: Headers, error: ArcadeError) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(PermissionDeniedException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(403)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertNotFound(throwable: Throwable, headers: Headers, error: ArcadeError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(NotFoundException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(404)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertUnprocessableEntity(
        throwable: Throwable,
        headers: Headers,
        error: ArcadeError,
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnprocessableEntityException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(422)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertRateLimit(throwable: Throwable, headers: Headers, error: ArcadeError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(RateLimitException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(429)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertInternalServer(throwable: Throwable, headers: Headers, error: ArcadeError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(InternalServerException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(500)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
