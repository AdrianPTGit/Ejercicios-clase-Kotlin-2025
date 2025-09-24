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
    println("escribe la tension del circuito")

    val v : Double? = readLine()?.toDoubleOrNull()

    println("escribe la resistencia del circuito")
    val r : Double? = readLine()?.toDoubleOrNull()

    println("escribe la corriente del circuito")
    val i : Double? = readLine()?.toDoubleOrNull()

    println("El resultado es: ${calculoLeyOhm(v, r, i)}")
}

fun calculoLeyOhm (V: Double?, R: Double?, I: Double?) : Any? {

    if( V == null && R != null && I != null){

        return println("La tension es: ${redondear(I*R)}, Voltios")
    } else if (R == null && V != null && I != null) {

        return println("La resistencia es: ${redondear(V/I)}, Ohmios")
    } else if (I == null && V != null && R != null) {

        return println("La corriente es: ${redondear(V/R)}, Amperios")
    }else {
        return "Valores inválidos, Escribe al menos dos parametros"
    }
}

// Función para redondear a 2 decimales y devolver como String
fun redondear(valor: Double): Double? {
    val resultado = kotlin.math.round(valor * 100) / 100
    return resultado
}