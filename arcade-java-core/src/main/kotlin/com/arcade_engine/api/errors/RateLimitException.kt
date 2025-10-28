package com.arcade_engine.api.errors

import com.arcade_engine.api.core.http.Headers

class RateLimitException(headers: Headers, body: String, error: ArcadeError) :
    ArcadeServiceException(429, headers, body, error)
