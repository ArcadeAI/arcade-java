// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package dev.arcade.services.blocking.chat

import dev.arcade.core.RequestOptions
import dev.arcade.models.ChatCompletionCreateParams
import dev.arcade.models.ChatResponse

interface CompletionService {

    /** Interact with language models via OpenAI's chat completions API */
    @JvmOverloads
    fun create(
        params: ChatCompletionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatResponse
}
