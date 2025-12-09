// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

interface AuthService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AuthService

    /** Starts the authorization process for given authorization requirements */
    fun authorize(params: AuthAuthorizeParams): AuthorizationResponse =
        authorize(params, RequestOptions.none())

    /** @see authorize */
    fun authorize(
        params: AuthAuthorizeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthorizationResponse

    /** @see authorize */
    fun authorize(
        authRequest: AuthRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthorizationResponse =
        authorize(AuthAuthorizeParams.builder().authRequest(authRequest).build(), requestOptions)

    /** @see authorize */
    fun authorize(authRequest: AuthRequest): AuthorizationResponse =
        authorize(authRequest, RequestOptions.none())

    /** Confirms a user's details during an authorization flow */
    fun confirmUser(params: AuthConfirmUserParams): ConfirmUserResponse =
        confirmUser(params, RequestOptions.none())

    /** @see confirmUser */
    fun confirmUser(
        params: AuthConfirmUserParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConfirmUserResponse

    /** @see confirmUser */
    fun confirmUser(
        confirmUserRequest: ConfirmUserRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConfirmUserResponse =
        confirmUser(
            AuthConfirmUserParams.builder().confirmUserRequest(confirmUserRequest).build(),
            requestOptions,
        )

    /** @see confirmUser */
    fun confirmUser(confirmUserRequest: ConfirmUserRequest): ConfirmUserResponse =
        confirmUser(confirmUserRequest, RequestOptions.none())

    /**
     * Checks the status of an ongoing authorization process for a specific tool. If 'wait' param is
     * present, does not respond until either the auth status becomes completed or the timeout is
     * reached.
     */
    fun status(params: AuthStatusParams): AuthorizationResponse =
        status(params, RequestOptions.none())

    /** @see status */
    fun status(
        params: AuthStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthorizationResponse

    /** A view of [AuthService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AuthService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/auth/authorize`, but is otherwise the same as
         * [AuthService.authorize].
         */
        @MustBeClosed
        fun authorize(params: AuthAuthorizeParams): HttpResponseFor<AuthorizationResponse> =
            authorize(params, RequestOptions.none())

        /** @see authorize */
        @MustBeClosed
        fun authorize(
            params: AuthAuthorizeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthorizationResponse>

        /** @see authorize */
        @MustBeClosed
        fun authorize(
            authRequest: AuthRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthorizationResponse> =
            authorize(
                AuthAuthorizeParams.builder().authRequest(authRequest).build(),
                requestOptions,
            )

        /** @see authorize */
        @MustBeClosed
        fun authorize(authRequest: AuthRequest): HttpResponseFor<AuthorizationResponse> =
            authorize(authRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /v1/auth/confirm_user`, but is otherwise the same
         * as [AuthService.confirmUser].
         */
        @MustBeClosed
        fun confirmUser(params: AuthConfirmUserParams): HttpResponseFor<ConfirmUserResponse> =
            confirmUser(params, RequestOptions.none())

        /** @see confirmUser */
        @MustBeClosed
        fun confirmUser(
            params: AuthConfirmUserParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConfirmUserResponse>

        /** @see confirmUser */
        @MustBeClosed
        fun confirmUser(
            confirmUserRequest: ConfirmUserRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConfirmUserResponse> =
            confirmUser(
                AuthConfirmUserParams.builder().confirmUserRequest(confirmUserRequest).build(),
                requestOptions,
            )

        /** @see confirmUser */
        @MustBeClosed
        fun confirmUser(
            confirmUserRequest: ConfirmUserRequest
        ): HttpResponseFor<ConfirmUserResponse> =
            confirmUser(confirmUserRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /v1/auth/status`, but is otherwise the same as
         * [AuthService.status].
         */
        @MustBeClosed
        fun status(params: AuthStatusParams): HttpResponseFor<AuthorizationResponse> =
            status(params, RequestOptions.none())

        /** @see status */
        @MustBeClosed
        fun status(
            params: AuthStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthorizationResponse>
    }
}
