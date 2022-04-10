package lista4

fun main() {
    fun List<Int>.tail(): List<Int> {
        return this.drop(1)
    }

    fun List<Int>.head(): Int {
        return this[0]
    }

    val numbers = (1..5).toList()
    println(numbers.tail())
    println(numbers.head())
}