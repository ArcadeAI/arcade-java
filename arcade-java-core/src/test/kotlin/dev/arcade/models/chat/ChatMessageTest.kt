// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.chat

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.arcade.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatMessageTest {

    @Test
    fun create() {
        val chatMessage =
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

        assertThat(chatMessage.content()).isEqualTo("content")
        assertThat(chatMessage.role()).isEqualTo("role")
        assertThat(chatMessage.name()).contains("name")
        assertThat(chatMessage.toolCallId()).contains("tool_call_id")
        assertThat(chatMessage.toolCalls().getOrNull())
            .containsExactly(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chatMessage =
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

        val roundtrippedChatMessage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatMessage),
                jacksonTypeRef<ChatMessage>(),
            )

        assertThat(roundtrippedChatMessage).isEqualTo(chatMessage)
    }
}
