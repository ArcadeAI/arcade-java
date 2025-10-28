// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.services.blocking

import com.arcade_engine.api.core.ClientOptions
import com.arcade_engine.api.core.RequestOptions
import com.arcade_engine.api.core.handlers.errorHandler
import com.arcade_engine.api.core.handlers.jsonHandler
import com.arcade_engine.api.core.handlers.withErrorHandler
import com.arcade_engine.api.core.http.HttpMethod
import com.arcade_engine.api.core.http.HttpRequest
import com.arcade_engine.api.core.http.HttpResponse.Handler
import com.arcade_engine.api.core.json
import com.arcade_engine.api.core.prepare
import com.arcade_engine.api.errors.ArcadeError
import com.arcade_engine.api.models.AuthAuthorizeParams
import com.arcade_engine.api.models.AuthConfirmUserParams
import com.arcade_engine.api.models.AuthStatusParams
import com.arcade_engine.api.models.AuthorizationResponse
import com.arcade_engine.api.models.ConfirmUserResponse

class AuthServiceImpl internal constructor(private val clientOptions: ClientOptions) : AuthService {

    private val errorHandler: Handler<ArcadeError> = errorHandler(clientOptions.jsonMapper)

    private val authorizeHandler: Handler<AuthorizationResponse> =
        jsonHandler<AuthorizationResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Starts the authorization process for given authorization requirements */
    override fun authorize(
        params: AuthAuthorizeParams,
        requestOptions: RequestOptions,
    ): AuthorizationResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "auth", "authorize")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { authorizeHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val confirmUserHandler: Handler<ConfirmUserResponse> =
        jsonHandler<ConfirmUserResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Confirms a user's details during an authorization flow */
    override fun confirmUser(
        params: AuthConfirmUserParams,
        requestOptions: RequestOptions,
    ): ConfirmUserResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "auth", "confirm_user")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { confirmUserHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
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
    ): AuthorizationResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "auth", "status")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { statusHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
