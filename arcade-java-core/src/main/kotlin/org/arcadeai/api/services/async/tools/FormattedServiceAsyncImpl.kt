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
import org.arcadeai.api.models.ToolFormattedGetParams
import org.arcadeai.api.models.ToolFormattedGetResponse
import org.arcadeai.api.models.ToolFormattedListPageAsync
import org.arcadeai.api.models.ToolFormattedListParams

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
