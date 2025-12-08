// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.blocking

import dev.arcade.services.blocking.chat.CompletionService

interface ChatService {

    fun completions(): CompletionService
}
