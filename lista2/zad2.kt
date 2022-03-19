package lista2

fun main() {
    print("Enter a proper Roman number: ")
    var input = readLine()!!

    // keep checking until correct input
    while (!isAllowed(input) || input == "") {
        println("Try again")
        print("Enter a natural number: ")
        input = readLine()!!
    }

    println(convertFromRoman(input))
}

fun isAllowed(input: String): Boolean {
    val allowed = charArrayOf('I', 'V', 'X', 'L', 'C', 'D', 'M')
    return input.all { it in allowed }
}

fun convertFromRoman(s: String): Int {
    var result = 0
    val list = arrayOfNulls<Int>(s.length)

    for (i in s.indices) {
        when (s[i]) {
            'M' -> list[i] = 1000
            'D' -> list[i] = 500
            'C' -> list[i] = 100
            'L' -> list[i] = 50
            'X' -> list[i] = 10
            'V' -> list[i] = 5
            'I' -> list[i] = 1
        }
    }

    for (i in 0 until list.indices.last) {
        if (list[i]!! < list[i+1]!!) result -= list[i]!!    // if next character larger than previous, subtract from result
        else result += list[i]!!                            // else, add to result
    }

    return result + list[list.size-1]!!     // add last character, which was excluded from for loop and return result
}