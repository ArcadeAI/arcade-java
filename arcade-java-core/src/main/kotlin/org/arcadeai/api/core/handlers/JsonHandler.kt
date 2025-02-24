@file:JvmName("JsonHandler")

package org.arcadeai.api.core.handlers

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.arcadeai.api.core.http.HttpResponse
import org.arcadeai.api.core.http.HttpResponse.Handler
import org.arcadeai.api.errors.ArcadeException

@JvmSynthetic
internal inline fun <reified T> jsonHandler(jsonMapper: JsonMapper): Handler<T> =
    object : Handler<T> {
        override fun handle(response: HttpResponse): T {
            try {
                return jsonMapper.readValue(response.body(), jacksonTypeRef())
            } catch (e: Exception) {
                throw ArcadeException("Error reading response", e)
            }
        }
    }
