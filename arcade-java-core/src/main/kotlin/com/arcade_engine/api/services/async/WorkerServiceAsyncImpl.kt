// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.services.async

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
import com.arcade_engine.api.models.WorkerCreateParams
import com.arcade_engine.api.models.WorkerDeleteParams
import com.arcade_engine.api.models.WorkerGetParams
import com.arcade_engine.api.models.WorkerHealthParams
import com.arcade_engine.api.models.WorkerHealthResponse
import com.arcade_engine.api.models.WorkerListPageAsync
import com.arcade_engine.api.models.WorkerListParams
import com.arcade_engine.api.models.WorkerResponse
import com.arcade_engine.api.models.WorkerToolsPageAsync
import com.arcade_engine.api.models.WorkerToolsParams
import com.arcade_engine.api.models.WorkerUpdateParams
import java.util.concurrent.CompletableFuture

class WorkerServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WorkerServiceAsync {

    private val errorHandler: Handler<ArcadeError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<WorkerResponse> =
        jsonHandler<WorkerResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a worker */
    override fun create(
        params: WorkerCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WorkerResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "workers")
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

    private val updateHandler: Handler<WorkerResponse> =
        jsonHandler<WorkerResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update a worker */
    override fun update(
        params: WorkerUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WorkerResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("v1", "workers", params.getPathParam(0))
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val listHandler: Handler<WorkerListPageAsync.Response> =
        jsonHandler<WorkerListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List all workers with their definitions */
    override fun list(
        params: WorkerListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WorkerListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "workers")
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
                    .let { WorkerListPageAsync.of(this, params, it) }
            }
    }

    private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /** Delete a worker */
    override fun delete(
        params: WorkerDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("v1", "workers", params.getPathParam(0))
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response -> response.use { deleteHandler.handle(it) } }
    }

    private val getHandler: Handler<WorkerResponse> =
        jsonHandler<WorkerResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a worker by ID */
    override fun get(
        params: WorkerGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WorkerResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "workers", params.getPathParam(0))
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

    private val healthHandler: Handler<WorkerHealthResponse> =
        jsonHandler<WorkerHealthResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get the health of a worker */
    override fun health(
        params: WorkerHealthParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WorkerHealthResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "workers", params.getPathParam(0), "health")
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { healthHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val toolsHandler: Handler<WorkerToolsPageAsync.Response> =
        jsonHandler<WorkerToolsPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Returns a page of tools */
    override fun tools(
        params: WorkerToolsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WorkerToolsPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "workers", params.getPathParam(0), "tools")
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { toolsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
                    .let { WorkerToolsPageAsync.of(this, params, it) }
            }
    }
}
