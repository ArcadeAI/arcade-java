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

internal class ChoiceTest {

    @Test
    fun create() {
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
        assertThat(choice.toolAuthorizations().getOrNull())
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
        assertThat(choice.toolMessages().getOrNull())
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

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
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

        val roundtrippedChoice =
            jsonMapper.readValue(jsonMapper.writeValueAsString(choice), jacksonTypeRef<Choice>())

        assertThat(roundtrippedChoice).isEqualTo(choice)
    }
}
