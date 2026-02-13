// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.async

import dev.arcade.TestServerExtension
import dev.arcade.client.okhttp.ArcadeOkHttpClient
import dev.arcade.client.okhttp.ArcadeOkHttpClientAsync
import dev.arcade.models.auth.AuthAuthorizeParams
import dev.arcade.models.auth.AuthRequest
import dev.arcade.models.auth.AuthStatusParams
import dev.arcade.models.auth.ConfirmUserRequest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.kotlin.spy
import org.mockito.kotlin.verify

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

    // -------------------------------------------------------------------------
    // Start of manually added code
    // -------------------------------------------------------------------------

    @Test
    fun start() {
        val expected =
            AuthAuthorizeParams.builder()
                .authRequest(
                    AuthRequest.builder()
                        .userId("user_id")
                        .authRequirement(
                            AuthRequest.AuthRequirement.builder()
                                .providerId("provider_id")
                                .providerType("provider_type")
                                .oauth2(
                                    AuthRequest.AuthRequirement.Oauth2.builder()
                                        .scopes(listOf("scope_one", "scope_two"))
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        verifyAuthorize(expected) { auth ->
            auth.start("user_id", "provider_id", "provider_type", listOf("scope_one", "scope_two"))
        }
    }

    @Test
    fun start_noScopes() {
        val expected =
            AuthAuthorizeParams.builder()
                .authRequest(
                    AuthRequest.builder()
                        .userId("user_id")
                        .authRequirement(
                            AuthRequest.AuthRequirement.builder()
                                .providerId("provider_id")
                                .providerType("provider_type")
                                .oauth2(
                                    AuthRequest.AuthRequirement.Oauth2.builder()
                                        .scopes(emptyList())
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        verifyAuthorize(expected) { auth -> auth.start("user_id", "provider_id", "provider_type") }
    }

    @Test
    fun start_noProviderType() {
        val expected =
            AuthAuthorizeParams.builder()
                .authRequest(
                    AuthRequest.builder()
                        .userId("user_id")
                        .authRequirement(
                            AuthRequest.AuthRequirement.builder()
                                .providerId("provider_id")
                                .providerType("oauth2")
                                .oauth2(
                                    AuthRequest.AuthRequirement.Oauth2.builder()
                                        .scopes(emptyList())
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        verifyAuthorize(expected) { auth -> auth.start("user_id", "provider_id") }
    }

    private fun verifyAuthorize(
        expected: AuthAuthorizeParams,
        testCode: (AuthServiceAsync) -> Unit,
    ) {
        // given
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val auth = spy(client.async().auth())

        // when
        testCode.invoke(auth)

        // then
        verify(auth).authorize(expected)
    }
}
