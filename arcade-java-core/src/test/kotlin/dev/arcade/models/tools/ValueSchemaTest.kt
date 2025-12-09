// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.tools

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.arcade.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ValueSchemaTest {

    @Test
    fun create() {
        val valueSchema =
            ValueSchema.builder()
                .valType("val_type")
                .addEnum("string")
                .innerValType("inner_val_type")
                .build()

        assertThat(valueSchema.valType()).isEqualTo("val_type")
        assertThat(valueSchema.enum_().getOrNull()).containsExactly("string")
        assertThat(valueSchema.innerValType()).contains("inner_val_type")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val valueSchema =
            ValueSchema.builder()
                .valType("val_type")
                .addEnum("string")
                .innerValType("inner_val_type")
                .build()

        val roundtrippedValueSchema =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(valueSchema),
                jacksonTypeRef<ValueSchema>(),
            )

        assertThat(roundtrippedValueSchema).isEqualTo(valueSchema)
    }
}
