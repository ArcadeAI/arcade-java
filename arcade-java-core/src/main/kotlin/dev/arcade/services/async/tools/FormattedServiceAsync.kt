// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.async.tools

import dev.arcade.core.ClientOptions
import dev.arcade.core.RequestOptions
import dev.arcade.core.http.HttpResponseFor
import dev.arcade.models.tools.formatted.FormattedGetParams
import dev.arcade.models.tools.formatted.FormattedGetResponse
import dev.arcade.models.tools.formatted.FormattedListPageAsync
import dev.arcade.models.tools.formatted.FormattedListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FormattedServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FormattedServiceAsync

    /**
     * Returns a page of tools from the engine configuration, optionally filtered by toolkit,
     * formatted for a specific provider
     */
    fun list(): CompletableFuture<FormattedListPageAsync> = list(FormattedListParams.none())

    /** @see list */
    fun list(
        params: FormattedListParams = FormattedListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FormattedListPageAsync>

    /** @see list */
    fun list(
        params: FormattedListParams = FormattedListParams.none()
    ): CompletableFuture<FormattedListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<FormattedListPageAsync> =
        list(FormattedListParams.none(), requestOptions)

    /** Returns the formatted tool specification for a specific tool, given a provider */
    fun get(name: String): CompletableFuture<FormattedGetResponse> =
        get(name, FormattedGetParams.none())

    /** @see get */
    fun get(
        name: String,
        params: FormattedGetParams = FormattedGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FormattedGetResponse> =
        get(params.toBuilder().name(name).build(), requestOptions)

    /** @see get */
    fun get(
        name: String,
        params: FormattedGetParams = FormattedGetParams.none(),
    ): CompletableFuture<FormattedGetResponse> = get(name, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: FormattedGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FormattedGetResponse>

    /** @see get */
    fun get(params: FormattedGetParams): CompletableFuture<FormattedGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(name: String, requestOptions: RequestOptions): CompletableFuture<FormattedGetResponse> =
        get(name, FormattedGetParams.none(), requestOptions)

    /**
     * A view of [FormattedServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FormattedServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/formatted_tools`, but is otherwise the same as
         * [FormattedServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<FormattedListPageAsync>> =
            list(FormattedListParams.none())

        /** @see list */
        fun list(
            params: FormattedListParams = FormattedListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FormattedListPageAsync>>

        /** @see list */
        fun list(
            params: FormattedListParams = FormattedListParams.none()
        ): CompletableFuture<HttpResponseFor<FormattedListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<FormattedListPageAsync>> =
            list(FormattedListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/formatted_tools/{name}`, but is otherwise the
         * same as [FormattedServiceAsync.get].
         */
        fun get(name: String): CompletableFuture<HttpResponseFor<FormattedGetResponse>> =
            get(name, FormattedGetParams.none())

        /** @see get */
        fun get(
            name: String,
            params: FormattedGetParams = FormattedGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FormattedGetResponse>> =
            get(params.toBuilder().name(name).build(), requestOptions)

        /** @see get */
        fun get(
            name: String,
            params: FormattedGetParams = FormattedGetParams.none(),
        ): CompletableFuture<HttpResponseFor<FormattedGetResponse>> =
            get(name, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: FormattedGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FormattedGetResponse>>

        /** @see get */
        fun get(
            params: FormattedGetParams
        ): CompletableFuture<HttpResponseFor<FormattedGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            name: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FormattedGetResponse>> =
            get(name, FormattedGetParams.none(), requestOptions)
    }
}
