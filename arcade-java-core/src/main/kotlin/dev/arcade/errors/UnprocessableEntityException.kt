package dev.arcade.errors

import dev.arcade.core.http.Headers

class UnprocessableEntityException(headers: Headers, body: String, error: ArcadeError) :
    ArcadeServiceException(422, headers, body, error)
