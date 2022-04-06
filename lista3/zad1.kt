package lista3
import java.io.File

fun main() {
    val filePath = "F:\\Javka\\Wstep_do_mobilek\\src\\main\\WstepPUM\\lista3\\slowa.txt"
    val wordList = mutableListOf<String>()
    File(filePath).forEachLine { wordList.add(it) }

    val gallows = mutableListOf (
        "  +---+",
        "      |",
        "      |",
        "      |",
        "     ==="
    )

    var lives = 6
    val answer = wordList.random()
    val usedLetters = mutableListOf<Char>()
    val password = mutableListOf<Char>()
    for (i in answer.indices) password += '-'

    println("Loaded ${wordList.size} words")
    println("Chosen word length is ${answer.length}")

    while (true) {
        gallows(gallows, lives)
        println("Password: $password")
        println("Lives: $lives")
        println("Used letters: $usedLetters")
        print("Enter a single letter: ")

        var guess = readLine()!!.lowercase()
        val regex = "[0-9!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?\\s\\n]".toRegex()

        while (guess.contains(regex) || guess == "" || guess.length > 1) {
            println("Try again")
            print("Enter a single letter: ")
            guess = readLine()!!.lowercase()
        }

        if (usedLetters.contains(guess[0])) println("Letter already used")

        usedLetters += guess[0]

        for (i in answer.indices) {
            if (guess[0] == answer[i]) password[i] = guess[0]
        }

        if (guess[0] !in answer) lives--

        if ('-' !in password) {
            println("Congratulation you won!")
            break
        }

        if (lives == 0) {
            gallows(gallows, lives)
            println("Password: $password")
            println("Lives: $lives")
            println("Used letters: $usedLetters")
            println("You lost")
            println("Answer: $answer")
            break
        }
    }
}

fun gallows(gallows: MutableList<String>, lives: Int) {
    when (lives) {
        5 -> { gallows[1] = " 0    |" }
        4 -> { gallows[2] = " |    |" }
        3 -> { gallows[2] = "/|    |" }
        2 -> { gallows[2] = "/|\\   |" }
        1 -> { gallows[3] = "/     |" }
        0 -> { gallows[3] = "/ \\   |" }
    }
    gallows.forEach { println(it) }
}