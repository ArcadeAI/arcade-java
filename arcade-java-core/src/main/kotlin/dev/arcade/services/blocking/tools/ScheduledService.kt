// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.blocking.tools

import com.google.errorprone.annotations.MustBeClosed
import dev.arcade.core.ClientOptions
import dev.arcade.core.RequestOptions
import dev.arcade.core.http.HttpResponseFor
import dev.arcade.models.tools.scheduled.ScheduledGetParams
import dev.arcade.models.tools.scheduled.ScheduledGetResponse
import dev.arcade.models.tools.scheduled.ScheduledListPage
import dev.arcade.models.tools.scheduled.ScheduledListParams
import java.util.function.Consumer

interface ScheduledService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScheduledService

    /** Returns a page of scheduled tool executions */
    fun list(): ScheduledListPage = list(ScheduledListParams.none())

    /** @see list */
    fun list(
        params: ScheduledListParams = ScheduledListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduledListPage

    /** @see list */
    fun list(params: ScheduledListParams = ScheduledListParams.none()): ScheduledListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ScheduledListPage =
        list(ScheduledListParams.none(), requestOptions)

    /** Returns the details for a specific scheduled tool execution */
    fun get(id: String): ScheduledGetResponse = get(id, ScheduledGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: ScheduledGetParams = ScheduledGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduledGetResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: ScheduledGetParams = ScheduledGetParams.none(),
    ): ScheduledGetResponse = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ScheduledGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduledGetResponse

    /** @see get */
    fun get(params: ScheduledGetParams): ScheduledGetResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): ScheduledGetResponse =
        get(id, ScheduledGetParams.none(), requestOptions)

    /** A view of [ScheduledService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScheduledService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/scheduled_tools`, but is otherwise the same as
         * [ScheduledService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ScheduledListPage> = list(ScheduledListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ScheduledListParams = ScheduledListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduledListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ScheduledListParams = ScheduledListParams.none()
        ): HttpResponseFor<ScheduledListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ScheduledListPage> =
            list(ScheduledListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/scheduled_tools/{id}`, but is otherwise the same
         * as [ScheduledService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<ScheduledGetResponse> =
            get(id, ScheduledGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: ScheduledGetParams = ScheduledGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduledGetResponse> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: ScheduledGetParams = ScheduledGetParams.none(),
        ): HttpResponseFor<ScheduledGetResponse> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: ScheduledGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduledGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: ScheduledGetParams): HttpResponseFor<ScheduledGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(id: String, requestOptions: RequestOptions): HttpResponseFor<ScheduledGetResponse> =
            get(id, ScheduledGetParams.none(), requestOptions)
    }
}
