import kotlin.random.Random

fun main() {
    println("Bienvenido al juego Piedra, Papel o Tijera!")
    println("Por favor elige una opción:")
    println("1. Piedra")
    println("2. Papel")
    println("3. Tijera")
    println("4. Salir")

    var continueGame = true

    while (continueGame) {
        print("Tu elección: ")
        when (readLine()) {
            "1" -> playGame("Piedra")
            "2" -> playGame("Papel")
            "3" -> playGame("Tijera")
            "4" -> {
                println("Gracias por jugar!")
                continueGame = false
            }
            else -> println("Opción inválida. Por favor elige una opción válida.")
        }
    }
}

fun playGame(userChoice: String) {
    val options = listOf("Piedra", "Papel", "Tijera")
    val randomIndex = Random.nextInt(options.size)
    val computerChoice = options[randomIndex]

    println("Tu elección: $userChoice")
    println("Elección de la computadora: $computerChoice")

    if (userChoice == computerChoice) {
        println("Empate!")
    } else if ((userChoice == "Piedra" && computerChoice == "Tijera") ||
            (userChoice == "Papel" && computerChoice == "Piedra") ||
            (userChoice == "Tijera" && computerChoice == "Papel")) {
        println("¡Ganaste!")
    } else {
        println("¡Perdiste!")
    }
}
3