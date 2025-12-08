// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.blocking.chat

import dev.arcade.core.ClientOptions
import dev.arcade.core.RequestOptions
import dev.arcade.core.handlers.errorHandler
import dev.arcade.core.handlers.jsonHandler
import dev.arcade.core.handlers.withErrorHandler
import dev.arcade.core.http.HttpMethod
import dev.arcade.core.http.HttpRequest
import dev.arcade.core.http.HttpResponse.Handler
import dev.arcade.core.json
import dev.arcade.core.prepare
import dev.arcade.errors.ArcadeError
import dev.arcade.models.ChatCompletionCreateParams
import dev.arcade.models.ChatResponse

class CompletionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CompletionService {

    private val errorHandler: Handler<ArcadeError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<ChatResponse> =
        jsonHandler<ChatResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Interact with language models via OpenAI's chat completions API */
    override fun create(
        params: ChatCompletionCreateParams,
        requestOptions: RequestOptions,
    ): ChatResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "chat", "completions")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
