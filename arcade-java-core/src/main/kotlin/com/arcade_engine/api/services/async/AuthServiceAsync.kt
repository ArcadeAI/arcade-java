// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.arcade_engine.api.services.async

import com.arcade_engine.api.core.RequestOptions
import com.arcade_engine.api.models.AuthAuthorizeParams
import com.arcade_engine.api.models.AuthConfirmUserParams
import com.arcade_engine.api.models.AuthStatusParams
import com.arcade_engine.api.models.AuthorizationResponse
import com.arcade_engine.api.models.ConfirmUserResponse
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
