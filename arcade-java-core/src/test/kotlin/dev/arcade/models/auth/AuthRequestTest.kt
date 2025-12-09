// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models.auth

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.arcade.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthRequestTest {

    @Test
    fun create() {
        val authRequest =
            AuthRequest.builder()
                .authRequirement(
                    AuthRequest.AuthRequirement.builder()
                        .id("id")
                        .oauth2(
                            AuthRequest.AuthRequirement.Oauth2.builder().addScope("string").build()
                        )
                        .providerId("provider_id")
                        .providerType("provider_type")
                        .build()
                )
                .userId("user_id")
                .nextUri("next_uri")
                .build()

        assertThat(authRequest.authRequirement())
            .isEqualTo(
                AuthRequest.AuthRequirement.builder()
                    .id("id")
                    .oauth2(AuthRequest.AuthRequirement.Oauth2.builder().addScope("string").build())
                    .providerId("provider_id")
                    .providerType("provider_type")
                    .build()
            )
        assertThat(authRequest.userId()).isEqualTo("user_id")
        assertThat(authRequest.nextUri()).contains("next_uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val authRequest =
            AuthRequest.builder()
                .authRequirement(
                    AuthRequest.AuthRequirement.builder()
                        .id("id")
                        .oauth2(
                            AuthRequest.AuthRequirement.Oauth2.builder().addScope("string").build()
                        )
                        .providerId("provider_id")
                        .providerType("provider_type")
                        .build()
                )
                .userId("user_id")
                .nextUri("next_uri")
                .build()

        val roundtrippedAuthRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authRequest),
                jacksonTypeRef<AuthRequest>(),
            )

        assertThat(roundtrippedAuthRequest).isEqualTo(authRequest)
    }
}
