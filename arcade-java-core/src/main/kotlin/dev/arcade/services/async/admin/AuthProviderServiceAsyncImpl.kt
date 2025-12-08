// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.async.admin

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
import dev.arcade.models.AdminAuthProviderCreateParams
import dev.arcade.models.AdminAuthProviderDeleteParams
import dev.arcade.models.AdminAuthProviderGetParams
import dev.arcade.models.AdminAuthProviderListParams
import dev.arcade.models.AdminAuthProviderListResponse
import dev.arcade.models.AdminAuthProviderPatchParams
import dev.arcade.models.AuthProviderResponse
import java.util.concurrent.CompletableFuture

class AuthProviderServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AuthProviderServiceAsync {

    private val errorHandler: Handler<ArcadeError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<AuthProviderResponse> =
        jsonHandler<AuthProviderResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a new auth provider */
    override fun create(
        params: AdminAuthProviderCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AuthProviderResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "admin", "auth_providers")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val listHandler: Handler<AdminAuthProviderListResponse> =
        jsonHandler<AdminAuthProviderListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List a page of auth providers that are available to the caller */
    override fun list(
        params: AdminAuthProviderListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AdminAuthProviderListResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "admin", "auth_providers")
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val deleteHandler: Handler<AuthProviderResponse> =
        jsonHandler<AuthProviderResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Delete a specific auth provider */
    override fun delete(
        params: AdminAuthProviderDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AuthProviderResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("v1", "admin", "auth_providers", params.getPathParam(0))
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val getHandler: Handler<AuthProviderResponse> =
        jsonHandler<AuthProviderResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get the details of a specific auth provider */
    override fun get(
        params: AdminAuthProviderGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AuthProviderResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "admin", "auth_providers", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { getHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val patchHandler: Handler<AuthProviderResponse> =
        jsonHandler<AuthProviderResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Patch an existing auth provider */
    override fun patch(
        params: AdminAuthProviderPatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AuthProviderResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("v1", "admin", "auth_providers", params.getPathParam(0))
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { patchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}
