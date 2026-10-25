package day01

fun main() {
    println("Enter the string:")
    val sentence = readln()

    val wordCount = sentence.trim()
        .split(Regex("\\s+"))
        .count { it.isNotEmpty() }

    println("The word count of this sentence is: $wordCount")
}