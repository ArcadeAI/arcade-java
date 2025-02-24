@file:JvmName("StringHandler")

package org.arcadeai.api.core.handlers

import org.arcadeai.api.core.http.HttpResponse
import org.arcadeai.api.core.http.HttpResponse.Handler

@JvmSynthetic internal fun stringHandler(): Handler<String> = StringHandlerInternal

private object StringHandlerInternal : Handler<String> {
    override fun handle(response: HttpResponse): String =
        response.body().readBytes().toString(Charsets.UTF_8)
}
