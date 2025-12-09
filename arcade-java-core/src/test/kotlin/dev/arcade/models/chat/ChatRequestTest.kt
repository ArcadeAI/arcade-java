// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.chat

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.arcade.core.JsonValue
import dev.arcade.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatRequestTest {

    @Test
    fun create() {
        val chatRequest =
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
                .streamOptions(ChatRequest.StreamOptions.builder().includeUsage(true).build())
                .temperature(0.0)
                .toolChoice(JsonValue.from(mapOf<String, Any>()))
                .tools(JsonValue.from(mapOf<String, Any>()))
                .topLogprobs(0L)
                .topP(0.0)
                .user("user")
                .build()

        assertThat(chatRequest.frequencyPenalty()).contains(0.0)
        assertThat(chatRequest.logitBias())
            .contains(
                ChatRequest.LogitBias.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(chatRequest.logprobs()).contains(true)
        assertThat(chatRequest.maxTokens()).contains(0L)
        assertThat(chatRequest.messages().getOrNull())
            .containsExactly(
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
        assertThat(chatRequest.model()).contains("model")
        assertThat(chatRequest.n()).contains(0L)
        assertThat(chatRequest.parallelToolCalls()).contains(true)
        assertThat(chatRequest.presencePenalty()).contains(0.0)
        assertThat(chatRequest.responseFormat())
            .contains(
                ChatRequest.ResponseFormat.builder()
                    .type(ChatRequest.ResponseFormat.Type.JSON_OBJECT)
                    .build()
            )
        assertThat(chatRequest.seed()).contains(0L)
        assertThat(chatRequest.stop().getOrNull()).containsExactly("string")
        assertThat(chatRequest.stream()).contains(true)
        assertThat(chatRequest.streamOptions())
            .contains(ChatRequest.StreamOptions.builder().includeUsage(true).build())
        assertThat(chatRequest.temperature()).contains(0.0)
        assertThat(chatRequest._toolChoice()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(chatRequest._tools()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(chatRequest.topLogprobs()).contains(0L)
        assertThat(chatRequest.topP()).contains(0.0)
        assertThat(chatRequest.user()).contains("user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chatRequest =
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
                .streamOptions(ChatRequest.StreamOptions.builder().includeUsage(true).build())
                .temperature(0.0)
                .toolChoice(JsonValue.from(mapOf<String, Any>()))
                .tools(JsonValue.from(mapOf<String, Any>()))
                .topLogprobs(0L)
                .topP(0.0)
                .user("user")
                .build()

        val roundtrippedChatRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatRequest),
                jacksonTypeRef<ChatRequest>(),
            )

        assertThat(roundtrippedChatRequest).isEqualTo(chatRequest)
    }
}
