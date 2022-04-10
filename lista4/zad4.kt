package lista4

fun main() {
    fun log2(i: Int): Int {
        return kotlin.math.log2(i.toDouble()).toInt()
    }
    print(log2(8))
}