// File generated from our OpenAPI spec by Stainless.

package org.arcadeai.api.models

import org.arcadeai.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AuthStatusParamsTest {

    @Test
    fun create() {
        AuthStatusParams.builder().id("id").wait(0L).build()
    }

    @Test
    fun queryParams() {
        val params = AuthStatusParams.builder().id("id").wait(0L).build()
        val expected = QueryParams.builder()
        expected.put("id", "id")
        expected.put("wait", "0")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AuthStatusParams.builder().id("id").build()
        val expected = QueryParams.builder()
        expected.put("id", "id")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
