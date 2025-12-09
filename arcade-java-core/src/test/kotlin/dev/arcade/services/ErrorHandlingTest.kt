// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import dev.arcade.client.ArcadeClient
import dev.arcade.client.okhttp.ArcadeOkHttpClient
import dev.arcade.core.JsonValue
import dev.arcade.core.http.Headers
import dev.arcade.core.jsonMapper
import dev.arcade.errors.ArcadeException
import dev.arcade.errors.BadRequestException
import dev.arcade.errors.InternalServerException
import dev.arcade.errors.NotFoundException
import dev.arcade.errors.PermissionDeniedException
import dev.arcade.errors.RateLimitException
import dev.arcade.errors.UnauthorizedException
import dev.arcade.errors.UnexpectedStatusCodeException
import dev.arcade.errors.UnprocessableEntityException
import dev.arcade.models.chat.ChatMessage
import dev.arcade.models.chat.ChatRequest
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ErrorHandlingTest {

    companion object {

        private val ERROR_JSON: JsonValue = JsonValue.from(mapOf("errorProperty" to "42"))

        private val ERROR_JSON_BYTES: ByteArray = jsonMapper().writeValueAsBytes(ERROR_JSON)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

    private lateinit var client: ArcadeClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            ArcadeOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Test
    fun completionsCreate400() {
        val completionService = client.chat().completions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                completionService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun completionsCreate400WithRawResponse() {
        val completionService = client.chat().completions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                completionService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun completionsCreate401() {
        val completionService = client.chat().completions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                completionService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun completionsCreate401WithRawResponse() {
        val completionService = client.chat().completions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                completionService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun completionsCreate403() {
        val completionService = client.chat().completions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                completionService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun completionsCreate403WithRawResponse() {
        val completionService = client.chat().completions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                completionService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun completionsCreate404() {
        val completionService = client.chat().completions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                completionService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun completionsCreate404WithRawResponse() {
        val completionService = client.chat().completions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                completionService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun completionsCreate422() {
        val completionService = client.chat().completions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                completionService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun completionsCreate422WithRawResponse() {
        val completionService = client.chat().completions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                completionService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun completionsCreate429() {
        val completionService = client.chat().completions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                completionService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun completionsCreate429WithRawResponse() {
        val completionService = client.chat().completions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                completionService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun completionsCreate500() {
        val completionService = client.chat().completions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                completionService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun completionsCreate500WithRawResponse() {
        val completionService = client.chat().completions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                completionService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun completionsCreate999() {
        val completionService = client.chat().completions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                completionService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun completionsCreate999WithRawResponse() {
        val completionService = client.chat().completions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                completionService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun completionsCreateInvalidJsonBody() {
        val completionService = client.chat().completions()
        stubFor(
            post(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<ArcadeException> {
                completionService.create(
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
            }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
