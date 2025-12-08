// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.async

import dev.arcade.core.ClientOptions
import dev.arcade.services.async.chat.CompletionServiceAsync
import dev.arcade.services.async.chat.CompletionServiceAsyncImpl

class ChatServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ChatServiceAsync {

    private val completions: CompletionServiceAsync by lazy {
        CompletionServiceAsyncImpl(clientOptions)
    }

    override fun completions(): CompletionServiceAsync = completions
}
