@file:JvmName("EmptyHandler")

package com.arcade_engine.api.core.handlers

import com.arcade_engine.api.core.http.HttpResponse
import com.arcade_engine.api.core.http.HttpResponse.Handler

@JvmSynthetic internal fun emptyHandler(): Handler<Void?> = EmptyHandlerInternal

private object EmptyHandlerInternal : Handler<Void?> {
    override fun handle(response: HttpResponse): Void? = null
}
