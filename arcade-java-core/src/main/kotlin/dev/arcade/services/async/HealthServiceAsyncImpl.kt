// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.async

import dev.arcade.core.ClientOptions
import dev.arcade.core.RequestOptions
import dev.arcade.core.handlers.errorBodyHandler
import dev.arcade.core.handlers.errorHandler
import dev.arcade.core.handlers.jsonHandler
import dev.arcade.core.http.HttpMethod
import dev.arcade.core.http.HttpRequest
import dev.arcade.core.http.HttpResponse
import dev.arcade.core.http.HttpResponse.Handler
import dev.arcade.core.http.HttpResponseFor
import dev.arcade.core.http.parseable
import dev.arcade.core.prepareAsync
import dev.arcade.models.health.HealthCheckParams
import dev.arcade.models.health.HealthSchema
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class HealthServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    HealthServiceAsync {

    private val withRawResponse: HealthServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): HealthServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HealthServiceAsync =
        HealthServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun check(
        params: HealthCheckParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HealthSchema> =
        // get /v1/health
        withRawResponse().check(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HealthServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HealthServiceAsync.WithRawResponse =
            HealthServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val checkHandler: Handler<HealthSchema> =
            jsonHandler<HealthSchema>(clientOptions.jsonMapper)

        override fun check(
            params: HealthCheckParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<HealthSchema>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "health")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { checkHandler.handle(it) }
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
