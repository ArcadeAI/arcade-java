package com.arcade_engine.api.errors

import com.arcade_engine.api.core.http.Headers

class UnexpectedStatusCodeException(
    statusCode: Int,
    headers: Headers,
    body: String,
    error: ArcadeError,
) : ArcadeServiceException(statusCode, headers, body, error)
