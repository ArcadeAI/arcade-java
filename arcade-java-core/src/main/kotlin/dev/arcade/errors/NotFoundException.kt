package dev.arcade.errors

import dev.arcade.core.http.Headers

class NotFoundException(headers: Headers, body: String, error: ArcadeError) :
    ArcadeServiceException(404, headers, body, error)
