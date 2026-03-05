// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.auth

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.arcade.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConfirmUserResponseTest {

    @Test
    fun create() {
        val confirmUserResponse =
            ConfirmUserResponse.builder().authId("auth_id").nextUri("next_uri").build()

        assertThat(confirmUserResponse.authId()).isEqualTo("auth_id")
        assertThat(confirmUserResponse.nextUri()).contains("next_uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val confirmUserResponse =
            ConfirmUserResponse.builder().authId("auth_id").nextUri("next_uri").build()

        val roundtrippedConfirmUserResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(confirmUserResponse),
                jacksonTypeRef<ConfirmUserResponse>(),
            )

        assertThat(roundtrippedConfirmUserResponse).isEqualTo(confirmUserResponse)
    }
}
