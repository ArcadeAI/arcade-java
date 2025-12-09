// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.blocking

import dev.arcade.TestServerExtension
import dev.arcade.client.okhttp.ArcadeOkHttpClient
import dev.arcade.models.auth.AuthRequest
import dev.arcade.models.auth.AuthStatusParams
import dev.arcade.models.auth.ConfirmUserRequest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AuthServiceTest {

    @Test
    fun authorize() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val authService = client.auth()

        val authorizationResponse =
            authService.authorize(
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

        authorizationResponse.validate()
    }

    @Test
    fun confirmUser() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val authService = client.auth()

        val confirmUserResponse =
            authService.confirmUser(
                ConfirmUserRequest.builder().flowId("flow_id").userId("user_id").build()
            )

        confirmUserResponse.validate()
    }

    @Test
    fun status() {
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val authService = client.auth()

        val authorizationResponse =
            authService.status(AuthStatusParams.builder().id("id").wait(0L).build())

        authorizationResponse.validate()
    }
}
