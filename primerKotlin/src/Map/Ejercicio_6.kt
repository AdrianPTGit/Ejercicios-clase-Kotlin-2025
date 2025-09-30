package Map

import kotlin.math.ln

/*
*Ejercicio 6:
 Imagina que quieres asociar cada compañero con su nota en un examen.
 Crea un MutableMap<String, Int> llamado notas con estos pares iniciales:
        Zoe → 7
        Oscar → 9
        Lucía → 8
        Tomás → 7

Luego:

Imprime el tamaño del mapa.

Agrega: Blanca → 8, Maribel → 7.

Modifica la nota de Oscar a 7.

Imprime la nota de Zoe.

Intenta obtener la nota de “Tomás”.

Remueve la entrada de Maribel.

Imprime el mapa final


 */
fun main() {
    val notas = mutableMapOf<String,Int>(
        "Zoe" to 7,
        "Oscar" to 9,
        "Lucia" to 8,
        "Tomas" to 7
    )

    println("tamano del mapa: ${notas.size}")
    notas["Blanca"]=7
    notas["Maribel"]=7
    notas["Oscar"] = 7
    println("la nota de Zoe es: ${notas["Zoe"]}")
    println("La nota de tomas es: ${notas["Tomas"]}")
    notas.remove("Maribel")
    println("Notas clase ${notas}")
}