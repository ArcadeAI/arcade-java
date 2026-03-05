// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.admin.secrets

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SecretDeleteParamsTest {

    @Test
    fun create() {
        SecretDeleteParams.builder().secretId("secret_id").build()
    }

    @Test
    fun pathParams() {
        val params = SecretDeleteParams.builder().secretId("secret_id").build()

        assertThat(params._pathParam(0)).isEqualTo("secret_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
