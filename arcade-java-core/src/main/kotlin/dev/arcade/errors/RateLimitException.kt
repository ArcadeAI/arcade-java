package dev.arcade.errors

import dev.arcade.core.http.Headers

class RateLimitException(headers: Headers, body: String, error: ArcadeError) :
    ArcadeServiceException(429, headers, body, error)
