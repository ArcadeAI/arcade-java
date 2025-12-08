// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AdminSecretCreateParamsTest {

    @Test
    fun create() {
        AdminSecretCreateParams.builder()
            .secretKey("secret_key")
            .value("value")
            .description("description")
            .build()
    }

    @Test
    fun body() {
        val params =
            AdminSecretCreateParams.builder()
                .secretKey("secret_key")
                .value("value")
                .description("description")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.value()).isEqualTo("value")
        assertThat(body.description()).contains("description")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AdminSecretCreateParams.builder().secretKey("secret_key").value("value").build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.value()).isEqualTo("value")
    }

    @Test
    fun getPathParam() {
        val params =
            AdminSecretCreateParams.builder().secretKey("secret_key").value("value").build()
        assertThat(params).isNotNull
        // path param "secretKey"
        assertThat(params.getPathParam(0)).isEqualTo("secret_key")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
