package ch.baesi.crypto.encryption.practical.symmetric

import ch.baesi.crypto.encryption.generic.symmetric.GenericStreamCypher

interface StreamCypher: GenericStreamCypher<String, String> {
}