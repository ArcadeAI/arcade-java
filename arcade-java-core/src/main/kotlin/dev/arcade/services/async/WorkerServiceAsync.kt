// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.async

import dev.arcade.core.ClientOptions
import dev.arcade.core.RequestOptions
import dev.arcade.core.http.HttpResponse
import dev.arcade.core.http.HttpResponseFor
import dev.arcade.models.workers.CreateWorkerRequest
import dev.arcade.models.workers.WorkerCreateParams
import dev.arcade.models.workers.WorkerDeleteParams
import dev.arcade.models.workers.WorkerGetParams
import dev.arcade.models.workers.WorkerHealthParams
import dev.arcade.models.workers.WorkerHealthResponse
import dev.arcade.models.workers.WorkerListPageAsync
import dev.arcade.models.workers.WorkerListParams
import dev.arcade.models.workers.WorkerResponse
import dev.arcade.models.workers.WorkerToolsPageAsync
import dev.arcade.models.workers.WorkerToolsParams
import dev.arcade.models.workers.WorkerUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface WorkerServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WorkerServiceAsync

    /** Create a worker */
    fun create(params: WorkerCreateParams): CompletableFuture<WorkerResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: WorkerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WorkerResponse>

    /** @see create */
    fun create(
        createWorkerRequest: CreateWorkerRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WorkerResponse> =
        create(
            WorkerCreateParams.builder().createWorkerRequest(createWorkerRequest).build(),
            requestOptions,
        )

    /** @see create */
    fun create(createWorkerRequest: CreateWorkerRequest): CompletableFuture<WorkerResponse> =
        create(createWorkerRequest, RequestOptions.none())

    /** Update a worker */
    fun update(id: String, params: WorkerUpdateParams): CompletableFuture<WorkerResponse> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: WorkerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WorkerResponse> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: WorkerUpdateParams): CompletableFuture<WorkerResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: WorkerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WorkerResponse>

    /** List all workers with their definitions */
    fun list(): CompletableFuture<WorkerListPageAsync> = list(WorkerListParams.none())

    /** @see list */
    fun list(
        params: WorkerListParams = WorkerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WorkerListPageAsync>

    /** @see list */
    fun list(
        params: WorkerListParams = WorkerListParams.none()
    ): CompletableFuture<WorkerListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<WorkerListPageAsync> =
        list(WorkerListParams.none(), requestOptions)

    /** Delete a worker */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, WorkerDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: WorkerDeleteParams = WorkerDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: WorkerDeleteParams = WorkerDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: WorkerDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: WorkerDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, WorkerDeleteParams.none(), requestOptions)

    /** Get a worker by ID */
    fun get(id: String): CompletableFuture<WorkerResponse> = get(id, WorkerGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: WorkerGetParams = WorkerGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WorkerResponse> = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: WorkerGetParams = WorkerGetParams.none(),
    ): CompletableFuture<WorkerResponse> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: WorkerGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WorkerResponse>

    /** @see get */
    fun get(params: WorkerGetParams): CompletableFuture<WorkerResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<WorkerResponse> =
        get(id, WorkerGetParams.none(), requestOptions)

    /** Get the health of a worker */
    fun health(id: String): CompletableFuture<WorkerHealthResponse> =
        health(id, WorkerHealthParams.none())

    /** @see health */
    fun health(
        id: String,
        params: WorkerHealthParams = WorkerHealthParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WorkerHealthResponse> =
        health(params.toBuilder().id(id).build(), requestOptions)

    /** @see health */
    fun health(
        id: String,
        params: WorkerHealthParams = WorkerHealthParams.none(),
    ): CompletableFuture<WorkerHealthResponse> = health(id, params, RequestOptions.none())

    /** @see health */
    fun health(
        params: WorkerHealthParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WorkerHealthResponse>

    /** @see health */
    fun health(params: WorkerHealthParams): CompletableFuture<WorkerHealthResponse> =
        health(params, RequestOptions.none())

    /** @see health */
    fun health(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WorkerHealthResponse> =
        health(id, WorkerHealthParams.none(), requestOptions)

    /** Returns a page of tools */
    fun tools(id: String): CompletableFuture<WorkerToolsPageAsync> =
        tools(id, WorkerToolsParams.none())

    /** @see tools */
    fun tools(
        id: String,
        params: WorkerToolsParams = WorkerToolsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WorkerToolsPageAsync> =
        tools(params.toBuilder().id(id).build(), requestOptions)

    /** @see tools */
    fun tools(
        id: String,
        params: WorkerToolsParams = WorkerToolsParams.none(),
    ): CompletableFuture<WorkerToolsPageAsync> = tools(id, params, RequestOptions.none())

    /** @see tools */
    fun tools(
        params: WorkerToolsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WorkerToolsPageAsync>

    /** @see tools */
    fun tools(params: WorkerToolsParams): CompletableFuture<WorkerToolsPageAsync> =
        tools(params, RequestOptions.none())

    /** @see tools */
    fun tools(id: String, requestOptions: RequestOptions): CompletableFuture<WorkerToolsPageAsync> =
        tools(id, WorkerToolsParams.none(), requestOptions)

    /**
     * A view of [WorkerServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WorkerServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/workers`, but is otherwise the same as
         * [WorkerServiceAsync.create].
         */
        fun create(params: WorkerCreateParams): CompletableFuture<HttpResponseFor<WorkerResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: WorkerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WorkerResponse>>

        /** @see create */
        fun create(
            createWorkerRequest: CreateWorkerRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WorkerResponse>> =
            create(
                WorkerCreateParams.builder().createWorkerRequest(createWorkerRequest).build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            createWorkerRequest: CreateWorkerRequest
        ): CompletableFuture<HttpResponseFor<WorkerResponse>> =
            create(createWorkerRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /v1/workers/{id}`, but is otherwise the same as
         * [WorkerServiceAsync.update].
         */
        fun update(
            id: String,
            params: WorkerUpdateParams,
        ): CompletableFuture<HttpResponseFor<WorkerResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: WorkerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WorkerResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(params: WorkerUpdateParams): CompletableFuture<HttpResponseFor<WorkerResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: WorkerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WorkerResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/workers`, but is otherwise the same as
         * [WorkerServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<WorkerListPageAsync>> =
            list(WorkerListParams.none())

        /** @see list */
        fun list(
            params: WorkerListParams = WorkerListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WorkerListPageAsync>>

        /** @see list */
        fun list(
            params: WorkerListParams = WorkerListParams.none()
        ): CompletableFuture<HttpResponseFor<WorkerListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<WorkerListPageAsync>> =
            list(WorkerListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/workers/{id}`, but is otherwise the same as
         * [WorkerServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, WorkerDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: WorkerDeleteParams = WorkerDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: WorkerDeleteParams = WorkerDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: WorkerDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: WorkerDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, WorkerDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/workers/{id}`, but is otherwise the same as
         * [WorkerServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<WorkerResponse>> =
            get(id, WorkerGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: WorkerGetParams = WorkerGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WorkerResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: WorkerGetParams = WorkerGetParams.none(),
        ): CompletableFuture<HttpResponseFor<WorkerResponse>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: WorkerGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WorkerResponse>>

        /** @see get */
        fun get(params: WorkerGetParams): CompletableFuture<HttpResponseFor<WorkerResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WorkerResponse>> =
            get(id, WorkerGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/workers/{id}/health`, but is otherwise the same
         * as [WorkerServiceAsync.health].
         */
        fun health(id: String): CompletableFuture<HttpResponseFor<WorkerHealthResponse>> =
            health(id, WorkerHealthParams.none())

        /** @see health */
        fun health(
            id: String,
            params: WorkerHealthParams = WorkerHealthParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WorkerHealthResponse>> =
            health(params.toBuilder().id(id).build(), requestOptions)

        /** @see health */
        fun health(
            id: String,
            params: WorkerHealthParams = WorkerHealthParams.none(),
        ): CompletableFuture<HttpResponseFor<WorkerHealthResponse>> =
            health(id, params, RequestOptions.none())

        /** @see health */
        fun health(
            params: WorkerHealthParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WorkerHealthResponse>>

        /** @see health */
        fun health(
            params: WorkerHealthParams
        ): CompletableFuture<HttpResponseFor<WorkerHealthResponse>> =
            health(params, RequestOptions.none())

        /** @see health */
        fun health(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WorkerHealthResponse>> =
            health(id, WorkerHealthParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/workers/{id}/tools`, but is otherwise the same
         * as [WorkerServiceAsync.tools].
         */
        fun tools(id: String): CompletableFuture<HttpResponseFor<WorkerToolsPageAsync>> =
            tools(id, WorkerToolsParams.none())

        /** @see tools */
        fun tools(
            id: String,
            params: WorkerToolsParams = WorkerToolsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WorkerToolsPageAsync>> =
            tools(params.toBuilder().id(id).build(), requestOptions)

        /** @see tools */
        fun tools(
            id: String,
            params: WorkerToolsParams = WorkerToolsParams.none(),
        ): CompletableFuture<HttpResponseFor<WorkerToolsPageAsync>> =
            tools(id, params, RequestOptions.none())

        /** @see tools */
        fun tools(
            params: WorkerToolsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WorkerToolsPageAsync>>

        /** @see tools */
        fun tools(
            params: WorkerToolsParams
        ): CompletableFuture<HttpResponseFor<WorkerToolsPageAsync>> =
            tools(params, RequestOptions.none())

        /** @see tools */
        fun tools(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WorkerToolsPageAsync>> =
            tools(id, WorkerToolsParams.none(), requestOptions)
    }
}
