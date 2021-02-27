package de.sinjeba.heads.first.kotlin.scissors

import kotlin.random.Random

fun main() {
    val gameStates = arrayOf("Rock", "Paper", "Scissors")

    val gameChoice = getGameChoice(gameStates)

    val userChoice = getUserChoice(gameStates)

    val gameResult = getGameResult(gameChoice, userChoice)
    println("Game choice: $gameChoice")
    println("User choice: $userChoice")
    println("The result of the game is: $gameResult")
}

fun getGameChoice(gameStates: Array<String>): String = gameStates[Random.nextInt(gameStates.size)]

fun getUserChoice(gameStates: Array<String>): String {
    val join = gameStates.joinToString(", ")
    while (true) {
        println("Please enter: $join")
        val readLine = readLine()
        val any = gameStates.filter { it.equals(readLine.orEmpty(), ignoreCase = true) }.any()
        if (any) {
            return readLine.orEmpty()
        }
        println("No valid input.")
    }
}

fun getGameResult(gameChoice: String, userChoice: String): String {
    if (gameChoice == userChoice) {
        return "Tie!"
    }
    if ((gameChoice == "Rock" && userChoice == "Scissor")
        || (gameChoice == "Paper" && userChoice == "Rock")
        || (gameChoice == "Scissor" && userChoice == "Paper")
    ) {
        return "Computer wins"
    }
    return "User wins"
}
