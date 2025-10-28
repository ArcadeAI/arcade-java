package com.arcade_engine.api.errors

import com.arcade_engine.api.core.http.Headers

class PermissionDeniedException(headers: Headers, body: String, error: ArcadeError) :
    ArcadeServiceException(403, headers, body, error)
