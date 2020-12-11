package ch.baesi.crypto.primitives

interface PseudoRandomPermutation {
    fun calculate(key: ByteArray, input: ByteArray): ByteArray
}