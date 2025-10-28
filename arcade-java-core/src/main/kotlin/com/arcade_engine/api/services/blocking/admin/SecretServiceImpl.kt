// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.services.blocking.admin

import com.arcade_engine.api.core.ClientOptions
import com.arcade_engine.api.core.RequestOptions
import com.arcade_engine.api.core.handlers.emptyHandler
import com.arcade_engine.api.core.handlers.errorHandler
import com.arcade_engine.api.core.handlers.jsonHandler
import com.arcade_engine.api.core.handlers.withErrorHandler
import com.arcade_engine.api.core.http.HttpMethod
import com.arcade_engine.api.core.http.HttpRequest
import com.arcade_engine.api.core.http.HttpResponse.Handler
import com.arcade_engine.api.core.json
import com.arcade_engine.api.core.prepare
import com.arcade_engine.api.errors.ArcadeError
import com.arcade_engine.api.models.AdminSecretDeleteParams
import com.arcade_engine.api.models.AdminSecretListParams
import com.arcade_engine.api.models.AdminSecretListResponse

class SecretServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SecretService {

    private val errorHandler: Handler<ArcadeError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<AdminSecretListResponse> =
        jsonHandler<AdminSecretListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List all secrets that are visible to the caller */
    override fun list(
        params: AdminSecretListParams,
        requestOptions: RequestOptions,
    ): AdminSecretListResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "admin", "secrets")
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

    private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /** Delete a secret by its ID */
    override fun delete(params: AdminSecretDeleteParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("v1", "admin", "secrets", params.getPathParam(0))
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        response.use { deleteHandler.handle(it) }
    }
}
