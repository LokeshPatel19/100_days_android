package day01

// The return type Int? means it can return an Int or null
fun parseInputSafely(input: String): Int? {
    return try {
        input.toInt()
    } catch (e: NumberFormatException) {
        null // Return null safely instead of crashing
    }
}

fun main() {
    val goodInput = "42"
    val badInput = "abc"

    // 1. Testing valid input
    val result1 = parseInputSafely(goodInput)
    println("Result for '$goodInput': $result1") // Prints 42

    // 2. Testing bad input (No crash!)
    val result2 = parseInputSafely(badInput)
    println("Result for '$badInput': $result2") // Prints null

    // 3. Handling the null result using the Elvis Operator (?:)
    val finalValue = result2 ?: 0
    println("Fallback value: $finalValue") // Prints 0
}
