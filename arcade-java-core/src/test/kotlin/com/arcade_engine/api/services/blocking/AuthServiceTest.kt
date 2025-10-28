// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.services.blocking

import com.arcade_engine.api.TestServerExtension
import com.arcade_engine.api.client.okhttp.ArcadeOkHttpClient
import com.arcade_engine.api.models.AuthAuthorizeParams
import com.arcade_engine.api.models.AuthConfirmUserParams
import com.arcade_engine.api.models.AuthRequest
import com.arcade_engine.api.models.AuthStatusParams
import com.arcade_engine.api.models.ConfirmUserRequest
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
                            .nextUri("next_uri")
                            .build()
                    )
                    .build()
            )
        println(authorizationResponse)
        authorizationResponse.validate()
    }

    @Test
    fun callConfirmUser() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val authService = client.auth()
        val confirmUserResponse =
            authService.confirmUser(
                AuthConfirmUserParams.builder()
                    .confirmUserRequest(
                        ConfirmUserRequest.builder().flowId("flow_id").userId("user_id").build()
                    )
                    .build()
            )
        println(confirmUserResponse)
        confirmUserResponse.validate()
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
