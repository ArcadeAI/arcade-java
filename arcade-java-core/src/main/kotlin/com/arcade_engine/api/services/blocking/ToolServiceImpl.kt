// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.services.blocking

import com.arcade_engine.api.core.ClientOptions
import com.arcade_engine.api.core.RequestOptions
import com.arcade_engine.api.core.handlers.errorHandler
import com.arcade_engine.api.core.handlers.jsonHandler
import com.arcade_engine.api.core.handlers.withErrorHandler
import com.arcade_engine.api.core.http.HttpMethod
import com.arcade_engine.api.core.http.HttpRequest
import com.arcade_engine.api.core.http.HttpResponse.Handler
import com.arcade_engine.api.core.json
import com.arcade_engine.api.core.prepare
import com.arcade_engine.api.errors.ArcadeError
import com.arcade_engine.api.models.AuthorizationResponse
import com.arcade_engine.api.models.ExecuteToolResponse
import com.arcade_engine.api.models.ToolAuthorizeParams
import com.arcade_engine.api.models.ToolDefinition
import com.arcade_engine.api.models.ToolExecuteParams
import com.arcade_engine.api.models.ToolGetParams
import com.arcade_engine.api.models.ToolListPage
import com.arcade_engine.api.models.ToolListParams
import com.arcade_engine.api.services.blocking.tools.FormattedService
import com.arcade_engine.api.services.blocking.tools.FormattedServiceImpl
import com.arcade_engine.api.services.blocking.tools.ScheduledService
import com.arcade_engine.api.services.blocking.tools.ScheduledServiceImpl

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
