package lista2

fun main() {
    print("Enter a natural number: ")
    var input = readLine()!!

    // keep checking until correct input
    while (!isNumber(input) || input == "") {
        println("Try again")
        print("Enter a natural number: ")
        input = readLine()!!
    }

    println(convertToRoman(input.toInt()))
}

fun isNumber(input: String): Boolean {
    return input.all { it in ('0'..'9') }
}

fun convertToRoman(_n: Int): String {
    var n = _n
    var result = ""
    val pairs = mapOf(
        1000 to "M",
        900 to "CM",
        500 to "D",
        400 to "CD",
        100 to "C",
        90 to "XC",
        50 to "L",
        40 to "XL",
        10 to "X",
        9 to "IX",
        5 to "V",
        4 to "IV",
        1 to "I"
    )

    while (n > 0) {
        for (i in pairs) {          // check all keys
            if (n >= i.key) {       // when input larger than key
                result += i.value   // append key's value to result
                n -= i.key          // subtract appended value from input
                break
            }
        }
    }

    return result
}