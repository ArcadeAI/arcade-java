// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ErrorTest {

    @Test
    fun createError() {
        val error = Error.builder().message("message").name("name").build()
        assertThat(error).isNotNull
        assertThat(error.message()).contains("message")
        assertThat(error.name()).contains("name")
    }
}
