package List

fun main() {
    /*TEORIA LISTAS
    * List o lista --> colección redimensionable y ORDENADA, se implementa
    * como un array que PUEDE cambiar de tamaño. Cuando alcanza su capazidad
    * máxima el array se copia en uno nuevo más grande.
    *
    * También puedes insertar elementos nuevos entre otros elementos
    * de un índice específico.
    *
    * Los tipos de colección que encontrarás en Kotlin implementan
    * una o más interfaces.
    *
    * ¿Qué hacen List y MutableList?
    *       - List --> es una interfaz que define las propiedades y los
    *         métodos relacionados con una colección ordenada de SOLO
    *         LECTURA de los elementos.
    *       - MutableList --> extiende la interfaz List con la definición de
    *         métodos para modificar una lista, como agregar o quitar elementos.
    *
    * ***************SINTAXYS PARA DECLARAR UNA lIST*****************
    *       val = [nombre_variable] = listOf<[tipo_Dato]>(elemento1, elemento2 elemento3.....)
    *
    *
    *
    * Se puede obtener numero de elemntos que forman la lista con propiedad size
    *
    * */

    // Crear lista
    val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    // Obtener numero de la lista con propiedad size
    println(solarSystem.size)
    // Obtener un elemento de la lista con el método get()
    println(solarSystem.get(2))
    // Tambien con
    println(solarSystem[5])
    // El metodo indexOf() busca un elemento especifico dentro de la lista
    // devuelve -1 si se encuentra
    println(solarSystem.indexOf("Earth"))

    //Cómo iterar en elementos de lista con un bucle for
    /*for(i : nombre_lista){
            ....
    }
    * */
    for (i in solarSystem){
        println(i)
    }
    // Agregar elementos a una lista con método add() añade el elemento al final de la lista
    // Con un segundo parametro se puede con un Int indicar el lugar en donde se añade el elemento.

    //agregar elemento.


    // 1.Cambia la inicialización de solarSystem para llamar a mutableListOf()
    val solarSystem2 = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystem)
    //2.añadir elemento.
    solarSystem2.add("pluto")
    print("El elemento se agrega al final ${solarSystem2}\n")
    //3.añadir elemento con posicion
    solarSystem2.add(3,"Theia")
    print("El elemento se agrega en la posicion 3 del indice de la lista ${solarSystem2}")

    //Cómo quitar elementos de una lista
/* Los elementos se quitan con el método remove() o removeAt(). Para quitar un elemento, puedes
pasarlo al método remove() o utilizar su índice mediante removeAt().*/

    solarSystem2.removeAt(7)
    solarSystem2.remove("Earth")

    /*
    * List proporciona el método contains() que devuelve un Boolean si existe un elemento
    *en una lista Imprime el resultado de la llamada a contains() para "Pluto".*/

    println(solarSystem.contains("Pluto"))

    /*
    * Una sintaxis aún más concisa consiste en usar el operador in.
    * Puedes verificar si un elemento está en una lista utilizando el elemento,
    *  el operador in y la colección. Usa el operador in para verificar
    * si solarSystem contiene "Future Moon".*/


    println("Future Moon" in solarSystem)



}