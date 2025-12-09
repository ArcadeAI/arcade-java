@file:JvmName("JsonHandler")

package dev.arcade.core.handlers

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.arcade.core.http.HttpResponse
import dev.arcade.core.http.HttpResponse.Handler
import dev.arcade.errors.ArcadeInvalidDataException

@JvmSynthetic
internal inline fun <reified T> jsonHandler(jsonMapper: JsonMapper): Handler<T> =
    object : Handler<T> {
        override fun handle(response: HttpResponse): T =
            try {
                jsonMapper.readValue(response.body(), jacksonTypeRef())
            } catch (e: Exception) {
                throw ArcadeInvalidDataException("Error reading response", e)
            }
    }
