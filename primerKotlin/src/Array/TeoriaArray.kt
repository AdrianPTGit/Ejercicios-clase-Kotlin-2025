package Array

fun main() {
    /*
    * Un array contiene valores (elementos).
    * los elementos se ordenan mediante un indice empezando a contar desde 0.
    * tienen tamaño fijo. Pero modificar los valores de los índices del array.
    *
    ***************SINTAXYS PARA DECLARAR UN ARRAY
    *       val = [nombre_variable] = arrayOf<[tipo_Dato]>(elemento1, elemento2 elemento3.....)
    *
    * si no se indica el tipo de dato el array puede contener elementos de distinto tipo.
    *
    * La función arrayOf() toma los elementos del array como parámetros y devuelve un array del
    * tipo que coincide con los parámetros que se pasaron.
    *
    *   arrayOf() tiene una cantidad variable de parámetros, dependiendo del numero de paramatros el
    *             array sera mas grande o pequeño.
    *             Es posible unir dos arrays con el operador +
    *                   val = array1 + array2
    *
    * Acceso a un elemento del array mediante su indice:
    * arrayNombre[0]
    *
    * También puedes definir el valor de un elemento de array por su índice.
    * arrayNombre[0]="Ana"
    *
    * Recomendable utilizar colecciones como: List, Set y Map
    * */

    //Crear un array.
    val rockPlanets = arrayOf<String>("Mercurio", "Venus", "Tierra", "Marte")

    //Debido a que Kotlin usa la inferencia de tipos, puedes omitir
    // el nombre del tipo cuando llamas a arrayOf().

    val gasPlanets = arrayOf("Jupiter","Saturno","Uranus")

    //Unir dos arrays con operador +

    val solarSystem = rockPlanets + gasPlanets

    // Acceder a un elemento.

    val elemento = gasPlanets[2]
    println("Acceso a un elemento del array: ${elemento}")

    //Definir el valor de un elemento de array por su índice.

    solarSystem[3] = "Little Earth"
    println(gasPlanets[2])

    // Agregar elemento al array

    // solarSystem[8]="Pluton" Lanza una excepcion Index 3 out of bounds for length 3 el tamaño del array es de 7 al
    // añadir un elemento mas no es posible

    // si que podemos crear un nuevo array con el planeta Pluton
    val newSolarSystem = arrayOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto")
    println(newSolarSystem[8])

}