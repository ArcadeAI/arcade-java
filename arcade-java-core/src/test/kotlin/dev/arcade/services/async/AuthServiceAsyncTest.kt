// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.async

import dev.arcade.TestServerExtension
import dev.arcade.client.okhttp.ArcadeOkHttpClientAsync
import dev.arcade.models.auth.AuthRequest
import dev.arcade.models.auth.AuthStatusParams
import dev.arcade.models.auth.ConfirmUserRequest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AuthServiceAsyncTest {

    @Test
    fun authorize() {
        val client =
            ArcadeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val authServiceAsync = client.auth()

        val authorizationResponseFuture =
            authServiceAsync.authorize(
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

        val authorizationResponse = authorizationResponseFuture.get()
        authorizationResponse.validate()
    }

    @Test
    fun confirmUser() {
        val client =
            ArcadeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val authServiceAsync = client.auth()

        val confirmUserResponseFuture =
            authServiceAsync.confirmUser(
                ConfirmUserRequest.builder().flowId("flow_id").userId("user_id").build()
            )

        val confirmUserResponse = confirmUserResponseFuture.get()
        confirmUserResponse.validate()
    }

    @Test
    fun status() {
        val client =
            ArcadeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val authServiceAsync = client.auth()

        val authorizationResponseFuture =
            authServiceAsync.status(AuthStatusParams.builder().id("id").wait(0L).build())

        val authorizationResponse = authorizationResponseFuture.get()
        authorizationResponse.validate()
    }
}
