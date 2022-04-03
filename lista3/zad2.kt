package lista3

fun main() {
    tally()
}

fun tally() {
    val candidates = mutableMapOf("Rafal" to 0, "Robert" to 0, "Ania" to 0)

    // which one is the preferred candidate
    val rafa_ania = mutableMapOf("Rafal" to 0, "Ania" to 0)
    val rafa_robe = mutableMapOf("Rafal" to 0, "Robert" to 0)
    val robe_ania = mutableMapOf("Robert" to 0, "Ania" to 0)

    for (i in 0..8) {                              // 9 voters
        val shuffled = candidates.keys.shuffled()  // simulating voter choices

//        println(shuffled)

        for (name in shuffled) {
            val rank = shuffled.size - shuffled.indexOf(name)   // how many points based on position
            candidates[name] = rank

//            println(candidates)
        }

        if (candidates["Rafal"]!! > candidates["Ania"]!!) {
            rafa_ania["Rafal"] = rafa_ania["Rafal"]!!.plus(1)
        } else rafa_ania["Ania"] = rafa_ania["Ania"]!!.plus(1)

        if (candidates["Rafal"]!! > candidates["Robert"]!!) {
            rafa_robe["Rafal"] = rafa_robe["Rafal"]!!.plus(1)
        } else rafa_robe["Robert"] = rafa_robe["Robert"]!!.plus(1)

        if (candidates["Robert"]!! > candidates["Ania"]!!) {
            robe_ania["Robert"] = robe_ania["Robert"]!!.plus(1)
        } else robe_ania["Ania"] = robe_ania["Ania"]!!.plus(1)

        println(rafa_ania)
        println(rafa_robe)
        println(robe_ania)
    }
}