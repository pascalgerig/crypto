package ch.baesi.crypto.random

import java.math.BigDecimal
import java.math.BigInteger

interface RandomGenerator {
    fun randomShort(): Short
    fun randomInt(): Int
    fun randomFloat(): Float
    fun randomDouble(): Double
    fun randomBigInt(): BigInteger
    fun randomBigDecimal(): BigDecimal
    fun randomString(): String
    fun randomByte(): Byte
    fun randomByteArray(): ByteArray
}