package day01

import kotlin.math.PI

interface Shape {
    fun calculateArea(): Double
}

class Circle(val radius: Double) : Shape {
    override fun calculateArea(): Double {
        return PI * radius * radius
    }
}

class Rectangle(val width: Double, val height: Double) : Shape {
    override fun calculateArea(): Double {
        return width * height
    }
}

fun main() {
    val shapes: List<Shape> = listOf(
        Circle(5.0),
        Rectangle(4.0, 6.0)
    )

    for (shape in shapes) {
        // Automatically calls the correct implementation at runtime
        println("Area: %.2f".format(shape.calculateArea()))
    }
}
