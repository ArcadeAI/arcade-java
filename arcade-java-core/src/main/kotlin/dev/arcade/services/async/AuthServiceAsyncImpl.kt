// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.async

import dev.arcade.core.ClientOptions
import dev.arcade.core.RequestOptions
import dev.arcade.core.handlers.errorBodyHandler
import dev.arcade.core.handlers.errorHandler
import dev.arcade.core.handlers.jsonHandler
import dev.arcade.core.http.HttpMethod
import dev.arcade.core.http.HttpRequest
import dev.arcade.core.http.HttpResponse
import dev.arcade.core.http.HttpResponse.Handler
import dev.arcade.core.http.HttpResponseFor
import dev.arcade.core.http.json
import dev.arcade.core.http.parseable
import dev.arcade.core.prepareAsync
import dev.arcade.models.AuthorizationResponse
import dev.arcade.models.auth.AuthAuthorizeParams
import dev.arcade.models.auth.AuthConfirmUserParams
import dev.arcade.models.auth.AuthStatusParams
import dev.arcade.models.auth.ConfirmUserResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class AuthServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AuthServiceAsync {

    private val withRawResponse: AuthServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AuthServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AuthServiceAsync =
        AuthServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun authorize(
        params: AuthAuthorizeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AuthorizationResponse> =
        // post /v1/auth/authorize
        withRawResponse().authorize(params, requestOptions).thenApply { it.parse() }

    override fun confirmUser(
        params: AuthConfirmUserParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConfirmUserResponse> =
        // post /v1/auth/confirm_user
        withRawResponse().confirmUser(params, requestOptions).thenApply { it.parse() }

    override fun status(
        params: AuthStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AuthorizationResponse> =
        // get /v1/auth/status
        withRawResponse().status(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AuthServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AuthServiceAsync.WithRawResponse =
            AuthServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val authorizeHandler: Handler<AuthorizationResponse> =
            jsonHandler<AuthorizationResponse>(clientOptions.jsonMapper)

        override fun authorize(
            params: AuthAuthorizeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AuthorizationResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "auth", "authorize")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { authorizeHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val confirmUserHandler: Handler<ConfirmUserResponse> =
            jsonHandler<ConfirmUserResponse>(clientOptions.jsonMapper)

        override fun confirmUser(
            params: AuthConfirmUserParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConfirmUserResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "auth", "confirm_user")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { confirmUserHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val statusHandler: Handler<AuthorizationResponse> =
            jsonHandler<AuthorizationResponse>(clientOptions.jsonMapper)

        override fun status(
            params: AuthStatusParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AuthorizationResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "auth", "status")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { statusHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
