// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.auth

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.arcade.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConfirmUserRequestTest {

    @Test
    fun create() {
        val confirmUserRequest =
            ConfirmUserRequest.builder().flowId("flow_id").userId("user_id").build()

        assertThat(confirmUserRequest.flowId()).isEqualTo("flow_id")
        assertThat(confirmUserRequest.userId()).isEqualTo("user_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val confirmUserRequest =
            ConfirmUserRequest.builder().flowId("flow_id").userId("user_id").build()

        val roundtrippedConfirmUserRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(confirmUserRequest),
                jacksonTypeRef<ConfirmUserRequest>(),
            )

        assertThat(roundtrippedConfirmUserRequest).isEqualTo(confirmUserRequest)
    }
}
