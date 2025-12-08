package dev.arcade.errors

import dev.arcade.core.http.Headers

class BadRequestException(headers: Headers, body: String, error: ArcadeError) :
    ArcadeServiceException(400, headers, body, error)
