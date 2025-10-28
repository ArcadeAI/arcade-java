package com.arcade_engine.api.errors

import com.arcade_engine.api.core.http.Headers

class UnauthorizedException(headers: Headers, body: String, error: ArcadeError) :
    ArcadeServiceException(401, headers, body, error)
