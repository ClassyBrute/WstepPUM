package lista5

fun main() {
    fun map(list: List<String>): List<Pair<Char, List<String>>> {
        val grouped = list.groupBy{ it[0] }.toMutableMap()
        grouped.forEach{ grouped[it.key] = it.value.filter{ it.length % 2 == 0 } }
        return grouped.toSortedMap().toList()
    }

    val list = listOf("cherry", "blueberry", "citrus", "apple", "apricot", "banana", "coconut", "pineapples")
    println(map(list))
}
