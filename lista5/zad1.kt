package lista5

fun main() {
    fun licz(input: List<Any>) {
        val lista = emptyList<Numbers>()

        
    }

    val input = listOf(1, 2, 3.5, 5, -6, 1, 1)
    println(licz(input))
}

sealed class Numbers: Number() {
    data class Integers(val i: Int)
    data class Doubles(val d: Double)
    data class Floats(val f: Float)
}

