// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.blocking.tools

import com.google.errorprone.annotations.MustBeClosed
import dev.arcade.core.ClientOptions
import dev.arcade.core.RequestOptions
import dev.arcade.core.http.HttpResponseFor
import dev.arcade.models.tools.formatted.FormattedGetParams
import dev.arcade.models.tools.formatted.FormattedGetResponse
import dev.arcade.models.tools.formatted.FormattedListPage
import dev.arcade.models.tools.formatted.FormattedListParams
import java.util.function.Consumer

interface FormattedService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FormattedService

    /**
     * Returns a page of tools from the engine configuration, optionally filtered by toolkit,
     * formatted for a specific provider
     */
    fun list(): FormattedListPage = list(FormattedListParams.none())

    /** @see list */
    fun list(
        params: FormattedListParams = FormattedListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FormattedListPage

    /** @see list */
    fun list(params: FormattedListParams = FormattedListParams.none()): FormattedListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): FormattedListPage =
        list(FormattedListParams.none(), requestOptions)

    /** Returns the formatted tool specification for a specific tool, given a provider */
    fun get(name: String): FormattedGetResponse = get(name, FormattedGetParams.none())

    /** @see get */
    fun get(
        name: String,
        params: FormattedGetParams = FormattedGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FormattedGetResponse = get(params.toBuilder().name(name).build(), requestOptions)

    /** @see get */
    fun get(
        name: String,
        params: FormattedGetParams = FormattedGetParams.none(),
    ): FormattedGetResponse = get(name, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: FormattedGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FormattedGetResponse

    /** @see get */
    fun get(params: FormattedGetParams): FormattedGetResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(name: String, requestOptions: RequestOptions): FormattedGetResponse =
        get(name, FormattedGetParams.none(), requestOptions)

    /** A view of [FormattedService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FormattedService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/formatted_tools`, but is otherwise the same as
         * [FormattedService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<FormattedListPage> = list(FormattedListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: FormattedListParams = FormattedListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FormattedListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: FormattedListParams = FormattedListParams.none()
        ): HttpResponseFor<FormattedListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<FormattedListPage> =
            list(FormattedListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/formatted_tools/{name}`, but is otherwise the
         * same as [FormattedService.get].
         */
        @MustBeClosed
        fun get(name: String): HttpResponseFor<FormattedGetResponse> =
            get(name, FormattedGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            name: String,
            params: FormattedGetParams = FormattedGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FormattedGetResponse> =
            get(params.toBuilder().name(name).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            name: String,
            params: FormattedGetParams = FormattedGetParams.none(),
        ): HttpResponseFor<FormattedGetResponse> = get(name, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: FormattedGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FormattedGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: FormattedGetParams): HttpResponseFor<FormattedGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            name: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FormattedGetResponse> =
            get(name, FormattedGetParams.none(), requestOptions)
    }
}
