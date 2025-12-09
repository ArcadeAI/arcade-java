// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.tools.scheduled

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.arcade.core.jsonMapper
import dev.arcade.models.tools.ToolExecution
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScheduledListPageResponseTest {

    @Test
    fun create() {
        val scheduledListPageResponse =
            ScheduledListPageResponse.builder()
                .addItem(
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
                )
                .limit(0L)
                .offset(0L)
                .pageCount(0L)
                .totalCount(0L)
                .build()

        assertThat(scheduledListPageResponse.items().getOrNull())
            .containsExactly(
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
            )
        assertThat(scheduledListPageResponse.limit()).contains(0L)
        assertThat(scheduledListPageResponse.offset()).contains(0L)
        assertThat(scheduledListPageResponse.pageCount()).contains(0L)
        assertThat(scheduledListPageResponse.totalCount()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scheduledListPageResponse =
            ScheduledListPageResponse.builder()
                .addItem(
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
                )
                .limit(0L)
                .offset(0L)
                .pageCount(0L)
                .totalCount(0L)
                .build()

        val roundtrippedScheduledListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scheduledListPageResponse),
                jacksonTypeRef<ScheduledListPageResponse>(),
            )

        assertThat(roundtrippedScheduledListPageResponse).isEqualTo(scheduledListPageResponse)
    }
}
