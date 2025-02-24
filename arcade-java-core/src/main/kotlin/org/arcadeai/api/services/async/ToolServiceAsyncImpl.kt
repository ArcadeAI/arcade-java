// File generated from our OpenAPI spec by Stainless.

package org.arcadeai.api.services.async

import java.util.concurrent.CompletableFuture
import org.arcadeai.api.core.ClientOptions
import org.arcadeai.api.core.RequestOptions
import org.arcadeai.api.core.handlers.errorHandler
import org.arcadeai.api.core.handlers.jsonHandler
import org.arcadeai.api.core.handlers.withErrorHandler
import org.arcadeai.api.core.http.HttpMethod
import org.arcadeai.api.core.http.HttpRequest
import org.arcadeai.api.core.http.HttpResponse.Handler
import org.arcadeai.api.core.json
import org.arcadeai.api.core.prepareAsync
import org.arcadeai.api.errors.ArcadeError
import org.arcadeai.api.models.AuthorizationResponse
import org.arcadeai.api.models.ExecuteToolResponse
import org.arcadeai.api.models.ToolAuthorizeParams
import org.arcadeai.api.models.ToolDefinition
import org.arcadeai.api.models.ToolExecuteParams
import org.arcadeai.api.models.ToolGetParams
import org.arcadeai.api.models.ToolListPageAsync
import org.arcadeai.api.models.ToolListParams
import org.arcadeai.api.services.async.tools.FormattedServiceAsync
import org.arcadeai.api.services.async.tools.FormattedServiceAsyncImpl
import org.arcadeai.api.services.async.tools.ScheduledServiceAsync
import org.arcadeai.api.services.async.tools.ScheduledServiceAsyncImpl

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
