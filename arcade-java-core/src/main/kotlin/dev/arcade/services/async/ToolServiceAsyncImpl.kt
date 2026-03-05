// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.async

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
import dev.arcade.core.prepareAsync
import dev.arcade.models.AuthorizationResponse
import dev.arcade.models.tools.ExecuteToolResponse
import dev.arcade.models.tools.ToolAuthorizeParams
import dev.arcade.models.tools.ToolDefinition
import dev.arcade.models.tools.ToolExecuteParams
import dev.arcade.models.tools.ToolGetParams
import dev.arcade.models.tools.ToolListPageAsync
import dev.arcade.models.tools.ToolListPageResponse
import dev.arcade.models.tools.ToolListParams
import dev.arcade.services.async.tools.FormattedServiceAsync
import dev.arcade.services.async.tools.FormattedServiceAsyncImpl
import dev.arcade.services.async.tools.ScheduledServiceAsync
import dev.arcade.services.async.tools.ScheduledServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ToolServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ToolServiceAsync {

    private val withRawResponse: ToolServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val scheduled: ScheduledServiceAsync by lazy {
        ScheduledServiceAsyncImpl(clientOptions)
    }

    private val formatted: FormattedServiceAsync by lazy {
        FormattedServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): ToolServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ToolServiceAsync =
        ToolServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun scheduled(): ScheduledServiceAsync = scheduled

    override fun formatted(): FormattedServiceAsync = formatted

    override fun list(
        params: ToolListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ToolListPageAsync> =
        // get /v1/tools
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun authorize(
        params: ToolAuthorizeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AuthorizationResponse> =
        // post /v1/tools/authorize
        withRawResponse().authorize(params, requestOptions).thenApply { it.parse() }

    override fun execute(
        params: ToolExecuteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExecuteToolResponse> =
        // post /v1/tools/execute
        withRawResponse().execute(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: ToolGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ToolDefinition> =
        // get /v1/tools/{name}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ToolServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val scheduled: ScheduledServiceAsync.WithRawResponse by lazy {
            ScheduledServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val formatted: FormattedServiceAsync.WithRawResponse by lazy {
            FormattedServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ToolServiceAsync.WithRawResponse =
            ToolServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun scheduled(): ScheduledServiceAsync.WithRawResponse = scheduled

        override fun formatted(): FormattedServiceAsync.WithRawResponse = formatted

        private val listHandler: Handler<ToolListPageResponse> =
            jsonHandler<ToolListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ToolListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ToolListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "tools")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                ToolListPageAsync.builder()
                                    .service(ToolServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val authorizeHandler: Handler<AuthorizationResponse> =
            jsonHandler<AuthorizationResponse>(clientOptions.jsonMapper)

        override fun authorize(
            params: ToolAuthorizeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AuthorizationResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "tools", "authorize")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { authorizeHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val executeHandler: Handler<ExecuteToolResponse> =
            jsonHandler<ExecuteToolResponse>(clientOptions.jsonMapper)

        override fun execute(
            params: ToolExecuteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExecuteToolResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "tools", "execute")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { executeHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getHandler: Handler<ToolDefinition> =
            jsonHandler<ToolDefinition>(clientOptions.jsonMapper)

        override fun get(
            params: ToolGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ToolDefinition>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("name", params.name().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "tools", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
