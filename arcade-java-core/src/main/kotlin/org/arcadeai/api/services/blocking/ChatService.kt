// File generated from our OpenAPI spec by Stainless.

package org.arcadeai.api.services.blocking

import org.arcadeai.api.services.blocking.chat.CompletionService

interface ChatService {

    fun completions(): CompletionService
}
