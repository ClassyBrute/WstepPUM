package lista2

fun main() {
    print("Enter a natural number: ")
    var input = readLine()!!
//    val input = "142857"

    // keep checking until correct input
    while (!isNumber1(input) || input == "") {
        println("Try again")
        print("Enter a natural number: ")
        input = readLine()!!
    }

    println(isCyclic(input))
}

fun isNumber1(input: String): Boolean {
    return input.all { it in ('0'..'9') }
}

fun isCyclic(s: String): Boolean {
    // check if number too short
    if (s.length == 1) return false

    // check if all numbers the same
    var count = 0
    for (i in s) {
        if (s[0] == i) {
            count++
        }
    }
    if (count == s.length) return false

    // check if not cyclic
    for (i in 1..s.length){
        val num = i * s.toInt()
        println("-------")
        println(num)

        for (j in s) {
            if (j in num.toString()) continue
            else return false
        }
    }

    return true
}