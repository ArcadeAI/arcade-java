// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.blocking

import dev.arcade.TestServerExtension
import dev.arcade.client.okhttp.ArcadeOkHttpClient
import dev.arcade.core.RequestOptions
import dev.arcade.models.AuthorizationResponse
import dev.arcade.models.auth.AuthAuthorizeParams
import dev.arcade.models.auth.AuthRequest
import dev.arcade.models.auth.AuthStatusParams
import dev.arcade.models.auth.ConfirmUserRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.kotlin.argThat
import org.mockito.kotlin.doReturn
import org.mockito.kotlin.eq
import org.mockito.kotlin.spy
import org.mockito.kotlin.verify
import org.mockito.kotlin.whenever

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

    @Test
    fun waitForCompletion() {
        // given
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val auth = spy(client.auth())

        val authResponse =
            AuthorizationResponse.builder()
                .id("start_id")
                .status(AuthorizationResponse.Status.NOT_STARTED)
                .build()

        val secondAuthResponse =
            AuthorizationResponse.builder()
                .id("second_request_id")
                .status(AuthorizationResponse.Status.PENDING)
                .build()

        val completedAuthResponse =
            AuthorizationResponse.builder()
                .id("completed_id")
                .status(AuthorizationResponse.Status.COMPLETED)
                .build()

        val expectedAuthStatusParams =
            AuthStatusParams.builder()
                .id("start_id")
                .wait(AuthServiceImpl.Companion.DEFAULT_LONGPOLL_WAIT_TIME)
                .build()

        doReturn(secondAuthResponse)
            .whenever(auth)
            .status(argThat<AuthStatusParams> { id() == "start_id" }, eq(RequestOptions.none()))

        doReturn(completedAuthResponse)
            .whenever(auth)
            .status(
                argThat<AuthStatusParams> { id() == "second_request_id" },
                eq(RequestOptions.none()),
            )

        // when
        val result = auth.waitForCompletion(authResponse)

        // then
        assertThat(result).isEqualTo(completedAuthResponse)
        verify(auth).status(expectedAuthStatusParams)
    }

    @Test
    fun waitForCompletion_withId() {
        // given
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val auth = spy(client.auth())

        val completedAuthResponse =
            AuthorizationResponse.builder()
                .id("completed_id")
                .status(AuthorizationResponse.Status.COMPLETED)
                .build()

        val secondAuthResponse =
            AuthorizationResponse.builder()
                .id("second_request_id")
                .status(AuthorizationResponse.Status.PENDING)
                .build()

        val expectedAuthStatusParams =
            AuthStatusParams.builder()
                .id("start_id")
                .wait(AuthServiceImpl.Companion.DEFAULT_LONGPOLL_WAIT_TIME)
                .build()

        doReturn(secondAuthResponse)
            .whenever(auth)
            .status(argThat<AuthStatusParams> { id() == "start_id" }, eq(RequestOptions.none()))

        doReturn(completedAuthResponse)
            .whenever(auth)
            .status(
                argThat<AuthStatusParams> { id() == "second_request_id" },
                eq(RequestOptions.none()),
            )

        // when
        val result = auth.waitForCompletion("start_id")

        // then
        assertThat(result).isEqualTo(completedAuthResponse)
        verify(auth).status(expectedAuthStatusParams)
    }

    private fun verifyAuthorize(expected: AuthAuthorizeParams, testCode: (AuthService) -> Unit) {
        // given
        val client =
            ArcadeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val auth = spy(client.auth())

        // when
        testCode.invoke(auth)

        // then
        verify(auth).authorize(expected)
    }
}
