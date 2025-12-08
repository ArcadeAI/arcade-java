@file:JvmName("StringHandler")

package dev.arcade.core.handlers

import dev.arcade.core.http.HttpResponse
import dev.arcade.core.http.HttpResponse.Handler

@JvmSynthetic internal fun stringHandler(): Handler<String> = StringHandlerInternal

private object StringHandlerInternal : Handler<String> {
    override fun handle(response: HttpResponse): String =
        response.body().readBytes().toString(Charsets.UTF_8)
}
