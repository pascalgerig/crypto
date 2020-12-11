package ch.baesi.crypto.authentication.generic

interface GenericAuthenticationScheme<T, Q> {
    fun authenticate(key: T, message: Q): String
    fun verify(key: T, signature: Q): Boolean
}