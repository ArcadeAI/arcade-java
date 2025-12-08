// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models

import dev.arcade.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ChoiceTest {

    @Test
    fun createChoice() {
        val choice =
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
        assertThat(choice).isNotNull
        assertThat(choice.finishReason()).contains("finish_reason")
        assertThat(choice.index()).contains(0L)
        assertThat(choice._logprobs()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(choice.message())
            .contains(
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
        assertThat(choice.toolAuthorizations().get())
            .containsExactly(
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
        assertThat(choice.toolMessages().get())
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
    }
}
