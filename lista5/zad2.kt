package lista5

fun main() {
//    fun map(list: List<String>): List<Pair<Char, List<String>>> {
//        val map = mutableMapOf<Char, List<String>>()
//        list.forEach { map[it[0]] = listOf() } // populate keys with empty values
//        list.forEach { if (it.length % 2 == 0) map[it[0]] = map[it[0]]!! + it } // assign even values to keys
//        return map.toSortedMap().toList()
//    }

    fun map(list: List<String>) {
        val grouped = list.groupBy { it[0] }

        for (i in grouped) {
            val lista = i.value.filter { it.length % 2 == 0 }
            println(lista)
        }

//        return list.groupBy{ it[0] }.toSortedMap().toList()
    }

    val list = listOf("cherry", "blueberry", "citrus", "apple", "apricot", "banana", "coconut")
    println(map(list))
}