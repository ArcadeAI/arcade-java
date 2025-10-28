// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.services.async

import com.arcade_engine.api.core.ClientOptions
import com.arcade_engine.api.core.RequestOptions
import com.arcade_engine.api.core.handlers.errorHandler
import com.arcade_engine.api.core.handlers.jsonHandler
import com.arcade_engine.api.core.handlers.withErrorHandler
import com.arcade_engine.api.core.http.HttpMethod
import com.arcade_engine.api.core.http.HttpRequest
import com.arcade_engine.api.core.http.HttpResponse.Handler
import com.arcade_engine.api.core.json
import com.arcade_engine.api.core.prepareAsync
import com.arcade_engine.api.errors.ArcadeError
import com.arcade_engine.api.models.AuthorizationResponse
import com.arcade_engine.api.models.ExecuteToolResponse
import com.arcade_engine.api.models.ToolAuthorizeParams
import com.arcade_engine.api.models.ToolDefinition
import com.arcade_engine.api.models.ToolExecuteParams
import com.arcade_engine.api.models.ToolGetParams
import com.arcade_engine.api.models.ToolListPageAsync
import com.arcade_engine.api.models.ToolListParams
import com.arcade_engine.api.services.async.tools.FormattedServiceAsync
import com.arcade_engine.api.services.async.tools.FormattedServiceAsyncImpl
import com.arcade_engine.api.services.async.tools.ScheduledServiceAsync
import com.arcade_engine.api.services.async.tools.ScheduledServiceAsyncImpl
import java.util.concurrent.CompletableFuture

class ToolServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ToolServiceAsync {

    private val errorHandler: Handler<ArcadeError> = errorHandler(clientOptions.jsonMapper)

    private val scheduled: ScheduledServiceAsync by lazy {
        ScheduledServiceAsyncImpl(clientOptions)
    }

    private val formatted: FormattedServiceAsync by lazy {
        FormattedServiceAsyncImpl(clientOptions)
    }

    override fun scheduled(): ScheduledServiceAsync = scheduled

    override fun formatted(): FormattedServiceAsync = formatted

    private val listHandler: Handler<ToolListPageAsync.Response> =
        jsonHandler<ToolListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Returns a page of tools from the engine configuration, optionally filtered by toolkit */
    override fun list(
        params: ToolListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ToolListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "tools")
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
                    .let { ToolListPageAsync.of(this, params, it) }
            }
    }

    private val authorizeHandler: Handler<AuthorizationResponse> =
        jsonHandler<AuthorizationResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Authorizes a user for a specific tool by name */
    override fun authorize(
        params: ToolAuthorizeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AuthorizationResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "tools", "authorize")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { authorizeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val executeHandler: Handler<ExecuteToolResponse> =
        jsonHandler<ExecuteToolResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Executes a tool by name and arguments */
    override fun execute(
        params: ToolExecuteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExecuteToolResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "tools", "execute")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { executeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val getHandler: Handler<ToolDefinition> =
        jsonHandler<ToolDefinition>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Returns the arcade tool specification for a specific tool */
    override fun get(
        params: ToolGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ToolDefinition> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "tools", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { getHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}
