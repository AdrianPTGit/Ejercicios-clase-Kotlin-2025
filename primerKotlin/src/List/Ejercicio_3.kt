package List
/*
* Ejercicio 3:
* Crea una Lista inmutable llamada alumnos que contenga todos los nombres de tus compañeros .
* Imprime el tamaño de la lista. Luego imprime el elemento en la posición 2 y posición 5,
* usando tanto la posición [] como utilizando get().
*/
fun main() {
    val lista = listOf<String>("Zoe","Adrian","Patricia","Tomas","Carlos","Ana","Antonio","Luis")
    println(lista[2])
    println(lista[5])

    println(lista.get(2))
    println(lista.get(5))
}