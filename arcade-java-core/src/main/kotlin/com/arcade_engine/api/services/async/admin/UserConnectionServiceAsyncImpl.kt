// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.services.async.admin

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
import com.arcade_engine.api.core.prepareAsync
import com.arcade_engine.api.errors.ArcadeError
import com.arcade_engine.api.models.AdminUserConnectionDeleteParams
import com.arcade_engine.api.models.AdminUserConnectionListPageAsync
import com.arcade_engine.api.models.AdminUserConnectionListParams
import java.util.concurrent.CompletableFuture

class UserConnectionServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : UserConnectionServiceAsync {

    private val errorHandler: Handler<ArcadeError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<AdminUserConnectionListPageAsync.Response> =
        jsonHandler<AdminUserConnectionListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List all auth connections */
    override fun list(
        params: AdminUserConnectionListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AdminUserConnectionListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "admin", "user_connections")
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
                    .let { AdminUserConnectionListPageAsync.of(this, params, it) }
            }
    }

    private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /** Delete a user/auth provider connection */
    override fun delete(
        params: AdminUserConnectionDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("v1", "admin", "user_connections", params.getPathParam(0))
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response -> response.use { deleteHandler.handle(it) } }
    }
}
