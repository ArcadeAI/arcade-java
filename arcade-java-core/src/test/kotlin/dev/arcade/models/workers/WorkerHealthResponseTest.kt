// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.workers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.arcade.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkerHealthResponseTest {

    @Test
    fun create() {
        val workerHealthResponse =
            WorkerHealthResponse.builder()
                .id("id")
                .enabled(true)
                .healthy(true)
                .message("message")
                .build()

        assertThat(workerHealthResponse.id()).contains("id")
        assertThat(workerHealthResponse.enabled()).contains(true)
        assertThat(workerHealthResponse.healthy()).contains(true)
        assertThat(workerHealthResponse.message()).contains("message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val workerHealthResponse =
            WorkerHealthResponse.builder()
                .id("id")
                .enabled(true)
                .healthy(true)
                .message("message")
                .build()

        val roundtrippedWorkerHealthResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(workerHealthResponse),
                jacksonTypeRef<WorkerHealthResponse>(),
            )

        assertThat(roundtrippedWorkerHealthResponse).isEqualTo(workerHealthResponse)
    }
}
