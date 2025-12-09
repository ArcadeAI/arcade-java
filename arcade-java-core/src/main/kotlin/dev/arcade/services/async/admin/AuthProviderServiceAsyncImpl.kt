// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.async.admin

import dev.arcade.core.ClientOptions
import dev.arcade.core.RequestOptions
import dev.arcade.core.checkRequired
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
import dev.arcade.models.admin.authproviders.AuthProviderCreateParams
import dev.arcade.models.admin.authproviders.AuthProviderDeleteParams
import dev.arcade.models.admin.authproviders.AuthProviderGetParams
import dev.arcade.models.admin.authproviders.AuthProviderListParams
import dev.arcade.models.admin.authproviders.AuthProviderListResponse
import dev.arcade.models.admin.authproviders.AuthProviderPatchParams
import dev.arcade.models.admin.authproviders.AuthProviderResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AuthProviderServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AuthProviderServiceAsync {

    private val withRawResponse: AuthProviderServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AuthProviderServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AuthProviderServiceAsync =
        AuthProviderServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: AuthProviderCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AuthProviderResponse> =
        // post /v1/admin/auth_providers
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: AuthProviderListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AuthProviderListResponse> =
        // get /v1/admin/auth_providers
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: AuthProviderDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AuthProviderResponse> =
        // delete /v1/admin/auth_providers/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: AuthProviderGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AuthProviderResponse> =
        // get /v1/admin/auth_providers/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun patch(
        params: AuthProviderPatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AuthProviderResponse> =
        // patch /v1/admin/auth_providers/{id}
        withRawResponse().patch(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AuthProviderServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AuthProviderServiceAsync.WithRawResponse =
            AuthProviderServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<AuthProviderResponse> =
            jsonHandler<AuthProviderResponse>(clientOptions.jsonMapper)

        override fun create(
            params: AuthProviderCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AuthProviderResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "admin", "auth_providers")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<AuthProviderListResponse> =
            jsonHandler<AuthProviderListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AuthProviderListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AuthProviderListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "admin", "auth_providers")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<AuthProviderResponse> =
            jsonHandler<AuthProviderResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: AuthProviderDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AuthProviderResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "admin", "auth_providers", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getHandler: Handler<AuthProviderResponse> =
            jsonHandler<AuthProviderResponse>(clientOptions.jsonMapper)

        override fun get(
            params: AuthProviderGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AuthProviderResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "admin", "auth_providers", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val patchHandler: Handler<AuthProviderResponse> =
            jsonHandler<AuthProviderResponse>(clientOptions.jsonMapper)

        override fun patch(
            params: AuthProviderPatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AuthProviderResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "admin", "auth_providers", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { patchHandler.handle(it) }
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
