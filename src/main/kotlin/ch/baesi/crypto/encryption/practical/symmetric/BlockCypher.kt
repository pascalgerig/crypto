package ch.baesi.crypto.encryption.practical.symmetric

import ch.baesi.crypto.encryption.generic.symmetric.GenericBlockCypher

interface BlockCypher: GenericBlockCypher<String, String> {
}