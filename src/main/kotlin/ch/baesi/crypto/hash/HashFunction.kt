package ch.baesi.crypto.hash

interface HashFunction<T> {
    fun hash(value: T): T
}