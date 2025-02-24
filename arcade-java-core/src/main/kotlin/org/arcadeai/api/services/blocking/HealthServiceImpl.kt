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
import org.arcadeai.api.core.prepare
import org.arcadeai.api.errors.ArcadeError
import org.arcadeai.api.models.HealthCheckParams
import org.arcadeai.api.models.HealthSchema

class HealthServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    HealthService {

    private val errorHandler: Handler<ArcadeError> = errorHandler(clientOptions.jsonMapper)

    private val checkHandler: Handler<HealthSchema> =
        jsonHandler<HealthSchema>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Check if Arcade Engine is healthy */
    override fun check(params: HealthCheckParams, requestOptions: RequestOptions): HealthSchema {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "health")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { checkHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
