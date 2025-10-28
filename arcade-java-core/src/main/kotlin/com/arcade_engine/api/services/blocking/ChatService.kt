// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.services.blocking

import com.arcade_engine.api.services.blocking.chat.CompletionService

interface ChatService {

    fun completions(): CompletionService
}
