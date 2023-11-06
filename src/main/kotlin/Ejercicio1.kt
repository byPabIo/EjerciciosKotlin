/*
(MayorQue) Hágase un programa que lea dos enteros y compruebe si el primero es o no
mayor que el segundo. En la salida se mostrará “El primero es mayor que el segundo” o “El
primero no es mayor que el segundo”.
 */

fun main() {
    println("Ingrese el primer entero: ")
    val num1 = readLine()?.toInt() ?: 0

    println("Ingrese el segundo entero: ")
    val num2 = readLine()?.toInt() ?: 0

    if (num1 > num2) {
        println("El primero es mayor que el segundo")
    } else {
        println("El primero no es mayor que el segundo")
    }
}
