// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.tools

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.arcade.core.JsonValue
import dev.arcade.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExecuteToolRequestTest {

    @Test
    fun create() {
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

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
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

        val roundtrippedExecuteToolRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(executeToolRequest),
                jacksonTypeRef<ExecuteToolRequest>(),
            )

        assertThat(roundtrippedExecuteToolRequest).isEqualTo(executeToolRequest)
    }
}
