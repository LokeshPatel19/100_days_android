package day01

fun main() {

    val numbers = listOf(12, 5, 27, 8, 19)
    var maxNum = numbers[0]
    var minNum = numbers[0]

    for (i in numbers) {
        if (i > maxNum) {
            maxNum = i
        }

        if (i < minNum) {
            minNum = i
        }
    }

    println("The largest number is : $maxNum")
    print("The smallest number is : $minNum")
}