fun main() {
    for (i in 1..100) when {
        (i % 3 == 0) and (i % 5 == 0) -> println("trzypiec")
        i % 3 == 0 -> println("trzy")
        i % 5 == 0 -> println("piec")
        else -> println(i)
    }
}