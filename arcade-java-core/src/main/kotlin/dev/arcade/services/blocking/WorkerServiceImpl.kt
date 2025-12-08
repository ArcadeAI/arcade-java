// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.blocking

import dev.arcade.core.ClientOptions
import dev.arcade.core.RequestOptions
import dev.arcade.core.handlers.emptyHandler
import dev.arcade.core.handlers.errorHandler
import dev.arcade.core.handlers.jsonHandler
import dev.arcade.core.handlers.withErrorHandler
import dev.arcade.core.http.HttpMethod
import dev.arcade.core.http.HttpRequest
import dev.arcade.core.http.HttpResponse.Handler
import dev.arcade.core.json
import dev.arcade.core.prepare
import dev.arcade.errors.ArcadeError
import dev.arcade.models.WorkerCreateParams
import dev.arcade.models.WorkerDeleteParams
import dev.arcade.models.WorkerGetParams
import dev.arcade.models.WorkerHealthParams
import dev.arcade.models.WorkerHealthResponse
import dev.arcade.models.WorkerListPage
import dev.arcade.models.WorkerListParams
import dev.arcade.models.WorkerResponse
import dev.arcade.models.WorkerToolsPage
import dev.arcade.models.WorkerToolsParams
import dev.arcade.models.WorkerUpdateParams

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
