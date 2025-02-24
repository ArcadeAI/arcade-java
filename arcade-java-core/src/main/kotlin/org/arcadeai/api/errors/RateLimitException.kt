package org.arcadeai.api.errors

import org.arcadeai.api.core.http.Headers

class RateLimitException(headers: Headers, body: String, error: ArcadeError) :
    ArcadeServiceException(429, headers, body, error)
