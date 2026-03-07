// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.health

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.arcade.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HealthSchemaTest {

    @Test
    fun create() {
        val healthSchema = HealthSchema.builder().healthy(true).build()

        assertThat(healthSchema.healthy()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val healthSchema = HealthSchema.builder().healthy(true).build()

        val roundtrippedHealthSchema =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(healthSchema),
                jacksonTypeRef<HealthSchema>(),
            )

        assertThat(roundtrippedHealthSchema).isEqualTo(healthSchema)
    }
}
