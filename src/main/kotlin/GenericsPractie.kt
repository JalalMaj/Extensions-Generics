fun main(args: Array<String>) {
    val info1 = Info<String>()
    info1.getLength("some string")

    val info2 = Info<Double>()
    info2.getLength(34.3333333)

    val info3 = Info<ArrayList<Int>>()
    info3.getLength(arrayListOf(3, 4, 5, 7, 21, 14))

    val info4 = Info<HashMap<String, Int>>()
    info4.getLength(hashMapOf("one" to 1, "two" to 2))
    info4.print(hashMapOf("one" to 1, "two" to 2))
}

class Info<T> {
    fun getLength(item: T) {
        println(item.toString().length)
    }

    fun print(item: T) {
        println(item)
    }
}