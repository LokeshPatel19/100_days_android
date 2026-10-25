package day01


fun main() {
    val word = "banana"
    val frequency = mutableMapOf<Char, Int>()

    for (ch in word) {
        frequency[ch] = frequency.getOrDefault(ch, 0) + 1
    }

    println(frequency)
}
