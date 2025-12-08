package dev.arcade.errors

class ArcadeIoException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : ArcadeException(message, cause)
