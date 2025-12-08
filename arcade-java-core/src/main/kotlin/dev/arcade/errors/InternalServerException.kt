package dev.arcade.errors

import dev.arcade.core.http.Headers

class InternalServerException(statusCode: Int, headers: Headers, body: String, error: ArcadeError) :
    ArcadeServiceException(statusCode, headers, body, error)
