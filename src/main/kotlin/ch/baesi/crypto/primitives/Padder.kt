package ch.baesi.crypto.primitives

interface Padder {
    fun pad(length: Int, message: ByteArray): ByteArray
    fun unpad(length: Int, paddedMessage: ByteArray): ByteArray
}