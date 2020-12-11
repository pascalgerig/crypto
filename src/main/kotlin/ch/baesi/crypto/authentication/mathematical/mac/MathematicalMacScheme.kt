package ch.baesi.crypto.authentication.mathematical.mac

import ch.baesi.crypto.authentication.generic.mac.GenericMacScheme

interface MathematicalMacScheme: GenericMacScheme<ByteArray, ByteArray> {
}