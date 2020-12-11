package ch.baesi.crypto.authentication.mathematical.signatures

import ch.baesi.crypto.authentication.generic.signatures.GenericSignatureScheme

interface MathematicalSignatureScheme: GenericSignatureScheme<ByteArray, ByteArray> {
}