@file:JvmName("EmptyHandler")

package dev.arcade.core.handlers

import dev.arcade.core.http.HttpResponse
import dev.arcade.core.http.HttpResponse.Handler

@JvmSynthetic internal fun emptyHandler(): Handler<Void?> = EmptyHandlerInternal

private object EmptyHandlerInternal : Handler<Void?> {
    override fun handle(response: HttpResponse): Void? = null
}
