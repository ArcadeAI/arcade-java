// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.async

import dev.arcade.core.ClientOptions
import dev.arcade.core.RequestOptions
import dev.arcade.core.http.HttpResponseFor
import dev.arcade.models.AuthorizationResponse
import dev.arcade.models.auth.AuthAuthorizeParams
import dev.arcade.models.auth.AuthConfirmUserParams
import dev.arcade.models.auth.AuthRequest
import dev.arcade.models.auth.AuthStatusParams
import dev.arcade.models.auth.ConfirmUserRequest
import dev.arcade.models.auth.ConfirmUserResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AuthServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AuthServiceAsync

    /** Starts the authorization process for given authorization requirements */
    fun authorize(params: AuthAuthorizeParams): CompletableFuture<AuthorizationResponse> =
        authorize(params, RequestOptions.none())

    /** @see authorize */
    fun authorize(
        params: AuthAuthorizeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuthorizationResponse>

    /** @see authorize */
    fun authorize(
        authRequest: AuthRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuthorizationResponse> =
        authorize(AuthAuthorizeParams.builder().authRequest(authRequest).build(), requestOptions)

    /** @see authorize */
    fun authorize(authRequest: AuthRequest): CompletableFuture<AuthorizationResponse> =
        authorize(authRequest, RequestOptions.none())

    /** Confirms a user's details during an authorization flow */
    fun confirmUser(params: AuthConfirmUserParams): CompletableFuture<ConfirmUserResponse> =
        confirmUser(params, RequestOptions.none())

    /** @see confirmUser */
    fun confirmUser(
        params: AuthConfirmUserParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConfirmUserResponse>

    /** @see confirmUser */
    fun confirmUser(
        confirmUserRequest: ConfirmUserRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConfirmUserResponse> =
        confirmUser(
            AuthConfirmUserParams.builder().confirmUserRequest(confirmUserRequest).build(),
            requestOptions,
        )

    /** @see confirmUser */
    fun confirmUser(
        confirmUserRequest: ConfirmUserRequest
    ): CompletableFuture<ConfirmUserResponse> =
        confirmUser(confirmUserRequest, RequestOptions.none())

    /**
     * Checks the status of an ongoing authorization process for a specific tool. If 'wait' param is
     * present, does not respond until either the auth status becomes completed or the timeout is
     * reached.
     */
    fun status(params: AuthStatusParams): CompletableFuture<AuthorizationResponse> =
        status(params, RequestOptions.none())

    /** @see status */
    fun status(
        params: AuthStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuthorizationResponse>

    /** A view of [AuthServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AuthServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/auth/authorize`, but is otherwise the same as
         * [AuthServiceAsync.authorize].
         */
        fun authorize(
            params: AuthAuthorizeParams
        ): CompletableFuture<HttpResponseFor<AuthorizationResponse>> =
            authorize(params, RequestOptions.none())

        /** @see authorize */
        fun authorize(
            params: AuthAuthorizeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AuthorizationResponse>>

        /** @see authorize */
        fun authorize(
            authRequest: AuthRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AuthorizationResponse>> =
            authorize(
                AuthAuthorizeParams.builder().authRequest(authRequest).build(),
                requestOptions,
            )

        /** @see authorize */
        fun authorize(
            authRequest: AuthRequest
        ): CompletableFuture<HttpResponseFor<AuthorizationResponse>> =
            authorize(authRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /v1/auth/confirm_user`, but is otherwise the same
         * as [AuthServiceAsync.confirmUser].
         */
        fun confirmUser(
            params: AuthConfirmUserParams
        ): CompletableFuture<HttpResponseFor<ConfirmUserResponse>> =
            confirmUser(params, RequestOptions.none())

        /** @see confirmUser */
        fun confirmUser(
            params: AuthConfirmUserParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConfirmUserResponse>>

        /** @see confirmUser */
        fun confirmUser(
            confirmUserRequest: ConfirmUserRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConfirmUserResponse>> =
            confirmUser(
                AuthConfirmUserParams.builder().confirmUserRequest(confirmUserRequest).build(),
                requestOptions,
            )

        /** @see confirmUser */
        fun confirmUser(
            confirmUserRequest: ConfirmUserRequest
        ): CompletableFuture<HttpResponseFor<ConfirmUserResponse>> =
            confirmUser(confirmUserRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /v1/auth/status`, but is otherwise the same as
         * [AuthServiceAsync.status].
         */
        fun status(
            params: AuthStatusParams
        ): CompletableFuture<HttpResponseFor<AuthorizationResponse>> =
            status(params, RequestOptions.none())

        /** @see status */
        fun status(
            params: AuthStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AuthorizationResponse>>
    }
}
