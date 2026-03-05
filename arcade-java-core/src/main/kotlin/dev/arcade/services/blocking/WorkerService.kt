// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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
import dev.arcade.models.workers.WorkerListPage
import dev.arcade.models.workers.WorkerListParams
import dev.arcade.models.workers.WorkerResponse
import dev.arcade.models.workers.WorkerToolsPage
import dev.arcade.models.workers.WorkerToolsParams
import dev.arcade.models.workers.WorkerUpdateParams
import java.util.function.Consumer

interface WorkerService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WorkerService

    /** Create a worker */
    fun create(params: WorkerCreateParams): WorkerResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: WorkerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WorkerResponse

    /** @see create */
    fun create(
        createWorkerRequest: CreateWorkerRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WorkerResponse =
        create(
            WorkerCreateParams.builder().createWorkerRequest(createWorkerRequest).build(),
            requestOptions,
        )

    /** @see create */
    fun create(createWorkerRequest: CreateWorkerRequest): WorkerResponse =
        create(createWorkerRequest, RequestOptions.none())

    /** Update a worker */
    fun update(id: String, params: WorkerUpdateParams): WorkerResponse =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: WorkerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WorkerResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: WorkerUpdateParams): WorkerResponse = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: WorkerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WorkerResponse

    /** List all workers with their definitions */
    fun list(): WorkerListPage = list(WorkerListParams.none())

    /** @see list */
    fun list(
        params: WorkerListParams = WorkerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WorkerListPage

    /** @see list */
    fun list(params: WorkerListParams = WorkerListParams.none()): WorkerListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): WorkerListPage =
        list(WorkerListParams.none(), requestOptions)

    /** Delete a worker */
    fun delete(id: String) = delete(id, WorkerDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: WorkerDeleteParams = WorkerDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: WorkerDeleteParams = WorkerDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: WorkerDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: WorkerDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, WorkerDeleteParams.none(), requestOptions)

    /** Get a worker by ID */
    fun get(id: String): WorkerResponse = get(id, WorkerGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: WorkerGetParams = WorkerGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WorkerResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(id: String, params: WorkerGetParams = WorkerGetParams.none()): WorkerResponse =
        get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: WorkerGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WorkerResponse

    /** @see get */
    fun get(params: WorkerGetParams): WorkerResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): WorkerResponse =
        get(id, WorkerGetParams.none(), requestOptions)

    /** Get the health of a worker */
    fun health(id: String): WorkerHealthResponse = health(id, WorkerHealthParams.none())

    /** @see health */
    fun health(
        id: String,
        params: WorkerHealthParams = WorkerHealthParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WorkerHealthResponse = health(params.toBuilder().id(id).build(), requestOptions)

    /** @see health */
    fun health(
        id: String,
        params: WorkerHealthParams = WorkerHealthParams.none(),
    ): WorkerHealthResponse = health(id, params, RequestOptions.none())

    /** @see health */
    fun health(
        params: WorkerHealthParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WorkerHealthResponse

    /** @see health */
    fun health(params: WorkerHealthParams): WorkerHealthResponse =
        health(params, RequestOptions.none())

    /** @see health */
    fun health(id: String, requestOptions: RequestOptions): WorkerHealthResponse =
        health(id, WorkerHealthParams.none(), requestOptions)

    /** Returns a page of tools */
    fun tools(id: String): WorkerToolsPage = tools(id, WorkerToolsParams.none())

    /** @see tools */
    fun tools(
        id: String,
        params: WorkerToolsParams = WorkerToolsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WorkerToolsPage = tools(params.toBuilder().id(id).build(), requestOptions)

    /** @see tools */
    fun tools(id: String, params: WorkerToolsParams = WorkerToolsParams.none()): WorkerToolsPage =
        tools(id, params, RequestOptions.none())

    /** @see tools */
    fun tools(
        params: WorkerToolsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WorkerToolsPage

    /** @see tools */
    fun tools(params: WorkerToolsParams): WorkerToolsPage = tools(params, RequestOptions.none())

    /** @see tools */
    fun tools(id: String, requestOptions: RequestOptions): WorkerToolsPage =
        tools(id, WorkerToolsParams.none(), requestOptions)

    /** A view of [WorkerService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): WorkerService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/workers`, but is otherwise the same as
         * [WorkerService.create].
         */
        @MustBeClosed
        fun create(params: WorkerCreateParams): HttpResponseFor<WorkerResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: WorkerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WorkerResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            createWorkerRequest: CreateWorkerRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WorkerResponse> =
            create(
                WorkerCreateParams.builder().createWorkerRequest(createWorkerRequest).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(createWorkerRequest: CreateWorkerRequest): HttpResponseFor<WorkerResponse> =
            create(createWorkerRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /v1/workers/{id}`, but is otherwise the same as
         * [WorkerService.update].
         */
        @MustBeClosed
        fun update(id: String, params: WorkerUpdateParams): HttpResponseFor<WorkerResponse> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: WorkerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WorkerResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: WorkerUpdateParams): HttpResponseFor<WorkerResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: WorkerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WorkerResponse>

        /**
         * Returns a raw HTTP response for `get /v1/workers`, but is otherwise the same as
         * [WorkerService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<WorkerListPage> = list(WorkerListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: WorkerListParams = WorkerListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WorkerListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: WorkerListParams = WorkerListParams.none()
        ): HttpResponseFor<WorkerListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<WorkerListPage> =
            list(WorkerListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/workers/{id}`, but is otherwise the same as
         * [WorkerService.delete].
         */
        @MustBeClosed fun delete(id: String): HttpResponse = delete(id, WorkerDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: WorkerDeleteParams = WorkerDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: WorkerDeleteParams = WorkerDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: WorkerDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: WorkerDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, WorkerDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/workers/{id}`, but is otherwise the same as
         * [WorkerService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<WorkerResponse> = get(id, WorkerGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: WorkerGetParams = WorkerGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WorkerResponse> = get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: WorkerGetParams = WorkerGetParams.none(),
        ): HttpResponseFor<WorkerResponse> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: WorkerGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WorkerResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: WorkerGetParams): HttpResponseFor<WorkerResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<WorkerResponse> =
            get(id, WorkerGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/workers/{id}/health`, but is otherwise the same
         * as [WorkerService.health].
         */
        @MustBeClosed
        fun health(id: String): HttpResponseFor<WorkerHealthResponse> =
            health(id, WorkerHealthParams.none())

        /** @see health */
        @MustBeClosed
        fun health(
            id: String,
            params: WorkerHealthParams = WorkerHealthParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WorkerHealthResponse> =
            health(params.toBuilder().id(id).build(), requestOptions)

        /** @see health */
        @MustBeClosed
        fun health(
            id: String,
            params: WorkerHealthParams = WorkerHealthParams.none(),
        ): HttpResponseFor<WorkerHealthResponse> = health(id, params, RequestOptions.none())

        /** @see health */
        @MustBeClosed
        fun health(
            params: WorkerHealthParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WorkerHealthResponse>

        /** @see health */
        @MustBeClosed
        fun health(params: WorkerHealthParams): HttpResponseFor<WorkerHealthResponse> =
            health(params, RequestOptions.none())

        /** @see health */
        @MustBeClosed
        fun health(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WorkerHealthResponse> =
            health(id, WorkerHealthParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/workers/{id}/tools`, but is otherwise the same
         * as [WorkerService.tools].
         */
        @MustBeClosed
        fun tools(id: String): HttpResponseFor<WorkerToolsPage> =
            tools(id, WorkerToolsParams.none())

        /** @see tools */
        @MustBeClosed
        fun tools(
            id: String,
            params: WorkerToolsParams = WorkerToolsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WorkerToolsPage> =
            tools(params.toBuilder().id(id).build(), requestOptions)

        /** @see tools */
        @MustBeClosed
        fun tools(
            id: String,
            params: WorkerToolsParams = WorkerToolsParams.none(),
        ): HttpResponseFor<WorkerToolsPage> = tools(id, params, RequestOptions.none())

        /** @see tools */
        @MustBeClosed
        fun tools(
            params: WorkerToolsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WorkerToolsPage>

        /** @see tools */
        @MustBeClosed
        fun tools(params: WorkerToolsParams): HttpResponseFor<WorkerToolsPage> =
            tools(params, RequestOptions.none())

        /** @see tools */
        @MustBeClosed
        fun tools(id: String, requestOptions: RequestOptions): HttpResponseFor<WorkerToolsPage> =
            tools(id, WorkerToolsParams.none(), requestOptions)
    }
}
