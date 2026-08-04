// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.tools

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.arcade.core.JsonValue
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
                .description("description")
                .addEnum("string")
                .innerProperties(JsonValue.from(mapOf<String, Any>()))
                .addInnerRequiredKey("string")
                .innerValType("inner_val_type")
                .nullable(true)
                .properties(JsonValue.from(mapOf<String, Any>()))
                .addRequiredKey("string")
                .build()

        assertThat(valueSchema.valType()).isEqualTo("val_type")
        assertThat(valueSchema.description()).contains("description")
        assertThat(valueSchema.enum_().getOrNull()).containsExactly("string")
        assertThat(valueSchema._innerProperties()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(valueSchema.innerRequiredKeys().getOrNull()).containsExactly("string")
        assertThat(valueSchema.innerValType()).contains("inner_val_type")
        assertThat(valueSchema.nullable()).contains(true)
        assertThat(valueSchema._properties()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(valueSchema.requiredKeys().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val valueSchema =
            ValueSchema.builder()
                .valType("val_type")
                .description("description")
                .addEnum("string")
                .innerProperties(JsonValue.from(mapOf<String, Any>()))
                .addInnerRequiredKey("string")
                .innerValType("inner_val_type")
                .nullable(true)
                .properties(JsonValue.from(mapOf<String, Any>()))
                .addRequiredKey("string")
                .build()

        val roundtrippedValueSchema =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(valueSchema),
                jacksonTypeRef<ValueSchema>(),
            )

        assertThat(roundtrippedValueSchema).isEqualTo(valueSchema)
    }
}
