/**
 * Exercise: Extension functions
Add an extension function to the ArrayList class that returns a message saying how many elements the list contains.

Create an ArrayList and print out the extension function message.
 */

fun main(args: Array<String>) {
    val list = arrayListOf(1, 2, 4, 6, 8, 10)
    println(list.message())
}

fun ArrayList<Int>.message() :String = "This array contains ${this.size} elements"
