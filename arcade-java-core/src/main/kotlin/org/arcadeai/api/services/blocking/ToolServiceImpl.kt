// File generated from our OpenAPI spec by Stainless.

package org.arcadeai.api.services.blocking

import org.arcadeai.api.core.ClientOptions
import org.arcadeai.api.core.RequestOptions
import org.arcadeai.api.core.handlers.errorHandler
import org.arcadeai.api.core.handlers.jsonHandler
import org.arcadeai.api.core.handlers.withErrorHandler
import org.arcadeai.api.core.http.HttpMethod
import org.arcadeai.api.core.http.HttpRequest
import org.arcadeai.api.core.http.HttpResponse.Handler
import org.arcadeai.api.core.json
import org.arcadeai.api.core.prepare
import org.arcadeai.api.errors.ArcadeError
import org.arcadeai.api.models.AuthorizationResponse
import org.arcadeai.api.models.ExecuteToolResponse
import org.arcadeai.api.models.ToolAuthorizeParams
import org.arcadeai.api.models.ToolDefinition
import org.arcadeai.api.models.ToolExecuteParams
import org.arcadeai.api.models.ToolGetParams
import org.arcadeai.api.models.ToolListPage
import org.arcadeai.api.models.ToolListParams
import org.arcadeai.api.services.blocking.tools.FormattedService
import org.arcadeai.api.services.blocking.tools.FormattedServiceImpl
import org.arcadeai.api.services.blocking.tools.ScheduledService
import org.arcadeai.api.services.blocking.tools.ScheduledServiceImpl

class ToolServiceImpl internal constructor(private val clientOptions: ClientOptions) : ToolService {

    private val errorHandler: Handler<ArcadeError> = errorHandler(clientOptions.jsonMapper)

    private val scheduled: ScheduledService by lazy { ScheduledServiceImpl(clientOptions) }

    private val formatted: FormattedService by lazy { FormattedServiceImpl(clientOptions) }

    override fun scheduled(): ScheduledService = scheduled

    override fun formatted(): FormattedService = formatted

    private val listHandler: Handler<ToolListPage.Response> =
        jsonHandler<ToolListPage.Response>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Returns a page of tools from the engine configuration, optionally filtered by toolkit */
    override fun list(params: ToolListParams, requestOptions: RequestOptions): ToolListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "tools")
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
            .let { ToolListPage.of(this, params, it) }
    }

    private val authorizeHandler: Handler<AuthorizationResponse> =
        jsonHandler<AuthorizationResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Authorizes a user for a specific tool by name */
    override fun authorize(
        params: ToolAuthorizeParams,
        requestOptions: RequestOptions,
    ): AuthorizationResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "tools", "authorize")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { authorizeHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val executeHandler: Handler<ExecuteToolResponse> =
        jsonHandler<ExecuteToolResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Executes a tool by name and arguments */
    override fun execute(
        params: ToolExecuteParams,
        requestOptions: RequestOptions,
    ): ExecuteToolResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "tools", "execute")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { executeHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val getHandler: Handler<ToolDefinition> =
        jsonHandler<ToolDefinition>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Returns the arcade tool specification for a specific tool */
    override fun get(params: ToolGetParams, requestOptions: RequestOptions): ToolDefinition {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "tools", params.getPathParam(0))
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
