// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.services.blocking.admin

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
import com.arcade_engine.api.models.AdminAuthProviderCreateParams
import com.arcade_engine.api.models.AdminAuthProviderDeleteParams
import com.arcade_engine.api.models.AdminAuthProviderGetParams
import com.arcade_engine.api.models.AdminAuthProviderListParams
import com.arcade_engine.api.models.AdminAuthProviderListResponse
import com.arcade_engine.api.models.AdminAuthProviderPatchParams
import com.arcade_engine.api.models.AuthProviderResponse

class AuthProviderServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AuthProviderService {

    private val errorHandler: Handler<ArcadeError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<AuthProviderResponse> =
        jsonHandler<AuthProviderResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a new auth provider */
    override fun create(
        params: AdminAuthProviderCreateParams,
        requestOptions: RequestOptions,
    ): AuthProviderResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "admin", "auth_providers")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
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
    ): AdminAuthProviderListResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "admin", "auth_providers")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val deleteHandler: Handler<AuthProviderResponse> =
        jsonHandler<AuthProviderResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Delete a specific auth provider */
    override fun delete(
        params: AdminAuthProviderDeleteParams,
        requestOptions: RequestOptions,
    ): AuthProviderResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("v1", "admin", "auth_providers", params.getPathParam(0))
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { deleteHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val getHandler: Handler<AuthProviderResponse> =
        jsonHandler<AuthProviderResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get the details of a specific auth provider */
    override fun get(
        params: AdminAuthProviderGetParams,
        requestOptions: RequestOptions,
    ): AuthProviderResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "admin", "auth_providers", params.getPathParam(0))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { getHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val patchHandler: Handler<AuthProviderResponse> =
        jsonHandler<AuthProviderResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Patch an existing auth provider */
    override fun patch(
        params: AdminAuthProviderPatchParams,
        requestOptions: RequestOptions,
    ): AuthProviderResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("v1", "admin", "auth_providers", params.getPathParam(0))
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { patchHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
