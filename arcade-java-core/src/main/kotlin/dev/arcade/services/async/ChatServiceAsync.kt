// File generated from our OpenAPI spec by Stainless.

package dev.arcade.services.async

import dev.arcade.services.async.chat.CompletionServiceAsync

interface ChatServiceAsync {

    fun completions(): CompletionServiceAsync
}
