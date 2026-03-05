// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.tools

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.arcade.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolExecutionTest {

    @Test
    fun create() {
        val toolExecution =
            ToolExecution.builder()
                .id("id")
                .createdAt("created_at")
                .executionStatus("execution_status")
                .executionType("execution_type")
                .finishedAt("finished_at")
                .runAt("run_at")
                .startedAt("started_at")
                .toolName("tool_name")
                .toolkitName("toolkit_name")
                .toolkitVersion("toolkit_version")
                .updatedAt("updated_at")
                .userId("user_id")
                .build()

        assertThat(toolExecution.id()).contains("id")
        assertThat(toolExecution.createdAt()).contains("created_at")
        assertThat(toolExecution.executionStatus()).contains("execution_status")
        assertThat(toolExecution.executionType()).contains("execution_type")
        assertThat(toolExecution.finishedAt()).contains("finished_at")
        assertThat(toolExecution.runAt()).contains("run_at")
        assertThat(toolExecution.startedAt()).contains("started_at")
        assertThat(toolExecution.toolName()).contains("tool_name")
        assertThat(toolExecution.toolkitName()).contains("toolkit_name")
        assertThat(toolExecution.toolkitVersion()).contains("toolkit_version")
        assertThat(toolExecution.updatedAt()).contains("updated_at")
        assertThat(toolExecution.userId()).contains("user_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val toolExecution =
            ToolExecution.builder()
                .id("id")
                .createdAt("created_at")
                .executionStatus("execution_status")
                .executionType("execution_type")
                .finishedAt("finished_at")
                .runAt("run_at")
                .startedAt("started_at")
                .toolName("tool_name")
                .toolkitName("toolkit_name")
                .toolkitVersion("toolkit_version")
                .updatedAt("updated_at")
                .userId("user_id")
                .build()

        val roundtrippedToolExecution =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(toolExecution),
                jacksonTypeRef<ToolExecution>(),
            )

        assertThat(roundtrippedToolExecution).isEqualTo(toolExecution)
    }
}
