// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ChatMessageTest {

    @Test
    fun createChatMessage() {
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
        assertThat(chatMessage).isNotNull
        assertThat(chatMessage.content()).isEqualTo("content")
        assertThat(chatMessage.role()).isEqualTo("role")
        assertThat(chatMessage.name()).contains("name")
        assertThat(chatMessage.toolCallId()).contains("tool_call_id")
        assertThat(chatMessage.toolCalls().get())
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
}
