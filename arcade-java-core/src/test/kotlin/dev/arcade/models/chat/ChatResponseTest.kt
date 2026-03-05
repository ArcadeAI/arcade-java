// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.chat

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.arcade.core.JsonValue
import dev.arcade.core.jsonMapper
import dev.arcade.models.AuthorizationContext
import dev.arcade.models.AuthorizationResponse
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatResponseTest {

    @Test
    fun create() {
        val chatResponse =
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

        assertThat(chatResponse.id()).contains("id")
        assertThat(chatResponse.choices().getOrNull())
            .containsExactly(
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
        assertThat(chatResponse.created()).contains(0L)
        assertThat(chatResponse.model()).contains("model")
        assertThat(chatResponse.object_()).contains("object")
        assertThat(chatResponse.systemFingerprint()).contains("system_fingerprint")
        assertThat(chatResponse.usage())
            .contains(Usage.builder().completionTokens(0L).promptTokens(0L).totalTokens(0L).build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chatResponse =
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

        val roundtrippedChatResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatResponse),
                jacksonTypeRef<ChatResponse>(),
            )

        assertThat(roundtrippedChatResponse).isEqualTo(chatResponse)
    }
}
