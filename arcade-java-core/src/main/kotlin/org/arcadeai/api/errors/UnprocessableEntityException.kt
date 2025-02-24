package org.arcadeai.api.errors

import org.arcadeai.api.core.http.Headers

class UnprocessableEntityException(headers: Headers, body: String, error: ArcadeError) :
    ArcadeServiceException(422, headers, body, error)
