package lista4

fun main() {
    fun <A> isSorted(lista: List<A>, order: (A, A) -> Boolean): Boolean {
        for (i in lista.indices) {
            for (j in i+1 until lista.size) {
                if (!order(lista[i], lista[j])) return false
            }
        }
        return true
    }

    val s1 = isSorted(listOf(1, 2, 3, 4), {i: Int, j: Int -> i < j})
    val s2 = isSorted(listOf(1, 1, 1, 1), {i: Int, j: Int -> i == j})
    val s3 = isSorted(listOf("ahyyhh", "bkjn", "cnn", "duu"), {i: String, j: String -> i.first() < j.first()})

    println(s1)
    println(s2)
    println(s3)
}