package lista4

fun main() {
    val lamb = { s: String, i: Int -> s.repeat(i) }
    print(lamb("a", 3))
}
