// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.blocking.tools

import dev.arcade.core.ClientOptions
import dev.arcade.core.RequestOptions
import dev.arcade.core.handlers.errorHandler
import dev.arcade.core.handlers.jsonHandler
import dev.arcade.core.handlers.withErrorHandler
import dev.arcade.core.http.HttpMethod
import dev.arcade.core.http.HttpRequest
import dev.arcade.core.http.HttpResponse.Handler
import dev.arcade.core.prepare
import dev.arcade.errors.ArcadeError
import dev.arcade.models.ToolFormattedGetParams
import dev.arcade.models.ToolFormattedGetResponse
import dev.arcade.models.ToolFormattedListPage
import dev.arcade.models.ToolFormattedListParams

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
