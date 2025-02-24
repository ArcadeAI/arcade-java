// File generated from our OpenAPI spec by Stainless.

package org.arcadeai.api.services.async

import java.util.concurrent.CompletableFuture
import org.arcadeai.api.core.ClientOptions
import org.arcadeai.api.core.RequestOptions
import org.arcadeai.api.core.handlers.errorHandler
import org.arcadeai.api.core.handlers.jsonHandler
import org.arcadeai.api.core.handlers.withErrorHandler
import org.arcadeai.api.core.http.HttpMethod
import org.arcadeai.api.core.http.HttpRequest
import org.arcadeai.api.core.http.HttpResponse.Handler
import org.arcadeai.api.core.json
import org.arcadeai.api.core.prepareAsync
import org.arcadeai.api.errors.ArcadeError
import org.arcadeai.api.models.AuthAuthorizeParams
import org.arcadeai.api.models.AuthStatusParams
import org.arcadeai.api.models.AuthorizationResponse

class AuthServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AuthServiceAsync {

    private val errorHandler: Handler<ArcadeError> = errorHandler(clientOptions.jsonMapper)

    private val authorizeHandler: Handler<AuthorizationResponse> =
        jsonHandler<AuthorizationResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Starts the authorization process for given authorization requirements */
    override fun authorize(
        params: AuthAuthorizeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AuthorizationResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "auth", "authorize")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { authorizeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val statusHandler: Handler<AuthorizationResponse> =
        jsonHandler<AuthorizationResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Checks the status of an ongoing authorization process for a specific tool. If 'wait' param is
     * present, does not respond until either the auth status becomes completed or the timeout is
     * reached.
     */
    override fun status(
        params: AuthStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AuthorizationResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "auth", "status")
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { statusHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}
