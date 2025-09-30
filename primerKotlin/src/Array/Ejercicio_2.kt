package Array

fun main() {
    /**
     * Ejercicio 2:
     *  Usando el array claseCompleta del ejercicio anterior, cambia el nombre del alumno en el índice 3 por “Nacho”.
     *  Luego imprime el nombre en esa posición para verificar el cambio.
     */
    val claseCompleta = arrayOf<String>("Zoe","Adrian","Patricia","Tomas","Carlos","Ana","Antonio","Luis")

    claseCompleta[3]="Nacho"
    print(claseCompleta[3])

}