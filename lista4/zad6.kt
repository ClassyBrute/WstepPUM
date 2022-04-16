package lista4

val <T> List<T>.head
    get() = first()

val <T> List<T>.tail
    get() = drop(1)

fun main() {
    val numbers = (1..5).toList()
    println(numbers.tail)
    println(numbers.head)
}