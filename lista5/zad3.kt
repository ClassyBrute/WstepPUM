package lista5

fun main() {
    fun permutations(vararg input: List<Int>): Set<List<Int>> {
        val input2 = mutableListOf<Int>()
        input.forEach { input2 += it }

        if (input2.isEmpty()) return setOf(emptyList())

        val result = mutableSetOf<List<Int>>()
        for (i in input2.indices) {
            permutations(input2 - input2[i]).forEach { item -> result.add(item + input2[i]) }
        }
        return result
    }

    println(permutations(listOf(1, 2, 3)))
}
