package lista5

fun main() {
    fun check(n: Int, lista: List<Int>) {
        println(lista.windowed(n, 1))
    }

    check(5, listOf(35, 25, 15, 25, 47, 40, 62, 55, 65, 95, 102, 117, 150, 182, 127, 219, 299, 277, 309, 576))
}