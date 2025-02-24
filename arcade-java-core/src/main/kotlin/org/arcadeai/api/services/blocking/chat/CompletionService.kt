// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.arcadeai.api.services.blocking.chat

import org.arcadeai.api.core.RequestOptions
import org.arcadeai.api.models.ChatCompletionCreateParams
import org.arcadeai.api.models.ChatResponse

interface CompletionService {

    /** Interact with language models via OpenAI's chat completions API */
    @JvmOverloads
    fun create(
        params: ChatCompletionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatResponse
}
