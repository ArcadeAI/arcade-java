// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.arcade.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ErrorTest {

    @Test
    fun create() {
        val error =
            Error.builder()
                .addFieldError(
                    Error.FieldError.builder()
                        .field("field")
                        .message("message")
                        .param("param")
                        .rule("rule")
                        .build()
                )
                .message("message")
                .name("name")
                .build()

        assertThat(error.fieldErrors().getOrNull())
            .containsExactly(
                Error.FieldError.builder()
                    .field("field")
                    .message("message")
                    .param("param")
                    .rule("rule")
                    .build()
            )
        assertThat(error.message()).contains("message")
        assertThat(error.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val error =
            Error.builder()
                .addFieldError(
                    Error.FieldError.builder()
                        .field("field")
                        .message("message")
                        .param("param")
                        .rule("rule")
                        .build()
                )
                .message("message")
                .name("name")
                .build()

        val roundtrippedError =
            jsonMapper.readValue(jsonMapper.writeValueAsString(error), jacksonTypeRef<Error>())

        assertThat(roundtrippedError).isEqualTo(error)
    }
}
