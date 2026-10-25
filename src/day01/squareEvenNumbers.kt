package day01

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)

    // Filter for even numbers, then square them
    val squaredEvens = numbers.filter { it % 2 == 0 }
        .map { it * it }

    println(squaredEvens)
}
