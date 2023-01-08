fun main(args: Array<String>) {
    println(String.getType())
    println(Double.printType())
    Car.printMe()
    println(Car.Mercedes.model)
    Car.Mercedes.run()
}

fun String.Companion.getType() = "This is of String type"

fun Double.Companion.printType() = "This is a class of double"

class Car{
    companion object {}
    object Mercedes{
        val model ="Mercedes"
    }
}

fun Car.Companion.printMe() {
    println("BMW")
}

fun Car.Mercedes.run() {
    println("Running @ 1000 rpm")
}
