package lista4

fun main() {
    fun suma(array: Array<Int>): Int {
        return array.map { it }
            .filter { it > 0 }
            .reduce { sum, element -> sum + element }
    }

    val array = arrayOf(1, -4, 12, 0, -3, 29, -150)
    println(suma(array))
}