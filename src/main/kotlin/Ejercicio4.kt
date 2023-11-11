import kotlin.random.Random
/*
Crea un programa que genere un número aleatorio (entre 0 y 20) de entrada y lo guarde en
una variable. El sistema irá pidiendo números al usuario hasta que coincida con el aleatorio
generado (en caso de no coincidir mostrará el mensaje "Lo siento, inténtalo de nuevo").
Cuando coincida el sistema deberá mostrar el mensaje "Enhorabuena, has acertado el
número en 5 intentos" (Adivina)
*/
fun main() {
    val numeroAleatorio = Random.nextInt(21) //Generar un numero aleatorio entre 0 y 20
    var intentos = 0
    var adivinado = false

    while (!adivinado) {
        print("Ingresa un número para jugar: ");
        val numero = readLine()?.toIntOrNull()
        if (numero != null) {
            intentos++
            if (numero == numeroAleatorio) {
                adivinado = true
                print("¡¡¡Enhorabuena, has acertado el número en $intentos intentos!!!")
            } else {
                println("Lo siento, intentalo de nuevo!")
            }
        } else {
            print("Por favor, ingresa un número valido")
        }
    }
}