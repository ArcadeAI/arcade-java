// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.async.tools

import dev.arcade.core.ClientOptions
import dev.arcade.core.RequestOptions
import dev.arcade.core.http.HttpResponseFor
import dev.arcade.models.tools.scheduled.ScheduledGetParams
import dev.arcade.models.tools.scheduled.ScheduledGetResponse
import dev.arcade.models.tools.scheduled.ScheduledListPageAsync
import dev.arcade.models.tools.scheduled.ScheduledListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ScheduledServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScheduledServiceAsync

    /** Returns a page of scheduled tool executions */
    fun list(): CompletableFuture<ScheduledListPageAsync> = list(ScheduledListParams.none())

    /** @see list */
    fun list(
        params: ScheduledListParams = ScheduledListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduledListPageAsync>

    /** @see list */
    fun list(
        params: ScheduledListParams = ScheduledListParams.none()
    ): CompletableFuture<ScheduledListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ScheduledListPageAsync> =
        list(ScheduledListParams.none(), requestOptions)

    /** Returns the details for a specific scheduled tool execution */
    fun get(id: String): CompletableFuture<ScheduledGetResponse> =
        get(id, ScheduledGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: ScheduledGetParams = ScheduledGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduledGetResponse> =
        get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: ScheduledGetParams = ScheduledGetParams.none(),
    ): CompletableFuture<ScheduledGetResponse> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ScheduledGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduledGetResponse>

    /** @see get */
    fun get(params: ScheduledGetParams): CompletableFuture<ScheduledGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<ScheduledGetResponse> =
        get(id, ScheduledGetParams.none(), requestOptions)

    /**
     * A view of [ScheduledServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ScheduledServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/scheduled_tools`, but is otherwise the same as
         * [ScheduledServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ScheduledListPageAsync>> =
            list(ScheduledListParams.none())

        /** @see list */
        fun list(
            params: ScheduledListParams = ScheduledListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScheduledListPageAsync>>

        /** @see list */
        fun list(
            params: ScheduledListParams = ScheduledListParams.none()
        ): CompletableFuture<HttpResponseFor<ScheduledListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ScheduledListPageAsync>> =
            list(ScheduledListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/scheduled_tools/{id}`, but is otherwise the same
         * as [ScheduledServiceAsync.get].
         */
        fun get(id: String): CompletableFuture<HttpResponseFor<ScheduledGetResponse>> =
            get(id, ScheduledGetParams.none())

        /** @see get */
        fun get(
            id: String,
            params: ScheduledGetParams = ScheduledGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScheduledGetResponse>> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: String,
            params: ScheduledGetParams = ScheduledGetParams.none(),
        ): CompletableFuture<HttpResponseFor<ScheduledGetResponse>> =
            get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: ScheduledGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScheduledGetResponse>>

        /** @see get */
        fun get(
            params: ScheduledGetParams
        ): CompletableFuture<HttpResponseFor<ScheduledGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ScheduledGetResponse>> =
            get(id, ScheduledGetParams.none(), requestOptions)
    }
}
