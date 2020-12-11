package ch.baesi.crypto.encryption.generic.symmetric

import ch.baesi.crypto.encryption.generic.GenericEncryptionScheme

interface GenericSymmetricEncryptionScheme<T, Q>: GenericEncryptionScheme<T, Q> {
    fun keyGen(): T
}