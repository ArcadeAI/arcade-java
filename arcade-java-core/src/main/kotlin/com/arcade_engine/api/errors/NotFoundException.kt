package com.arcade_engine.api.errors

import com.arcade_engine.api.core.http.Headers

class NotFoundException(headers: Headers, body: String, error: ArcadeError) :
    ArcadeServiceException(404, headers, body, error)
