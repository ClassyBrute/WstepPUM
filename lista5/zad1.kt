package lista5

fun main() {
    fun licz(input: List<Any>): List<Any> {
        val lista = mutableListOf<Any>()
        input.forEachIndexed { index, value ->
            when (value) {
                is Int -> if (value > 0 && index % 2 != 0) lista += value * value
                is Double -> if (value > 0 && index % 2 != 0) lista += value * value
                is Float -> if (value > 0 && index % 2 != 0) lista += value * value
                else -> println("none")
            }
        }
        return lista
    }

    val input = listOf(1, 2, 3.5, 3.7, 5, -6, 1, 1)
    println(licz(input))
}
