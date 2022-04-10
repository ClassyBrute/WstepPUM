package lista4

fun main() {
    fun countElements(array: Array<Array<Char>>): Map<Char, Int> {
        val mapa: MutableMap<Char, Int> = mutableMapOf()

        for (i in array) {
            for (j in i) {
                mapa[j] = 0
            }
        }

        for (i in array) {
            for (j in i) {
                mapa[j] = mapa[j]!!.plus(1)
            }
        }

        return mapa
    }

    val input = arrayOf(
        arrayOf('a', 'b', 'c'),
        arrayOf('c', 'd', 'f'),
        arrayOf('d', 'f', 'g'))

    println(countElements(input))
}