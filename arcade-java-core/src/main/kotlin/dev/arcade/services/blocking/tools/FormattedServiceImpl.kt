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
import dev.arcade.models.tools.formatted.FormattedGetParams
import dev.arcade.models.tools.formatted.FormattedGetResponse
import dev.arcade.models.tools.formatted.FormattedListPage
import dev.arcade.models.tools.formatted.FormattedListPageResponse
import dev.arcade.models.tools.formatted.FormattedListParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class FormattedServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    FormattedService {

    private val withRawResponse: FormattedService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FormattedService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FormattedService =
        FormattedServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: FormattedListParams,
        requestOptions: RequestOptions,
    ): FormattedListPage =
        // get /v1/formatted_tools
        withRawResponse().list(params, requestOptions).parse()

    override fun get(
        params: FormattedGetParams,
        requestOptions: RequestOptions,
    ): FormattedGetResponse =
        // get /v1/formatted_tools/{name}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FormattedService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FormattedService.WithRawResponse =
            FormattedServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<FormattedListPageResponse> =
            jsonHandler<FormattedListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: FormattedListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FormattedListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "formatted_tools")
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
                        FormattedListPage.builder()
                            .service(FormattedServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val getHandler: Handler<FormattedGetResponse> =
            jsonHandler<FormattedGetResponse>(clientOptions.jsonMapper)

        override fun get(
            params: FormattedGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FormattedGetResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("name", params.name().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "formatted_tools", params._pathParam(0))
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
