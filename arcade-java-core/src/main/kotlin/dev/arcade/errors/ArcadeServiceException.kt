// File generated from our OpenAPI spec by Stainless.

package dev.arcade.errors

import dev.arcade.core.JsonValue
import dev.arcade.core.http.Headers

abstract class ArcadeServiceException
protected constructor(message: String, cause: Throwable? = null) : ArcadeException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
