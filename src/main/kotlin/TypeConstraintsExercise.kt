import java.util.SortedMap

/**
 * Create an abstract class Shape that defines a method getArea which takes an argument size.
 * Create two subclasses, Square and Circle, that inherit from Shape, and implement the method.
 * Square area = size * size
 * Circle area = size * size * 3.1415
 * Create another class Geometry that takes a generic argument of type Shape, and has a method that prints a message
 * which includes the area of the shape that is passed.

Instantiate the Geometry class and print the area of the shape.
 */

fun main(args: Array<String>) {
    val geometry1 = Geometry<Square>()
    geometry1.print(Square(), 12)

    val geometry2 = Geometry<Circle>()
    geometry2.print(Circle(), 5)
}

abstract class Shape {
    abstract fun getArea(size: Int): Double
}

class Square: Shape() {
    override fun getArea(size: Int): Double{
        return size.toDouble() * size.toDouble()
    }
}

class Circle: Shape() {
    override fun getArea(size: Int): Double {
        return size * size * 3.1415
    }
}

class Geometry<T: Shape> {
    fun print(shape: T, size: Int) {
        println("The area of ${shape.toString()} is ${shape.getArea(size)}")
    }
}