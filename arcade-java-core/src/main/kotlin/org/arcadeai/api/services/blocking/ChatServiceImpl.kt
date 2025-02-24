// File generated from our OpenAPI spec by Stainless.

package org.arcadeai.api.services.blocking

import org.arcadeai.api.core.ClientOptions
import org.arcadeai.api.services.blocking.chat.CompletionService
import org.arcadeai.api.services.blocking.chat.CompletionServiceImpl

class ChatServiceImpl internal constructor(private val clientOptions: ClientOptions) : ChatService {

    private val completions: CompletionService by lazy { CompletionServiceImpl(clientOptions) }

    override fun completions(): CompletionService = completions
}
