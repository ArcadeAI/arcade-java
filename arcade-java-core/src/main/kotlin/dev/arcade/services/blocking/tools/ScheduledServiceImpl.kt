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
import dev.arcade.models.ToolScheduledGetParams
import dev.arcade.models.ToolScheduledGetResponse
import dev.arcade.models.ToolScheduledListPage
import dev.arcade.models.ToolScheduledListParams

class ScheduledServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ScheduledService {

    private val errorHandler: Handler<ArcadeError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<ToolScheduledListPage.Response> =
        jsonHandler<ToolScheduledListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Returns a page of scheduled tool executions */
    override fun list(
        params: ToolScheduledListParams,
        requestOptions: RequestOptions,
    ): ToolScheduledListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "scheduled_tools")
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
            .let { ToolScheduledListPage.of(this, params, it) }
    }

    private val getHandler: Handler<ToolScheduledGetResponse> =
        jsonHandler<ToolScheduledGetResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Returns the details for a specific scheduled tool execution */
    override fun get(
        params: ToolScheduledGetParams,
        requestOptions: RequestOptions,
    ): ToolScheduledGetResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "scheduled_tools", params.getPathParam(0))
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
