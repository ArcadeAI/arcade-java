package com.arcade_engine.api.errors

import com.arcade_engine.api.core.http.Headers

abstract class ArcadeServiceException
@JvmOverloads
constructor(
    private val statusCode: Int,
    private val headers: Headers,
    private val body: String,
    private val error: ArcadeError,
    message: String = "$statusCode: $error",
    cause: Throwable? = null,
) : ArcadeException(message, cause) {

    fun statusCode(): Int = statusCode

    fun headers(): Headers = headers

    fun body(): String = body

    fun error(): ArcadeError = error
}
