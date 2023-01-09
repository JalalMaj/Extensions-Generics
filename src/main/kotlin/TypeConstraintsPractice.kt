fun main(args: Array<String>) {
    val printer1 = Printer<Set<String>>()
    printer1.iterate(hashSetOf("Jalal", "Ali", "Carol"))
}

class Printer<T: Collection<String>> {
    fun iterate(collection: T){
        collection.forEach {
            println(it)
        }
    }
}