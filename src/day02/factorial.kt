package day02

fun factorial(n: Int): Long {
    var result = 1L
    for (i in 1..n) {
        result *= i
    }
    return result
}

fun main() {
    listOf(0, 1, 4, 5).forEach { println("$it -> ${factorial(it)}") }
}