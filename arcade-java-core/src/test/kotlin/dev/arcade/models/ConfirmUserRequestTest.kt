// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ConfirmUserRequestTest {

    @Test
    fun createConfirmUserRequest() {
        val confirmUserRequest =
            ConfirmUserRequest.builder().flowId("flow_id").userId("user_id").build()
        assertThat(confirmUserRequest).isNotNull
        assertThat(confirmUserRequest.flowId()).isEqualTo("flow_id")
        assertThat(confirmUserRequest.userId()).isEqualTo("user_id")
    }
}
