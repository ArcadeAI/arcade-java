// File generated from our OpenAPI spec by Stainless.

package org.arcadeai.api.models

import org.arcadeai.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ChatCompletionCreateParamsTest {

    @Test
    fun create() {
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
                    .streamOptions(ChatRequest.StreamOptions.builder().includeUsage(true).build())
                    .temperature(0.0)
                    .toolChoice(JsonValue.from(mapOf<String, Any>()))
                    .tools(JsonValue.from(mapOf<String, Any>()))
                    .topLogprobs(0L)
                    .topP(0.0)
                    .user("user")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
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

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ChatCompletionCreateParams.builder().chatRequest(ChatRequest.builder().build()).build()

        val body = params._body()

        assertThat(body).isEqualTo(ChatRequest.builder().build())
    }
}
