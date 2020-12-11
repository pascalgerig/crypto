package ch.baesi.crypto.authentication.practical.signatures

import ch.baesi.crypto.authentication.generic.signatures.GenericSignatureScheme

interface SignatureScheme: GenericSignatureScheme<String, String> {
}