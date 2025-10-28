// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AuthAuthorizeParamsTest {

    @Test
    fun create() {
        AuthAuthorizeParams.builder()
            .authRequest(
                AuthRequest.builder()
                    .authRequirement(
                        AuthRequest.AuthRequirement.builder()
                            .id("id")
                            .oauth2(
                                AuthRequest.AuthRequirement.Oauth2.builder()
                                    .addScope("string")
                                    .build()
                            )
                            .providerId("provider_id")
                            .providerType("provider_type")
                            .build()
                    )
                    .userId("user_id")
                    .nextUri("next_uri")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            AuthAuthorizeParams.builder()
                .authRequest(
                    AuthRequest.builder()
                        .authRequirement(
                            AuthRequest.AuthRequirement.builder()
                                .id("id")
                                .oauth2(
                                    AuthRequest.AuthRequirement.Oauth2.builder()
                                        .addScope("string")
                                        .build()
                                )
                                .providerId("provider_id")
                                .providerType("provider_type")
                                .build()
                        )
                        .userId("user_id")
                        .nextUri("next_uri")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AuthRequest.builder()
                    .authRequirement(
                        AuthRequest.AuthRequirement.builder()
                            .id("id")
                            .oauth2(
                                AuthRequest.AuthRequirement.Oauth2.builder()
                                    .addScope("string")
                                    .build()
                            )
                            .providerId("provider_id")
                            .providerType("provider_type")
                            .build()
                    )
                    .userId("user_id")
                    .nextUri("next_uri")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AuthAuthorizeParams.builder()
                .authRequest(
                    AuthRequest.builder()
                        .authRequirement(AuthRequest.AuthRequirement.builder().build())
                        .userId("user_id")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AuthRequest.builder()
                    .authRequirement(AuthRequest.AuthRequirement.builder().build())
                    .userId("user_id")
                    .build()
            )
    }
}
