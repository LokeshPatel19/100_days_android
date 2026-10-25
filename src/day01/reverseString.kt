package day01

fun main() {
    println("Enter the string :")
    val originalString = readln()

    println("String before reverse : $originalString")
    print("String after reverse : ${originalString.reversed()}")
}