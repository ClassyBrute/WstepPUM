package lista4

fun main() {
    tailrec fun fib(i: Int, a: Int = 0, b: Int = 1): Int {
        if (i == 0) return a
        if (i == 1) return b
        return fib(i - 1, b, a + b)
    }
    fun log2(i: Int): Int {
        return kotlin.math.log2(i.toDouble()).toInt()
    }

    fun formatResult(name: String, n: Int, f: (Int) -> Int): String {
        val msg = "%d %s %d"
        return msg.format(n, name, f(n))
    }

    println(formatResult("number of fibonacci sequence is", 8, ::fib))
    println(formatResult("'s log2 is", 8, ::log2))
}