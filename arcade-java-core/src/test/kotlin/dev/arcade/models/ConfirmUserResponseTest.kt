// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ConfirmUserResponseTest {

    @Test
    fun createConfirmUserResponse() {
        val confirmUserResponse =
            ConfirmUserResponse.builder().authId("auth_id").nextUri("next_uri").build()
        assertThat(confirmUserResponse).isNotNull
        assertThat(confirmUserResponse.authId()).isEqualTo("auth_id")
        assertThat(confirmUserResponse.nextUri()).contains("next_uri")
    }
}
