// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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
import dev.arcade.models.tools.ToolListPage
import dev.arcade.models.tools.ToolListParams
import dev.arcade.services.blocking.tools.FormattedService
import dev.arcade.services.blocking.tools.ScheduledService
import java.util.function.Consumer

interface ToolService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ToolService

    fun scheduled(): ScheduledService

    fun formatted(): FormattedService

    /** Returns a page of tools from the engine configuration, optionally filtered by toolkit */
    fun list(): ToolListPage = list(ToolListParams.none())

    /** @see list */
    fun list(
        params: ToolListParams = ToolListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolListPage

    /** @see list */
    fun list(params: ToolListParams = ToolListParams.none()): ToolListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ToolListPage =
        list(ToolListParams.none(), requestOptions)

    /** Authorizes a user for a specific tool by name */
    fun authorize(params: ToolAuthorizeParams): AuthorizationResponse =
        authorize(params, RequestOptions.none())

    /** @see authorize */
    fun authorize(
        params: ToolAuthorizeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthorizationResponse

    /** @see authorize */
    fun authorize(
        authorizeToolRequest: AuthorizeToolRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthorizationResponse =
        authorize(
            ToolAuthorizeParams.builder().authorizeToolRequest(authorizeToolRequest).build(),
            requestOptions,
        )

    /** @see authorize */
    fun authorize(authorizeToolRequest: AuthorizeToolRequest): AuthorizationResponse =
        authorize(authorizeToolRequest, RequestOptions.none())

    /** Executes a tool by name and arguments */
    fun execute(params: ToolExecuteParams): ExecuteToolResponse =
        execute(params, RequestOptions.none())

    /** @see execute */
    fun execute(
        params: ToolExecuteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExecuteToolResponse

    /** @see execute */
    fun execute(
        executeToolRequest: ExecuteToolRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExecuteToolResponse =
        execute(
            ToolExecuteParams.builder().executeToolRequest(executeToolRequest).build(),
            requestOptions,
        )

    /** @see execute */
    fun execute(executeToolRequest: ExecuteToolRequest): ExecuteToolResponse =
        execute(executeToolRequest, RequestOptions.none())

    /** Returns the arcade tool specification for a specific tool */
    fun get(name: String): ToolDefinition = get(name, ToolGetParams.none())

    /** @see get */
    fun get(
        name: String,
        params: ToolGetParams = ToolGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolDefinition = get(params.toBuilder().name(name).build(), requestOptions)

    /** @see get */
    fun get(name: String, params: ToolGetParams = ToolGetParams.none()): ToolDefinition =
        get(name, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ToolGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolDefinition

    /** @see get */
    fun get(params: ToolGetParams): ToolDefinition = get(params, RequestOptions.none())

    /** @see get */
    fun get(name: String, requestOptions: RequestOptions): ToolDefinition =
        get(name, ToolGetParams.none(), requestOptions)

    /** A view of [ToolService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ToolService.WithRawResponse

        fun scheduled(): ScheduledService.WithRawResponse

        fun formatted(): FormattedService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/tools`, but is otherwise the same as
         * [ToolService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<ToolListPage> = list(ToolListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ToolListParams = ToolListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ToolListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: ToolListParams = ToolListParams.none()): HttpResponseFor<ToolListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ToolListPage> =
            list(ToolListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/tools/authorize`, but is otherwise the same as
         * [ToolService.authorize].
         */
        @MustBeClosed
        fun authorize(params: ToolAuthorizeParams): HttpResponseFor<AuthorizationResponse> =
            authorize(params, RequestOptions.none())

        /** @see authorize */
        @MustBeClosed
        fun authorize(
            params: ToolAuthorizeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthorizationResponse>

        /** @see authorize */
        @MustBeClosed
        fun authorize(
            authorizeToolRequest: AuthorizeToolRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthorizationResponse> =
            authorize(
                ToolAuthorizeParams.builder().authorizeToolRequest(authorizeToolRequest).build(),
                requestOptions,
            )

        /** @see authorize */
        @MustBeClosed
        fun authorize(
            authorizeToolRequest: AuthorizeToolRequest
        ): HttpResponseFor<AuthorizationResponse> =
            authorize(authorizeToolRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /v1/tools/execute`, but is otherwise the same as
         * [ToolService.execute].
         */
        @MustBeClosed
        fun execute(params: ToolExecuteParams): HttpResponseFor<ExecuteToolResponse> =
            execute(params, RequestOptions.none())

        /** @see execute */
        @MustBeClosed
        fun execute(
            params: ToolExecuteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExecuteToolResponse>

        /** @see execute */
        @MustBeClosed
        fun execute(
            executeToolRequest: ExecuteToolRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExecuteToolResponse> =
            execute(
                ToolExecuteParams.builder().executeToolRequest(executeToolRequest).build(),
                requestOptions,
            )

        /** @see execute */
        @MustBeClosed
        fun execute(executeToolRequest: ExecuteToolRequest): HttpResponseFor<ExecuteToolResponse> =
            execute(executeToolRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /v1/tools/{name}`, but is otherwise the same as
         * [ToolService.get].
         */
        @MustBeClosed
        fun get(name: String): HttpResponseFor<ToolDefinition> = get(name, ToolGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            name: String,
            params: ToolGetParams = ToolGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ToolDefinition> =
            get(params.toBuilder().name(name).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            name: String,
            params: ToolGetParams = ToolGetParams.none(),
        ): HttpResponseFor<ToolDefinition> = get(name, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: ToolGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ToolDefinition>

        /** @see get */
        @MustBeClosed
        fun get(params: ToolGetParams): HttpResponseFor<ToolDefinition> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(name: String, requestOptions: RequestOptions): HttpResponseFor<ToolDefinition> =
            get(name, ToolGetParams.none(), requestOptions)
    }
}
