// File generated from our OpenAPI spec by Stainless.

package com.arcade_engine.api.services.async

import com.arcade_engine.api.services.async.chat.CompletionServiceAsync

interface ChatServiceAsync {

    fun completions(): CompletionServiceAsync
}
