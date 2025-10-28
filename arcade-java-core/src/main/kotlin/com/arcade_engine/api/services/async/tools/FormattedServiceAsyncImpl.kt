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
import com.arcade_engine.api.models.ToolFormattedGetParams
import com.arcade_engine.api.models.ToolFormattedGetResponse
import com.arcade_engine.api.models.ToolFormattedListPageAsync
import com.arcade_engine.api.models.ToolFormattedListParams
import java.util.concurrent.CompletableFuture

class FormattedServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    FormattedServiceAsync {

    private val errorHandler: Handler<ArcadeError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<ToolFormattedListPageAsync.Response> =
        jsonHandler<ToolFormattedListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Returns a page of tools from the engine configuration, optionally filtered by toolkit,
     * formatted for a specific provider
     */
    override fun list(
        params: ToolFormattedListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ToolFormattedListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "formatted_tools")
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
                    .let { ToolFormattedListPageAsync.of(this, params, it) }
            }
    }

    private val getHandler: Handler<ToolFormattedGetResponse> =
        jsonHandler<ToolFormattedGetResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Returns the formatted tool specification for a specific tool, given a provider */
    override fun get(
        params: ToolFormattedGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ToolFormattedGetResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "formatted_tools", params.getPathParam(0))
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
