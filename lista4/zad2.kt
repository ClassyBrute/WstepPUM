package lista4

fun main() {
    val f: (String) -> String = { s: String -> "$s!" }
    val f1: (String) -> String = { "$it!" }

    println(f("test"))
    println(f1("test"))
}
