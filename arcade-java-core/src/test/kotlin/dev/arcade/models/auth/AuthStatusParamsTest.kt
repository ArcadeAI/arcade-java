// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.auth

import dev.arcade.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthStatusParamsTest {

    @Test
    fun create() {
        AuthStatusParams.builder().id("id").wait(0L).build()
    }

    @Test
    fun queryParams() {
        val params = AuthStatusParams.builder().id("id").wait(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("id", "id").put("wait", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AuthStatusParams.builder().id("id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("id", "id").build())
    }
}
