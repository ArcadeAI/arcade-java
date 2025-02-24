// File generated from our OpenAPI spec by Stainless.

package org.arcadeai.api.services.async

import org.arcadeai.api.core.ClientOptions
import org.arcadeai.api.services.async.chat.CompletionServiceAsync
import org.arcadeai.api.services.async.chat.CompletionServiceAsyncImpl

class ChatServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ChatServiceAsync {

    private val completions: CompletionServiceAsync by lazy {
        CompletionServiceAsyncImpl(clientOptions)
    }

    override fun completions(): CompletionServiceAsync = completions
}
