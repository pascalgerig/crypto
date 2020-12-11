package ch.baesi.crypto.encryption.generic.asymmetric

import ch.baesi.crypto.encryption.generic.GenericEncryptionScheme

interface GenericAsymmetricEncryptionScheme<T, Q>: GenericEncryptionScheme<T, Q> {
    fun keyGen(): Pair<T, T>
}