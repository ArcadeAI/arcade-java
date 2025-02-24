package org.arcadeai.api.errors

import org.arcadeai.api.core.http.Headers

class InternalServerException(statusCode: Int, headers: Headers, body: String, error: ArcadeError) :
    ArcadeServiceException(statusCode, headers, body, error)
