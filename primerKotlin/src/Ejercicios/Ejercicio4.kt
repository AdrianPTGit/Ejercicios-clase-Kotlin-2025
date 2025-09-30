package Ejercicios

fun main() {
    print(convertirBinario(100))
}

private fun convertirBinario(numero : Int): String {

    var numDecimal : Int = numero
    var binario : String = ""

    while (numDecimal != 0){

        val resto : Int = numDecimal % 2

        numDecimal /= 2

        binario =  "$binario$resto"
    }
    return binario
}