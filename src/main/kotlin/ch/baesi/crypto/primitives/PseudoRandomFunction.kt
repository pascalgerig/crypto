package ch.baesi.crypto.primitives

interface PseudoRandomFunction {
    fun calculate(key: ByteArray, input: ByteArray): ByteArray
}