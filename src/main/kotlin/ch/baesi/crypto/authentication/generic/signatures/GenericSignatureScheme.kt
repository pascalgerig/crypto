package ch.baesi.crypto.authentication.generic.signatures

import ch.baesi.crypto.authentication.generic.GenericAuthenticationScheme

interface GenericSignatureScheme<T, Q>: GenericAuthenticationScheme<T, Q> {
    fun keyGen(): Pair<T, T>
}