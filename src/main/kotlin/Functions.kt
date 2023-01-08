fun main() {
    val name = "Jalal"
    println(name.slim())
    println("Jalal".betterLength)
    println("Jalal".size)
}
val String.betterLength:Int
    get() = 200

fun String.slim() = this.substring(1, length-1)

val String.size :Int
    get() = this.length