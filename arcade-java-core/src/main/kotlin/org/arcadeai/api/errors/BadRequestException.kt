package org.arcadeai.api.errors

import org.arcadeai.api.core.http.Headers

class BadRequestException(headers: Headers, body: String, error: ArcadeError) :
    ArcadeServiceException(400, headers, body, error)
