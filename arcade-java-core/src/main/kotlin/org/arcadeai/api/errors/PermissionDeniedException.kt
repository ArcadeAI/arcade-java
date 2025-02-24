package org.arcadeai.api.errors

import org.arcadeai.api.core.http.Headers

class PermissionDeniedException(headers: Headers, body: String, error: ArcadeError) :
    ArcadeServiceException(403, headers, body, error)
