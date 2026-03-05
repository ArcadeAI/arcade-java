// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.async

import dev.arcade.core.ClientOptions
import dev.arcade.core.RequestOptions
import dev.arcade.core.checkRequired
import dev.arcade.core.handlers.emptyHandler
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
import dev.arcade.models.workers.WorkerCreateParams
import dev.arcade.models.workers.WorkerDeleteParams
import dev.arcade.models.workers.WorkerGetParams
import dev.arcade.models.workers.WorkerHealthParams
import dev.arcade.models.workers.WorkerHealthResponse
import dev.arcade.models.workers.WorkerListPageAsync
import dev.arcade.models.workers.WorkerListPageResponse
import dev.arcade.models.workers.WorkerListParams
import dev.arcade.models.workers.WorkerResponse
import dev.arcade.models.workers.WorkerToolsPageAsync
import dev.arcade.models.workers.WorkerToolsPageResponse
import dev.arcade.models.workers.WorkerToolsParams
import dev.arcade.models.workers.WorkerUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class WorkerServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WorkerServiceAsync {

    private val withRawResponse: WorkerServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WorkerServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WorkerServiceAsync =
        WorkerServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: WorkerCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WorkerResponse> =
        // post /v1/workers
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: WorkerUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WorkerResponse> =
        // patch /v1/workers/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: WorkerListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WorkerListPageAsync> =
        // get /v1/workers
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: WorkerDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /v1/workers/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun get(
        params: WorkerGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WorkerResponse> =
        // get /v1/workers/{id}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun health(
        params: WorkerHealthParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WorkerHealthResponse> =
        // get /v1/workers/{id}/health
        withRawResponse().health(params, requestOptions).thenApply { it.parse() }

    override fun tools(
        params: WorkerToolsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WorkerToolsPageAsync> =
        // get /v1/workers/{id}/tools
        withRawResponse().tools(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WorkerServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WorkerServiceAsync.WithRawResponse =
            WorkerServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<WorkerResponse> =
            jsonHandler<WorkerResponse>(clientOptions.jsonMapper)

        override fun create(
            params: WorkerCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WorkerResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "workers")
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

        private val updateHandler: Handler<WorkerResponse> =
            jsonHandler<WorkerResponse>(clientOptions.jsonMapper)

        override fun update(
            params: WorkerUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WorkerResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "workers", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<WorkerListPageResponse> =
            jsonHandler<WorkerListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: WorkerListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WorkerListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "workers")
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
                            .let {
                                WorkerListPageAsync.builder()
                                    .service(WorkerServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: WorkerDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "workers", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val getHandler: Handler<WorkerResponse> =
            jsonHandler<WorkerResponse>(clientOptions.jsonMapper)

        override fun get(
            params: WorkerGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WorkerResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "workers", params._pathParam(0))
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

        private val healthHandler: Handler<WorkerHealthResponse> =
            jsonHandler<WorkerHealthResponse>(clientOptions.jsonMapper)

        override fun health(
            params: WorkerHealthParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WorkerHealthResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "workers", params._pathParam(0), "health")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { healthHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val toolsHandler: Handler<WorkerToolsPageResponse> =
            jsonHandler<WorkerToolsPageResponse>(clientOptions.jsonMapper)

        override fun tools(
            params: WorkerToolsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WorkerToolsPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "workers", params._pathParam(0), "tools")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { toolsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                WorkerToolsPageAsync.builder()
                                    .service(WorkerServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
