package com.arcade_engine.api.errors

import com.arcade_engine.api.core.http.Headers

class BadRequestException(headers: Headers, body: String, error: ArcadeError) :
    ArcadeServiceException(400, headers, body, error)
