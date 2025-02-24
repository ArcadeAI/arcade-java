// File generated from our OpenAPI spec by Stainless.

package org.arcadeai.api.services.async.tools

import java.util.concurrent.CompletableFuture
import org.arcadeai.api.core.ClientOptions
import org.arcadeai.api.core.RequestOptions
import org.arcadeai.api.core.handlers.errorHandler
import org.arcadeai.api.core.handlers.jsonHandler
import org.arcadeai.api.core.handlers.withErrorHandler
import org.arcadeai.api.core.http.HttpMethod
import org.arcadeai.api.core.http.HttpRequest
import org.arcadeai.api.core.http.HttpResponse.Handler
import org.arcadeai.api.core.prepareAsync
import org.arcadeai.api.errors.ArcadeError
import org.arcadeai.api.models.ToolScheduledGetParams
import org.arcadeai.api.models.ToolScheduledGetResponse
import org.arcadeai.api.models.ToolScheduledListPageAsync
import org.arcadeai.api.models.ToolScheduledListParams

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
