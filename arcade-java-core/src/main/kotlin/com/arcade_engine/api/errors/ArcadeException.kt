package com.arcade_engine.api.errors

open class ArcadeException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
