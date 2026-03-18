// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.async

import dev.arcade.core.ClientOptions
import dev.arcade.core.RequestOptions
import dev.arcade.core.http.HttpResponseFor
import dev.arcade.models.AuthorizationResponse
import dev.arcade.models.tools.AuthorizeToolRequest
import dev.arcade.models.tools.ExecuteToolRequest
import dev.arcade.models.tools.ExecuteToolResponse
import dev.arcade.models.tools.ToolAuthorizeParams
import dev.arcade.models.tools.ToolDefinition
import dev.arcade.models.tools.ToolExecuteParams
import dev.arcade.models.tools.ToolGetParams
import dev.arcade.models.tools.ToolListPageAsync
import dev.arcade.models.tools.ToolListParams
import dev.arcade.services.async.tools.FormattedServiceAsync
import dev.arcade.services.async.tools.ScheduledServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ToolServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ToolServiceAsync

    fun scheduled(): ScheduledServiceAsync

    fun formatted(): FormattedServiceAsync

    /**
     * Returns a page of tools from the engine configuration, optionally filtered by toolkit and/or
     * metadata
     */
    fun list(): CompletableFuture<ToolListPageAsync> = list(ToolListParams.none())

    /** @see list */
    fun list(
        params: ToolListParams = ToolListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ToolListPageAsync>

    /** @see list */
    fun list(params: ToolListParams = ToolListParams.none()): CompletableFuture<ToolListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ToolListPageAsync> =
        list(ToolListParams.none(), requestOptions)

    /** Authorizes a user for a specific tool by name */
    fun authorize(params: ToolAuthorizeParams): CompletableFuture<AuthorizationResponse> =
        authorize(params, RequestOptions.none())

    /** @see authorize */
    fun authorize(
        params: ToolAuthorizeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuthorizationResponse>

    /** @see authorize */
    fun authorize(
        authorizeToolRequest: AuthorizeToolRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuthorizationResponse> =
        authorize(
            ToolAuthorizeParams.builder().authorizeToolRequest(authorizeToolRequest).build(),
            requestOptions,
        )

    /** @see authorize */
    fun authorize(
        authorizeToolRequest: AuthorizeToolRequest
    ): CompletableFuture<AuthorizationResponse> =
        authorize(authorizeToolRequest, RequestOptions.none())

    /** Executes a tool by name and arguments */
    fun execute(params: ToolExecuteParams): CompletableFuture<ExecuteToolResponse> =
        execute(params, RequestOptions.none())

    /** @see execute */
    fun execute(
        params: ToolExecuteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExecuteToolResponse>

    /** @see execute */
    fun execute(
        executeToolRequest: ExecuteToolRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExecuteToolResponse> =
        execute(
            ToolExecuteParams.builder().executeToolRequest(executeToolRequest).build(),
            requestOptions,
        )

    /** @see execute */
    fun execute(executeToolRequest: ExecuteToolRequest): CompletableFuture<ExecuteToolResponse> =
        execute(executeToolRequest, RequestOptions.none())

    /** Returns the arcade tool specification for a specific tool */
    fun get(name: String): CompletableFuture<ToolDefinition> = get(name, ToolGetParams.none())

    /** @see get */
    fun get(
        name: String,
        params: ToolGetParams = ToolGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ToolDefinition> =
        get(params.toBuilder().name(name).build(), requestOptions)

    /** @see get */
    fun get(
        name: String,
        params: ToolGetParams = ToolGetParams.none(),
    ): CompletableFuture<ToolDefinition> = get(name, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ToolGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ToolDefinition>

    /** @see get */
    fun get(params: ToolGetParams): CompletableFuture<ToolDefinition> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(name: String, requestOptions: RequestOptions): CompletableFuture<ToolDefinition> =
        get(name, ToolGetParams.none(), requestOptions)

    /** A view of [ToolServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ToolServiceAsync.WithRawResponse

        fun scheduled(): ScheduledServiceAsync.WithRawResponse

        fun formatted(): FormattedServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/tools`, but is otherwise the same as
         * [ToolServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ToolListPageAsync>> =
            list(ToolListParams.none())

        /** @see list */
        fun list(
            params: ToolListParams = ToolListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ToolListPageAsync>>

        /** @see list */
        fun list(
            params: ToolListParams = ToolListParams.none()
        ): CompletableFuture<HttpResponseFor<ToolListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ToolListPageAsync>> =
            list(ToolListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/tools/authorize`, but is otherwise the same as
         * [ToolServiceAsync.authorize].
         */
        fun authorize(
            params: ToolAuthorizeParams
        ): CompletableFuture<HttpResponseFor<AuthorizationResponse>> =
            authorize(params, RequestOptions.none())

        /** @see authorize */
        fun authorize(
            params: ToolAuthorizeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AuthorizationResponse>>

        /** @see authorize */
        fun authorize(
            authorizeToolRequest: AuthorizeToolRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AuthorizationResponse>> =
            authorize(
                ToolAuthorizeParams.builder().authorizeToolRequest(authorizeToolRequest).build(),
                requestOptions,
            )

        /** @see authorize */
        fun authorize(
            authorizeToolRequest: AuthorizeToolRequest
        ): CompletableFuture<HttpResponseFor<AuthorizationResponse>> =
            authorize(authorizeToolRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /v1/tools/execute`, but is otherwise the same as
         * [ToolServiceAsync.execute].
         */
        fun execute(
            params: ToolExecuteParams
        ): CompletableFuture<HttpResponseFor<ExecuteToolResponse>> =
            execute(params, RequestOptions.none())

        /** @see execute */
        fun execute(
            params: ToolExecuteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExecuteToolResponse>>

        /** @see execute */
        fun execute(
            executeToolRequest: ExecuteToolRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExecuteToolResponse>> =
            execute(
                ToolExecuteParams.builder().executeToolRequest(executeToolRequest).build(),
                requestOptions,
            )

        /** @see execute */
        fun execute(
            executeToolRequest: ExecuteToolRequest
        ): CompletableFuture<HttpResponseFor<ExecuteToolResponse>> =
            execute(executeToolRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /v1/tools/{name}`, but is otherwise the same as
         * [ToolServiceAsync.get].
         */
        fun get(name: String): CompletableFuture<HttpResponseFor<ToolDefinition>> =
            get(name, ToolGetParams.none())

        /** @see get */
        fun get(
            name: String,
            params: ToolGetParams = ToolGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ToolDefinition>> =
            get(params.toBuilder().name(name).build(), requestOptions)

        /** @see get */
        fun get(
            name: String,
            params: ToolGetParams = ToolGetParams.none(),
        ): CompletableFuture<HttpResponseFor<ToolDefinition>> =
            get(name, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: ToolGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ToolDefinition>>

        /** @see get */
        fun get(params: ToolGetParams): CompletableFuture<HttpResponseFor<ToolDefinition>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            name: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ToolDefinition>> =
            get(name, ToolGetParams.none(), requestOptions)
    }
}
