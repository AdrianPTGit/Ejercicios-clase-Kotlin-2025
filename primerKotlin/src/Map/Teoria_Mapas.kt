package Map

fun main() {
    /*Un Map es una colección que consta de claves y valores. Se llama un mapa porque las claves únicas se asignan a
     otros valores. Una clave y su valor complementario suelen llamarse key-value pair.

                Keys (planets)          Values(moons)
                Jupiter         -->     78
                Earth           -->     1
                Neptune         -->     14

     Las claves de un mapa son únicas. Sin embargo, los valores de un mapa no lo son. Dos claves diferentes
     podrían mapear al mismo valor. Por ejemplo, "Mercury" tiene 0 lunas, y "Venus" tiene 0 lunas.

     Acceder a un valor desde un mapa por su clave suele ser más rápido que realizar una búsqueda en una lista grande,
     como con indexOf().

     Los mapas se pueden declarar con las funciones mapOf() o mutableMapOf(). Los mapas requieren dos tipos genéricos
     separados por comas: uno para las claves y otro para los valores.

     **********************SINTAXIS DE UN MAP

            mutableMapOf<key_type, value_type>()

     Un mapa también puede usar la inferencia de tipo si tiene valores iniciales. Para propagar un mapa con valores
     iniciales, cada par clave-valor consta de la clave, seguida del operador to y del valor. Cada par está separado por
     una coma.

     val [map_name] = mapOf(
            key to  value,
            key to  value,
            key to  value
            )
     */


    //1. Quita el código existente de main().
    //2. Crea un mapa llamado solarSystem con mutableMapOf() con valores iniciales, como se muestra.
    val solarSystem = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14

    )
    //3. Al igual que las listas y los conjuntos, Map brinda una propiedad size, que contiene la cantidad
    // de pares clave-valor. Imprime el tamaño del mapa de solarSystem.
    println(solarSystem.size)

    //4.Puedes usar la sintaxis de subíndice para configurar pares clave-valor adicionales. Establece la clave "Pluto" en un valor de 5.
    solarSystem["pluto"] = 5
    //5. Después de insertar el elemento, vuelve a imprimir el tamaño.
    println(solarSystem.size)
    //6. Puedes usar la sintaxis de subíndice para obtener un valor. Imprime el número de lunas de la clave "Pluto".
    println(solarSystem["Pluto"])
    /*
    *
    *6.  También puedes acceder a valores con el método get(). Ya sea que uses sintaxis de subíndice o llames a get(),
    * es posible que la clave que pases no esté en el mapa. Si no hay un par clave-valor, se devolverá un valor nulo.
    * Imprime la cantidad de lunas de "Theia".
    * */

    println(solarSystem["Theia"])

    //8. Ejecuta tu código. Debería imprimirse la cantidad de lunas de Plutón. Sin embargo, dado que Tea no está en
    // el mapa, la llamada a get() tiene un valor nulo.

    /*
    * El método remove() quita el par clave-valor con la clave especificada. También devuelve el valor que se quitó,
    * o null, si la clave especificada no está en el mapa.

    1. Imprime el resultado de la llamada a remove() y de pasar "Pluto".
*/
    solarSystem.remove("Pluto")
    // 2. Para verificar que el elemento se haya quitado, vuelve a mostrar el tamaño.
    println(solarSystem.size)
    //3. Ejecuta tu código. El tamaño del mapa es 8 después de quitar la entrada.
    //4. La sintaxis de subíndice, o el método put(), también puede modificar el valor de una clave que ya existe. Usa la
    // sintaxis de subíndice para actualizar las lunas de Júpiter a 78 e imprime el nuevo valor.
    solarSystem["Jupiter"] = 78
    println(solarSystem["Jupiter"])

}