package lista3

import kotlin.math.abs

fun main() {
    val candidates = mutableMapOf("Rafal" to 0, "Robert" to 0, "Ania" to 0)

    // which one is the preferred candidate
    val rafa_ania = mutableMapOf("Rafal" to 0, "Ania" to 0, "str" to 0)
    val rafa_robe = mutableMapOf("Rafal" to 0, "Robert" to 0, "str" to 0)
    val robe_ania = mutableMapOf("Robert" to 0, "Ania" to 0, "str" to 0)
    val pairs = mutableListOf(rafa_ania, rafa_robe, robe_ania)

    for (i in 0..8) {                              // 9 voters
        val shuffled = candidates.keys.shuffled()  // simulating voter choices

        for (name in shuffled) {
            candidates[name] = shuffled.size - shuffled.indexOf(name)   // how many points based on position
        }

        win(candidates, rafa_ania, "Rafal", "Ania")
        win(candidates, rafa_robe, "Rafal", "Robert")
        win(candidates, robe_ania, "Robert", "Ania")
    }

    // calculating strength of every pair
    rafa_ania["str"] = abs(rafa_ania["Rafal"]!! - rafa_ania["Ania"]!!)
    rafa_robe["str"] = abs(rafa_robe["Rafal"]!! - rafa_robe["Robert"]!!)
    robe_ania["str"] = abs(robe_ania["Robert"]!! - robe_ania["Ania"]!!)

    // finding the strongest pair
    var strongestPair = pairs.first()
    pairs.forEach {
        if (it["str"]!! > strongestPair["str"]!!) strongestPair = it
    }

    println(pairs)
    println(strongestPair)

    // tyle się udało zrobić to tyle zostawię
    // ale mam wrażenie że troszkę za trudne zadanie :)
}

fun win(candidates: MutableMap<String, Int>,
        pair: MutableMap<String, Int>,
        first: String,
        second: String) {
    if (candidates[first]!! > candidates[second]!!) {
        pair[first] = pair[first]!!.plus(1)
    } else pair[second] = pair[second]!!.plus(1)
}