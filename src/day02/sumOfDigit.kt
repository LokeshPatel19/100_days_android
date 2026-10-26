package day02

import kotlin.math.abs

fun sumOfDigits(n: Int): Int {
    var num = abs(n)
    var sum = 0
    while (num > 0) {
        sum += num % 10
        num /= 10
    }
    return sum
}

fun main() {
    listOf(123, 405, 9, 0, -123).forEach { println("$it -> ${sumOfDigits(it)}") }
}