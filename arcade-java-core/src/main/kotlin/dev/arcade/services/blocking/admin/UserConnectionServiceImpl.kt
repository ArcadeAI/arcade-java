// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.blocking.admin

import dev.arcade.core.ClientOptions
import dev.arcade.core.RequestOptions
import dev.arcade.core.checkRequired
import dev.arcade.core.handlers.emptyHandler
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
import dev.arcade.models.admin.userconnections.UserConnectionDeleteParams
import dev.arcade.models.admin.userconnections.UserConnectionListPage
import dev.arcade.models.admin.userconnections.UserConnectionListPageResponse
import dev.arcade.models.admin.userconnections.UserConnectionListParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class UserConnectionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    UserConnectionService {

    private val withRawResponse: UserConnectionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UserConnectionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserConnectionService =
        UserConnectionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: UserConnectionListParams,
        requestOptions: RequestOptions,
    ): UserConnectionListPage =
        // get /v1/admin/user_connections
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: UserConnectionDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/admin/user_connections/{id}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UserConnectionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UserConnectionService.WithRawResponse =
            UserConnectionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<UserConnectionListPageResponse> =
            jsonHandler<UserConnectionListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: UserConnectionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserConnectionListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "admin", "user_connections")
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
                        UserConnectionListPage.builder()
                            .service(UserConnectionServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: UserConnectionDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "admin", "user_connections", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }
    }
}
