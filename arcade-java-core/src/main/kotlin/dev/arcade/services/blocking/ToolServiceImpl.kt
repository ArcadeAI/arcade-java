// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.blocking

import dev.arcade.core.ClientOptions
import dev.arcade.core.RequestOptions
import dev.arcade.core.checkRequired
import dev.arcade.core.handlers.errorBodyHandler
import dev.arcade.core.handlers.errorHandler
import dev.arcade.core.handlers.jsonHandler
import dev.arcade.core.http.HttpMethod
import dev.arcade.core.http.HttpRequest
import dev.arcade.core.http.HttpResponse
import dev.arcade.core.http.HttpResponse.Handler
import dev.arcade.core.http.HttpResponseFor
import dev.arcade.core.http.json
import dev.arcade.core.http.parseable
import dev.arcade.core.prepare
import dev.arcade.models.AuthorizationResponse
import dev.arcade.models.tools.ExecuteToolResponse
import dev.arcade.models.tools.ToolAuthorizeParams
import dev.arcade.models.tools.ToolDefinition
import dev.arcade.models.tools.ToolExecuteParams
import dev.arcade.models.tools.ToolGetParams
import dev.arcade.models.tools.ToolListPage
import dev.arcade.models.tools.ToolListPageResponse
import dev.arcade.models.tools.ToolListParams
import dev.arcade.services.blocking.tools.FormattedService
import dev.arcade.services.blocking.tools.FormattedServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ToolServiceImpl internal constructor(private val clientOptions: ClientOptions) : ToolService {

    private val withRawResponse: ToolService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val formatted: FormattedService by lazy { FormattedServiceImpl(clientOptions) }

    override fun withRawResponse(): ToolService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ToolService =
        ToolServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun formatted(): FormattedService = formatted

    override fun list(params: ToolListParams, requestOptions: RequestOptions): ToolListPage =
        // get /v1/tools
        withRawResponse().list(params, requestOptions).parse()

    override fun authorize(
        params: ToolAuthorizeParams,
        requestOptions: RequestOptions,
    ): AuthorizationResponse =
        // post /v1/tools/authorize
        withRawResponse().authorize(params, requestOptions).parse()

    override fun execute(
        params: ToolExecuteParams,
        requestOptions: RequestOptions,
    ): ExecuteToolResponse =
        // post /v1/tools/execute
        withRawResponse().execute(params, requestOptions).parse()

    override fun get(params: ToolGetParams, requestOptions: RequestOptions): ToolDefinition =
        // get /v1/tools/{name}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ToolService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val formatted: FormattedService.WithRawResponse by lazy {
            FormattedServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ToolService.WithRawResponse =
            ToolServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun formatted(): FormattedService.WithRawResponse = formatted

        private val listHandler: Handler<ToolListPageResponse> =
            jsonHandler<ToolListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ToolListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ToolListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "tools")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        ToolListPage.builder()
                            .service(ToolServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val authorizeHandler: Handler<AuthorizationResponse> =
            jsonHandler<AuthorizationResponse>(clientOptions.jsonMapper)

        override fun authorize(
            params: ToolAuthorizeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AuthorizationResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "tools", "authorize")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { authorizeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val executeHandler: Handler<ExecuteToolResponse> =
            jsonHandler<ExecuteToolResponse>(clientOptions.jsonMapper)

        override fun execute(
            params: ToolExecuteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExecuteToolResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "tools", "execute")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { executeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getHandler: Handler<ToolDefinition> =
            jsonHandler<ToolDefinition>(clientOptions.jsonMapper)

        override fun get(
            params: ToolGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ToolDefinition> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("name", params.name().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "tools", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
