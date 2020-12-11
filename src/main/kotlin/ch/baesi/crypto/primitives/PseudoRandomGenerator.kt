package ch.baesi.crypto.primitives

interface PseudoRandomGenerator {
    fun next(seed: ByteArray): ByteArray
}