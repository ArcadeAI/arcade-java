// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WorkerHealthResponseTest {

    @Test
    fun createWorkerHealthResponse() {
        val workerHealthResponse =
            WorkerHealthResponse.builder()
                .id("id")
                .enabled(true)
                .healthy(true)
                .message("message")
                .build()
        assertThat(workerHealthResponse).isNotNull
        assertThat(workerHealthResponse.id()).contains("id")
        assertThat(workerHealthResponse.enabled()).contains(true)
        assertThat(workerHealthResponse.healthy()).contains(true)
        assertThat(workerHealthResponse.message()).contains("message")
    }
}
