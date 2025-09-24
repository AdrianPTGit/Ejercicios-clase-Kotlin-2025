package Ejercicios
/*
EJERCICIO 5
Crea una función que calcule el valor del parámetro perdido correspondiente a la ley de Ohm.
Ley de ohm:
- Enviaremos a la función 2 de los 3 parámetros (V, R, I), y retornará el valor del tercero (redondeado a 2 decimales).
- Si los parámetros son incorrectos o insuficientes, la función retornará la cadena de texto "Valores inválidos"

CORRIENTE-----> I=V/R
TENSIÓN-------> V=I⋅R
RESISTENCIA---> R=V/I
 */

fun main() {
    println("Calculadora Ley de Ohm")

    println("Que queres calcular :  \n escribe: tension, corriente, o resistencia ")
    val calculo : String? = readLine().toString()


    if(calculo == "tension") {
        println("tension")
    } else if (calculo == "corriente") {
        println("corriente")
    }else if (calculo == "resistencia") {
        println("resistencia")
    } else {
        println("Escribe: tension, corriente, o resistencia ")
    }



}