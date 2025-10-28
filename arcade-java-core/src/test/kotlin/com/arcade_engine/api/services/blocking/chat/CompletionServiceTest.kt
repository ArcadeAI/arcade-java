// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.services.blocking.chat

import com.arcade_engine.api.TestServerExtension
import com.arcade_engine.api.client.okhttp.ArcadeOkHttpClient
import com.arcade_engine.api.core.JsonValue
import com.arcade_engine.api.models.ChatCompletionCreateParams
import com.arcade_engine.api.models.ChatMessage
import com.arcade_engine.api.models.ChatRequest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CompletionServiceTest {

    @Test
    fun callCreate() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val completionService = client.chat().completions()
        val chatResponse =
            completionService.create(
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
            )
        println(chatResponse)
        chatResponse.validate()
    }
}
