package Ejercicios

fun main() {
    println("Introduce una edad: ")

    val edad : Int = readLine()!!.toInt() // readLine()!!.toInt() con !! el usuario NUNCA introducirá un null

    /*
    val edad : Int = readLine()?.toIntOrnull() hay que comprobar si edad es null con un

    if (edad != null){
        when{
            edad in 0..17 -> println("Soy menor de edad.")
            edad == 18 -> println("Soy mayor de edad.")
            edad > 18 -> println("Ya tengo carnet de conducir")

        }
    }else { println("Edad invalida")
     */

    when{
        edad in 0..17 -> println("Soy menor de edad.")
        edad == 18 -> println("Soy mayor de edad.")
        edad > 18 -> println("Ya tengo carnet de conducir")
        else -> println("Edad invalida")
    }



    }
