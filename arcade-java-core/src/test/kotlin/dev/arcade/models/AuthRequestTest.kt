// File generated from our OpenAPI spec by Stainless.

package dev.arcade.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AuthRequestTest {

    @Test
    fun createAuthRequest() {
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
        assertThat(authRequest).isNotNull
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
}
