// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.blocking.tools

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
import dev.arcade.core.http.parseable
import dev.arcade.core.prepare
import dev.arcade.models.tools.scheduled.ScheduledGetParams
import dev.arcade.models.tools.scheduled.ScheduledGetResponse
import dev.arcade.models.tools.scheduled.ScheduledListPage
import dev.arcade.models.tools.scheduled.ScheduledListPageResponse
import dev.arcade.models.tools.scheduled.ScheduledListParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ScheduledServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ScheduledService {

    private val withRawResponse: ScheduledService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ScheduledService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScheduledService =
        ScheduledServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: ScheduledListParams,
        requestOptions: RequestOptions,
    ): ScheduledListPage =
        // get /v1/scheduled_tools
        withRawResponse().list(params, requestOptions).parse()

    override fun get(
        params: ScheduledGetParams,
        requestOptions: RequestOptions,
    ): ScheduledGetResponse =
        // get /v1/scheduled_tools/{id}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ScheduledService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ScheduledService.WithRawResponse =
            ScheduledServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<ScheduledListPageResponse> =
            jsonHandler<ScheduledListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ScheduledListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScheduledListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "scheduled_tools")
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
                        ScheduledListPage.builder()
                            .service(ScheduledServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val getHandler: Handler<ScheduledGetResponse> =
            jsonHandler<ScheduledGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: ScheduledGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScheduledGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "scheduled_tools", params._pathParam(0))
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
