// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.models

import com.arcade_engine.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExecuteToolRequestTest {

    @Test
    fun createExecuteToolRequest() {
        val executeToolRequest =
            ExecuteToolRequest.builder()
                .toolName("tool_name")
                .includeErrorStacktrace(true)
                .input(
                    ExecuteToolRequest.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .runAt("run_at")
                .toolVersion("tool_version")
                .userId("user_id")
                .build()
        assertThat(executeToolRequest).isNotNull
        assertThat(executeToolRequest.toolName()).isEqualTo("tool_name")
        assertThat(executeToolRequest.includeErrorStacktrace()).contains(true)
        assertThat(executeToolRequest.input())
            .contains(
                ExecuteToolRequest.Input.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(executeToolRequest.runAt()).contains("run_at")
        assertThat(executeToolRequest.toolVersion()).contains("tool_version")
        assertThat(executeToolRequest.userId()).contains("user_id")
    }
}
