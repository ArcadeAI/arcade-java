// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.services.blocking

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
import com.arcade_engine.api.models.WorkerCreateParams
import com.arcade_engine.api.models.WorkerDeleteParams
import com.arcade_engine.api.models.WorkerGetParams
import com.arcade_engine.api.models.WorkerHealthParams
import com.arcade_engine.api.models.WorkerHealthResponse
import com.arcade_engine.api.models.WorkerListPage
import com.arcade_engine.api.models.WorkerListParams
import com.arcade_engine.api.models.WorkerResponse
import com.arcade_engine.api.models.WorkerToolsPage
import com.arcade_engine.api.models.WorkerToolsParams
import com.arcade_engine.api.models.WorkerUpdateParams

class WorkerServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    WorkerService {

    private val errorHandler: Handler<ArcadeError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<WorkerResponse> =
        jsonHandler<WorkerResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a worker */
    override fun create(
        params: WorkerCreateParams,
        requestOptions: RequestOptions,
    ): WorkerResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "workers")
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

    private val updateHandler: Handler<WorkerResponse> =
        jsonHandler<WorkerResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update a worker */
    override fun update(
        params: WorkerUpdateParams,
        requestOptions: RequestOptions,
    ): WorkerResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("v1", "workers", params.getPathParam(0))
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { updateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<WorkerListPage.Response> =
        jsonHandler<WorkerListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List all workers with their definitions */
    override fun list(params: WorkerListParams, requestOptions: RequestOptions): WorkerListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "workers")
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
            .let { WorkerListPage.of(this, params, it) }
    }

    private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /** Delete a worker */
    override fun delete(params: WorkerDeleteParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("v1", "workers", params.getPathParam(0))
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        response.use { deleteHandler.handle(it) }
    }

    private val getHandler: Handler<WorkerResponse> =
        jsonHandler<WorkerResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a worker by ID */
    override fun get(params: WorkerGetParams, requestOptions: RequestOptions): WorkerResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "workers", params.getPathParam(0))
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

    private val healthHandler: Handler<WorkerHealthResponse> =
        jsonHandler<WorkerHealthResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get the health of a worker */
    override fun health(
        params: WorkerHealthParams,
        requestOptions: RequestOptions,
    ): WorkerHealthResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "workers", params.getPathParam(0), "health")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { healthHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val toolsHandler: Handler<WorkerToolsPage.Response> =
        jsonHandler<WorkerToolsPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Returns a page of tools */
    override fun tools(params: WorkerToolsParams, requestOptions: RequestOptions): WorkerToolsPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "workers", params.getPathParam(0), "tools")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { toolsHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
            .let { WorkerToolsPage.of(this, params, it) }
    }
}
