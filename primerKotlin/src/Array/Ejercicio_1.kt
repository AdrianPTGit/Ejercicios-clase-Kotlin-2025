package Array

/*
* Ejercicio 1:
* Crea un array de nombre DAM2 con los nombres de 4 de tus compañeros de clase:. Luego crea otro array  llamado 2DAM con
* el nombre de otros 4 compañeros Luego une ambos arrays en un nuevo array llamado claseCompleta. Imprime todos los
* nombres uno por uno usando los índices de los elementos.
*/

fun main() {
    val nombres = arrayOf<String>("Zoe","Adrian","Patricia","Tomas")
    val nombres2 = arrayOf("Carlos","Ana","Antonio","Luis")
    val claseCompleta = nombres +nombres2

    println(claseCompleta[0])
    println(claseCompleta[1])
    println(claseCompleta[2])
    println(claseCompleta[3])
    println(claseCompleta[6])
    println(claseCompleta[7])





}