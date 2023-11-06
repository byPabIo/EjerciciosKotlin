/*
(Condiciones) Léase un número entero. Se comprobará si dicho número es o no múltiplo de
20, y también se comprobará si está o no entre -100 y 100. En la salida se mostrará uno de
los siguientes mensajes:
“Es múltiplo de 20 y está entre -100 y 100”. “Es múltiplo de 20 y no está entre -100 y 100”. “No
es múltiplo de 20 y está entre -100 y 100”- “No es múltiplo de 20 y no está entre -100 y 100”.
 */

fun main() {
    print("Ingrese un número entero: ")
    val num = readLine()?.toInt() ?:0

    if (num%20 == 0){
        if (num<100 && num>-100){
            println("Es múltiplo de 20 y está entre -100 y 100")
        } else{
            println("Es múltiplo de 20 y no está entre -100 y 100")
        }
    } else{
        if (num<100 && num>-100){
            println("No es múltiplo de 20 y está entre -100 y 100")
        } else{
            println("No es múltiplo de 20 y no está entre -100 y 100")
        }
    }
}