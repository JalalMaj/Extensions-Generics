fun main(args: Array<String>) {
    val myBox = Box<String>()
    myBox.display("Contents")
    val myBox1 = Box<Car1>()
    myBox1.display(Car1())

    val myBox2 = NewBox<Int, Float>()
    myBox2.display(23, 34.5F)

}

class Box<T> {
    fun display(item:T) {
        println(item)
    }
}

class NewBox<T, U> {
    fun display(item: T, item2: U){
        println(item)
        println(item2)
    }
}
class Car1 {

}