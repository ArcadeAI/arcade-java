// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.admin.authproviders

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthProviderGetParamsTest {

    @Test
    fun create() {
        AuthProviderGetParams.builder().id("id").build()
    }

    @Test
    fun pathParams() {
        val params = AuthProviderGetParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
