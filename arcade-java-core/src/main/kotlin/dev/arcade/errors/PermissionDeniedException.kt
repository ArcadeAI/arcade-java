package dev.arcade.errors

import dev.arcade.core.http.Headers

class PermissionDeniedException(headers: Headers, body: String, error: ArcadeError) :
    ArcadeServiceException(403, headers, body, error)
