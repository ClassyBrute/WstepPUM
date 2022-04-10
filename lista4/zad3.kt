package lista4

fun main() {
    tailrec fun fib(i: Int, a: Int = 0, b: Int = 1): Int {
        if (i == 0) return a
        if (i == 1) return b
        return fib(i - 1, b, a + b)
    }
    print(fib(20))
}