// File generated from our OpenAPI spec by Stainless.

package org.arcadeai.api.services.blocking

import org.arcadeai.api.TestServerExtension
import org.arcadeai.api.client.okhttp.ArcadeOkHttpClient
import org.arcadeai.api.models.AuthAuthorizeParams
import org.arcadeai.api.models.AuthRequest
import org.arcadeai.api.models.AuthStatusParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AuthServiceTest {

    @Test
    fun callAuthorize() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val authService = client.auth()
        val authorizationResponse =
            authService.authorize(
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
                            .build()
                    )
                    .build()
            )
        println(authorizationResponse)
        authorizationResponse.validate()
    }

    @Test
    fun callStatus() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val authService = client.auth()
        val authorizationResponse =
            authService.status(AuthStatusParams.builder().id("id").wait(0L).build())
        println(authorizationResponse)
        authorizationResponse.validate()
    }
}
