import kotlin.random.Random
/*
Modifica el ejercicio anterior para que una vez adivinado el número el sistema muestre el
siguiente mensaje: "Quieres volver a jugar (S/N)":
*/
fun main() {
    do {
        val numeroAleatorio = Random.nextInt(21) //Generar un numero aleatorio entre 0 y 20
        var intentos = 0
        var adivinado = false

        while (!adivinado) {
            print("Ingresa un número para jugar: ")
            val numero = readLine()?.toIntOrNull()
            if (numero != null) {
                intentos++
                if (numero == numeroAleatorio) {
                    adivinado = true
                    println("¡¡¡Enhorabuena, has acertado el número en $intentos intentos!!!")
                } else {
                    println("Lo siento, inténtalo de nuevo!")
                }
            } else {
                print("Por favor, ingresa un número válido")
            }
        }

        print("¿Quieres volver a jugar? (S/N): ")
    } while (readLine()?.equals("S", ignoreCase = true) == true)
}
