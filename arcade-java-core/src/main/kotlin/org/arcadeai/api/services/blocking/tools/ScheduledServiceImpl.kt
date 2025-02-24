// File generated from our OpenAPI spec by Stainless.

package org.arcadeai.api.services.blocking.tools

import org.arcadeai.api.core.ClientOptions
import org.arcadeai.api.core.RequestOptions
import org.arcadeai.api.core.handlers.errorHandler
import org.arcadeai.api.core.handlers.jsonHandler
import org.arcadeai.api.core.handlers.withErrorHandler
import org.arcadeai.api.core.http.HttpMethod
import org.arcadeai.api.core.http.HttpRequest
import org.arcadeai.api.core.http.HttpResponse.Handler
import org.arcadeai.api.core.prepare
import org.arcadeai.api.errors.ArcadeError
import org.arcadeai.api.models.ToolScheduledGetParams
import org.arcadeai.api.models.ToolScheduledGetResponse
import org.arcadeai.api.models.ToolScheduledListPage
import org.arcadeai.api.models.ToolScheduledListParams

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
