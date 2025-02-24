@file:JvmName("ErrorHandler")

package org.arcadeai.api.core.handlers

import com.fasterxml.jackson.databind.json.JsonMapper
import java.io.ByteArrayInputStream
import java.io.InputStream
import org.arcadeai.api.core.http.Headers
import org.arcadeai.api.core.http.HttpResponse
import org.arcadeai.api.core.http.HttpResponse.Handler
import org.arcadeai.api.errors.ArcadeError
import org.arcadeai.api.errors.BadRequestException
import org.arcadeai.api.errors.InternalServerException
import org.arcadeai.api.errors.NotFoundException
import org.arcadeai.api.errors.PermissionDeniedException
import org.arcadeai.api.errors.RateLimitException
import org.arcadeai.api.errors.UnauthorizedException
import org.arcadeai.api.errors.UnexpectedStatusCodeException
import org.arcadeai.api.errors.UnprocessableEntityException

@JvmSynthetic
internal fun errorHandler(jsonMapper: JsonMapper): Handler<ArcadeError> {
    val handler = jsonHandler<ArcadeError>(jsonMapper)

    return object : Handler<ArcadeError> {
        override fun handle(response: HttpResponse): ArcadeError =
            try {
                handler.handle(response)
            } catch (e: Exception) {
                ArcadeError.builder().build()
            }
    }
}

@JvmSynthetic
internal fun <T> Handler<T>.withErrorHandler(errorHandler: Handler<ArcadeError>): Handler<T> =
    object : Handler<T> {
        override fun handle(response: HttpResponse): T {
            when (val statusCode = response.statusCode()) {
                in 200..299 -> {
                    return this@withErrorHandler.handle(response)
                }
                400 -> {
                    val buffered = response.buffered()
                    throw BadRequestException(
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
                401 -> {
                    val buffered = response.buffered()
                    throw UnauthorizedException(
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
                403 -> {
                    val buffered = response.buffered()
                    throw PermissionDeniedException(
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
                404 -> {
                    val buffered = response.buffered()
                    throw NotFoundException(
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
                422 -> {
                    val buffered = response.buffered()
                    throw UnprocessableEntityException(
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
                429 -> {
                    val buffered = response.buffered()
                    throw RateLimitException(
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
                in 500..599 -> {
                    val buffered = response.buffered()
                    throw InternalServerException(
                        statusCode,
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
                else -> {
                    val buffered = response.buffered()
                    throw UnexpectedStatusCodeException(
                        statusCode,
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
            }
        }
    }

private fun HttpResponse.buffered(): HttpResponse {
    val body = body().readBytes()

    return object : HttpResponse {
        override fun statusCode(): Int = this@buffered.statusCode()

        override fun headers(): Headers = this@buffered.headers()

        override fun body(): InputStream = ByteArrayInputStream(body)

        override fun close() = this@buffered.close()
    }
}
