package lista3

val candidates = mutableMapOf("Rafal" to 0, "Robert" to 0, "Ania" to 0)

fun main() {

    tally()

}

fun tally() {
    for (i in 0..6) {                              // 7 voters
        val shuffled = candidates.keys.shuffled()  // simulating voter choices

        println(shuffled)

        for (name in shuffled) {
            val rank = shuffled.size - shuffled.indexOf(name)   // how many points based on position
            candidates[name] = candidates[name]!!.plus(rank)

            println(candidates)
        }


    }

}