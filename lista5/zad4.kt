package lista5

fun main() {
    fun check(n: Int, lista: List<Int>): Int {
        val preamble = lista.windowed(n, 1)
        preamble.forEachIndexed { index, list ->
            val comparing = lista[n + index]
            if (list.find { comparing - it in list } == null) return comparing
        }
        return 0
    }

    println(check(2, listOf(35, 25, 15, 25, 47, 40, 62, 55, 65, 95, 102, 117, 150, 182, 127, 219, 299, 277, 309, 576)))
}