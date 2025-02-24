package org.arcadeai.api.errors

import org.arcadeai.api.core.http.Headers

class UnauthorizedException(headers: Headers, body: String, error: ArcadeError) :
    ArcadeServiceException(401, headers, body, error)
