package day01

class Person(
    var name: String,
    var age: Int
) {
    fun display() {
        println("Name : $name and Age : $age")
    }
}


fun main() {

    val person1 = Person("Lokesh", 24)
    val person2 = Person("Aditya", 25)
    person1.display()
    person2.display()
}