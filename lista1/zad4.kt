fun main() {
    fun missingNumber(tab: List<Int>): Int {
        var res = 0

        for (i in tab.indices + 1) {
            if (i !in tab) {
                res = i
                break
            } else res = tab.size
        }
        return res
    }

    val tab = intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

// testowanie 20 przypadków
    for (i in 0..20) {
        tab.shuffle()
        val result = tab.dropLast(1)
        println(result)
        println("Missing: " + missingNumber(result))
        println("===============================")
    }
}