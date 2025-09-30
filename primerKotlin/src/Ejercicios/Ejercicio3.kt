package Ejercicios

fun main() {
    println(invertirCadena("Viva kotlin"))
}

private fun invertirCadena(cadena: String): String {
    val longitudCadena = cadena.length - 1
    var cadenaInvertida = ""// con val es inmutable y no se puede modificar

    for (i in 0..longitudCadena) {
        cadenaInvertida += cadena[longitudCadena - i]
    }
    return cadenaInvertida
}
