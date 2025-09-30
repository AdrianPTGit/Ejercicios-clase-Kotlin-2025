package Set
/*
* Cómo usar un MutableSet en Kotlin

En el ejemplo, usaremos un elemento MutableSet para demostrar cómo agregar y quitar elementos.

    1. Quita el código existente de main().
    2. Crea un Set de planetas llamado solarSystem con mutableSetOf(). Esto devuelve un MutableSet,
    *cuya implementación predeterminada es LinkedHashSet().
*/
fun main() {

    val solarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    //3.Imprime el tamaño del conjunto con la propiedad size.
    println(solarSystem.size)
    /* 4. Al igual que List, Set tiene un método add(). Agrega "Pluto" al conjunto solarSystem con el método add().
    Solo se necesita un parámetro para el elemento que se agrega. Los elementos de los conjuntos no tienen necesariamente
    un orden, por lo que no hay índice.*/

    solarSystem.add("Pluto")
    println(solarSystem.size)

    /*
    6. La función contains() toma un solo parámetro y comprueba si el elemento especificado está incluido en el conjunto.
    De ser así, el resultado será verdadero. De lo contrario, el resultado es falso. Llama a contains() para comprobar
    si "Pluto" está en solarSystem.
*/
    println(solarSystem.contains("Pluto"))

    /*La función remove() toma un solo parámetro y quita el elemento especificado del conjunto.

    1. Usa la función remove() para quitar "Pluto".
*/
    solarSystem.remove("Pluto")
    //2. Imprime el tamaño de la colección y vuelve a llamar a contains() para comprobar si "Pluto" todavía está en el conjunto.
    println(solarSystem.size)
    println(solarSystem.contains("pluto"))
}