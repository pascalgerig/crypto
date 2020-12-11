package ch.baesi.crypto.authentication.generic.mac

import ch.baesi.crypto.authentication.generic.GenericAuthenticationScheme

interface GenericMacScheme<T, Q>: GenericAuthenticationScheme<T, Q> {
    fun keyGen(): T
}