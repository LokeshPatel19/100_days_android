package day01

fun main() {
    println("Enter the string :")
    val palindrome = readln()

    if (palindrome.equals(palindrome.reversed(), ignoreCase = true)) {
        print("Its a palindrome")
    } else {
        print("Its not a palindrome")
    }
}