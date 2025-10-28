// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.services.async.tools

import com.arcade_engine.api.core.ClientOptions
import com.arcade_engine.api.core.RequestOptions
import com.arcade_engine.api.core.handlers.errorHandler
import com.arcade_engine.api.core.handlers.jsonHandler
import com.arcade_engine.api.core.handlers.withErrorHandler
import com.arcade_engine.api.core.http.HttpMethod
import com.arcade_engine.api.core.http.HttpRequest
import com.arcade_engine.api.core.http.HttpResponse.Handler
import com.arcade_engine.api.core.prepareAsync
import com.arcade_engine.api.errors.ArcadeError
import com.arcade_engine.api.models.ToolScheduledGetParams
import com.arcade_engine.api.models.ToolScheduledGetResponse
import com.arcade_engine.api.models.ToolScheduledListPageAsync
import com.arcade_engine.api.models.ToolScheduledListParams
import java.util.concurrent.CompletableFuture

class ScheduledServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ScheduledServiceAsync {

    private val errorHandler: Handler<ArcadeError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<ToolScheduledListPageAsync.Response> =
        jsonHandler<ToolScheduledListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Returns a page of scheduled tool executions */
    override fun list(
        params: ToolScheduledListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ToolScheduledListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "scheduled_tools")
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
                    .let { ToolScheduledListPageAsync.of(this, params, it) }
            }
    }

    private val getHandler: Handler<ToolScheduledGetResponse> =
        jsonHandler<ToolScheduledGetResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Returns the details for a specific scheduled tool execution */
    override fun get(
        params: ToolScheduledGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ToolScheduledGetResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "scheduled_tools", params.getPathParam(0))
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
