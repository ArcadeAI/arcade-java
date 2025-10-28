// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ToolExecutionTest {

    @Test
    fun createToolExecution() {
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
        assertThat(toolExecution).isNotNull
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
}
