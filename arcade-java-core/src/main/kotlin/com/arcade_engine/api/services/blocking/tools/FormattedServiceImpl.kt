// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.services.blocking.tools

import com.arcade_engine.api.core.ClientOptions
import com.arcade_engine.api.core.RequestOptions
import com.arcade_engine.api.core.handlers.errorHandler
import com.arcade_engine.api.core.handlers.jsonHandler
import com.arcade_engine.api.core.handlers.withErrorHandler
import com.arcade_engine.api.core.http.HttpMethod
import com.arcade_engine.api.core.http.HttpRequest
import com.arcade_engine.api.core.http.HttpResponse.Handler
import com.arcade_engine.api.core.prepare
import com.arcade_engine.api.errors.ArcadeError
import com.arcade_engine.api.models.ToolFormattedGetParams
import com.arcade_engine.api.models.ToolFormattedGetResponse
import com.arcade_engine.api.models.ToolFormattedListPage
import com.arcade_engine.api.models.ToolFormattedListParams

class FormattedServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    FormattedService {

    private val errorHandler: Handler<ArcadeError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<ToolFormattedListPage.Response> =
        jsonHandler<ToolFormattedListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Returns a page of tools from the engine configuration, optionally filtered by toolkit,
     * formatted for a specific provider
     */
    override fun list(
        params: ToolFormattedListParams,
        requestOptions: RequestOptions,
    ): ToolFormattedListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "formatted_tools")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
            .let { ToolFormattedListPage.of(this, params, it) }
    }

    private val getHandler: Handler<ToolFormattedGetResponse> =
        jsonHandler<ToolFormattedGetResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Returns the formatted tool specification for a specific tool, given a provider */
    override fun get(
        params: ToolFormattedGetParams,
        requestOptions: RequestOptions,
    ): ToolFormattedGetResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "formatted_tools", params.getPathParam(0))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { getHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
