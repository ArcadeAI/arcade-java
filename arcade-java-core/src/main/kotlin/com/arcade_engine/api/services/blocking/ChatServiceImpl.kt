// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.services.blocking

import com.arcade_engine.api.core.ClientOptions
import com.arcade_engine.api.services.blocking.chat.CompletionService
import com.arcade_engine.api.services.blocking.chat.CompletionServiceImpl

class ChatServiceImpl internal constructor(private val clientOptions: ClientOptions) : ChatService {

    private val completions: CompletionService by lazy { CompletionServiceImpl(clientOptions) }

    override fun completions(): CompletionService = completions
}
