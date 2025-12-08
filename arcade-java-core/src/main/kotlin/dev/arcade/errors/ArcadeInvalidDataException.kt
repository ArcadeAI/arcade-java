package dev.arcade.errors

class ArcadeInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : ArcadeException(message, cause)
