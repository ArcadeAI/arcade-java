// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.arcade_engine.api.services.async.chat

import com.arcade_engine.api.core.RequestOptions
import com.arcade_engine.api.models.ChatCompletionCreateParams
import com.arcade_engine.api.models.ChatResponse
import java.util.concurrent.CompletableFuture

interface CompletionServiceAsync {

    /** Interact with language models via OpenAI's chat completions API */
    @JvmOverloads
    fun create(
        params: ChatCompletionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChatResponse>
}
