fun main() {
    for (i in 1..100) {
        var res = ""

        if (i % 3 == 0) res += "trzy"
        if (i % 5 == 0) res += "piec"
        if (i % 7 == 0) res += "siedem"
        if (i % 11 == 0) res += "jedenascie"
        if (i % 13 == 0) res += "trzynascie"
        if ((i % 3 != 0) and (i % 5 != 0) and (i % 7 != 0) and
            (i % 11 != 0) and (i % 13 != 0)
        ) res += i.toString()

        println(res)
    }
}