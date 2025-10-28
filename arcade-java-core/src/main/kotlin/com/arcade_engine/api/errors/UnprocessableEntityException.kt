package com.arcade_engine.api.errors

import com.arcade_engine.api.core.http.Headers

class UnprocessableEntityException(headers: Headers, body: String, error: ArcadeError) :
    ArcadeServiceException(422, headers, body, error)
