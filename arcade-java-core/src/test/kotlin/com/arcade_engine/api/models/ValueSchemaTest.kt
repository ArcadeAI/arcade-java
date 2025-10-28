// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ValueSchemaTest {

    @Test
    fun createValueSchema() {
        val valueSchema =
            ValueSchema.builder()
                .valType("val_type")
                .addEnum("string")
                .innerValType("inner_val_type")
                .build()
        assertThat(valueSchema).isNotNull
        assertThat(valueSchema.valType()).isEqualTo("val_type")
        assertThat(valueSchema.enum_().get()).containsExactly("string")
        assertThat(valueSchema.innerValType()).contains("inner_val_type")
    }
}
