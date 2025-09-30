package Set

fun main() {
    /**
     * Ejercicio 5
     * Crea un MutableSet llamado ConjuntoClase con 4 nombres de compañeros
     * 1. Imprime su tamaño.
     * 2. Agrega a “Blanca”.
     * 3. Agrega a “Lucía” otra vez (nombre repetido).
     * 4. Imprime el tamaño de nuevo.
     * 5. Quita a Diego.
     * 6. Comprueba si “Esmeralda” está en el conjunto.
     *    Imprime el conjunto y los resultados de tamaño y existencia.
     */
    println("Crea un MutableSet")
    val conjuntoClase = mutableSetOf<String>("Zoe","Adrian","Patricia","Tomas")
    println("Imprime su tamaño.")
    println(conjuntoClase.size)
    println("Agrega a Blanca.")
    conjuntoClase.add("blanca")
    println(println("Agrega a Adrian otra vez"))
    conjuntoClase.add("Adrian")
    println("Mostrar tamano del conjunto")
    println(conjuntoClase.size)
    println("eliminar a Zoe")
    conjuntoClase.remove("Zoe")
    println("Comprueba si “Esmeralda” está en el conjunto.")
    println("Esmeralda" in conjuntoClase)
    println("Imprime el conjunto y los resultados de tamaño y existencia.")
    println(conjuntoClase)
    println(conjuntoClase.size)
}