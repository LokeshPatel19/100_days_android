package day01

fun getGrade(score: Int): Char {
    return when (score) {
        in 90..100 -> 'A'
        in 80..89  -> 'B'
        in 70..79  -> 'C'
        in 60..69  -> 'D'
        in 0..59   -> 'F'
        else       -> 'I' // 'I' for Invalid score out of bounds
    }
}

fun main() {
    val scores = listOf(95, 82, 60, 45, -5)
    for (score in scores) {
        println("Score: $score -> Grade: ${getGrade(score)}")
    }
}
