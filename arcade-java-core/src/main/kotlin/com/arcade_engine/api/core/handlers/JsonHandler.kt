@file:JvmName("JsonHandler")

package com.arcade_engine.api.core.handlers

import com.arcade_engine.api.core.http.HttpResponse
import com.arcade_engine.api.core.http.HttpResponse.Handler
import com.arcade_engine.api.errors.ArcadeException
import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef

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
