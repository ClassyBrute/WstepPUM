fun main() {
    for (i in 1..100) when {
        // dopiero 105, więc nie mieści się w przedziale
        i % (3 * 5 * 7) == 0 -> println("trzypiecsiedem")
        i % (3 * 5) == 0 -> println("trzypiec")
        i % (3 * 7) == 0 -> println("trzysiedem")
        i % (5 * 7) == 0 -> println("piecsiedem")
        i % 3 == 0 -> println("trzy")
        i % 5 == 0 -> println("piec")
        i % 7 == 0 -> println("siedem")
        else -> println(i)
    }
}