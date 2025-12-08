// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.async.tools

import dev.arcade.core.ClientOptions
import dev.arcade.core.RequestOptions
import dev.arcade.core.handlers.errorHandler
import dev.arcade.core.handlers.jsonHandler
import dev.arcade.core.handlers.withErrorHandler
import dev.arcade.core.http.HttpMethod
import dev.arcade.core.http.HttpRequest
import dev.arcade.core.http.HttpResponse.Handler
import dev.arcade.core.prepareAsync
import dev.arcade.errors.ArcadeError
import dev.arcade.models.ToolScheduledGetParams
import dev.arcade.models.ToolScheduledGetResponse
import dev.arcade.models.ToolScheduledListPageAsync
import dev.arcade.models.ToolScheduledListParams
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
