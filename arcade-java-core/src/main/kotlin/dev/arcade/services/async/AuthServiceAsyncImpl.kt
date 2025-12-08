// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.async

import dev.arcade.core.ClientOptions
import dev.arcade.core.RequestOptions
import dev.arcade.core.handlers.errorHandler
import dev.arcade.core.handlers.jsonHandler
import dev.arcade.core.handlers.withErrorHandler
import dev.arcade.core.http.HttpMethod
import dev.arcade.core.http.HttpRequest
import dev.arcade.core.http.HttpResponse.Handler
import dev.arcade.core.json
import dev.arcade.core.prepareAsync
import dev.arcade.errors.ArcadeError
import dev.arcade.models.AuthAuthorizeParams
import dev.arcade.models.AuthConfirmUserParams
import dev.arcade.models.AuthStatusParams
import dev.arcade.models.AuthorizationResponse
import dev.arcade.models.ConfirmUserResponse
import java.util.concurrent.CompletableFuture

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

    private val confirmUserHandler: Handler<ConfirmUserResponse> =
        jsonHandler<ConfirmUserResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Confirms a user's details during an authorization flow */
    override fun confirmUser(
        params: AuthConfirmUserParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConfirmUserResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "auth", "confirm_user")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { confirmUserHandler.handle(it) }
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
