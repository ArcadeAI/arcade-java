package org.arcadeai.api.errors

open class ArcadeException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
