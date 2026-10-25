package day01

fun main() {

    println("Enter the string :")
    val nullChecking: String? = readln()

    if (nullChecking != null) {
        print(nullChecking.length)
    } else {
        print("No value")
    }
}