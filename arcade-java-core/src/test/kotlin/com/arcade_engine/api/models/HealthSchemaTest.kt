// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HealthSchemaTest {

    @Test
    fun createHealthSchema() {
        val healthSchema = HealthSchema.builder().healthy(true).build()
        assertThat(healthSchema).isNotNull
        assertThat(healthSchema.healthy()).contains(true)
    }
}
