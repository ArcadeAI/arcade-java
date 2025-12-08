package dev.arcade.errors

import dev.arcade.core.http.Headers

class UnauthorizedException(headers: Headers, body: String, error: ArcadeError) :
    ArcadeServiceException(401, headers, body, error)
