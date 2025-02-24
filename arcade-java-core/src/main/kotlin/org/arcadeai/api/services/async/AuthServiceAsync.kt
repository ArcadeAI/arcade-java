// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.arcadeai.api.services.async

import java.util.concurrent.CompletableFuture
import org.arcadeai.api.core.RequestOptions
import org.arcadeai.api.models.AuthAuthorizeParams
import org.arcadeai.api.models.AuthStatusParams
import org.arcadeai.api.models.AuthorizationResponse

interface AuthServiceAsync {

    /** Starts the authorization process for given authorization requirements */
    @JvmOverloads
    fun authorize(
        params: AuthAuthorizeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuthorizationResponse>

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
