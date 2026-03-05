// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.admin.secrets

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SecretCreateParamsTest {

    @Test
    fun create() {
        SecretCreateParams.builder()
            .secretKey("secret_key")
            .value("value")
            .description("description")
            .build()
    }

    @Test
    fun pathParams() {
        val params = SecretCreateParams.builder().secretKey("secret_key").value("value").build()

        assertThat(params._pathParam(0)).isEqualTo("secret_key")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SecretCreateParams.builder()
                .secretKey("secret_key")
                .value("value")
                .description("description")
                .build()

        val body = params._body()

        assertThat(body.value()).isEqualTo("value")
        assertThat(body.description()).contains("description")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SecretCreateParams.builder().secretKey("secret_key").value("value").build()

        val body = params._body()

        assertThat(body.value()).isEqualTo("value")
    }
}
