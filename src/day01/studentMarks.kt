package day01

data class Student(
    val name: String,
    val rollNumber: Int,
    val marks: Int
)

fun main() {
    // 1. Create a list of students
    val students = listOf(
        Student("Rahul", 101, 75),
        Student("Priya", 102, 45),
        Student("Amit", 103, 88),
        Student("Sneha", 104, 60),
        Student("Vikram", 105, 58)
    )

    // 2. Filter and print names of students who scored at least 60 marks
    println("Students who scored at least 60 marks:")
    students.filter { it.marks >= 60 }
        .forEach { println(it.name) }
}
