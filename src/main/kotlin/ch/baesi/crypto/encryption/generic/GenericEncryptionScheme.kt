package ch.baesi.crypto.encryption.generic

interface GenericEncryptionScheme<T, Q> {
    fun encrypt(key: T, message: Q): String
    fun decrypt(key: T, ciphertext: Q): String
}