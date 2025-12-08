// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package dev.arcade.services.async

import dev.arcade.core.RequestOptions
import dev.arcade.models.AuthAuthorizeParams
import dev.arcade.models.AuthConfirmUserParams
import dev.arcade.models.AuthStatusParams
import dev.arcade.models.AuthorizationResponse
import dev.arcade.models.ConfirmUserResponse
import java.util.concurrent.CompletableFuture

interface AuthServiceAsync {

    /** Starts the authorization process for given authorization requirements */
    @JvmOverloads
    fun authorize(
        params: AuthAuthorizeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuthorizationResponse>

    /** Confirms a user's details during an authorization flow */
    @JvmOverloads
    fun confirmUser(
        params: AuthConfirmUserParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConfirmUserResponse>

    /**
     * Checks the status of an ongoing authorization process for a specific tool. If 'wait' param is
     * present, does not respond until either the auth status becomes completed or the timeout is
     * reached.
     */
    @JvmOverloads
    fun status(
        params: AuthStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuthorizationResponse>
}
