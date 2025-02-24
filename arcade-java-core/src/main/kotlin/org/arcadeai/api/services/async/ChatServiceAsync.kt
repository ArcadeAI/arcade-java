// File generated from our OpenAPI spec by Stainless.

package org.arcadeai.api.services.async

import org.arcadeai.api.services.async.chat.CompletionServiceAsync

interface ChatServiceAsync {

    fun completions(): CompletionServiceAsync
}
