// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.services.async

import com.arcade_engine.api.core.ClientOptions
import com.arcade_engine.api.services.async.chat.CompletionServiceAsync
import com.arcade_engine.api.services.async.chat.CompletionServiceAsyncImpl

class ChatServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ChatServiceAsync {

    private val completions: CompletionServiceAsync by lazy {
        CompletionServiceAsyncImpl(clientOptions)
    }

    override fun completions(): CompletionServiceAsync = completions
}
