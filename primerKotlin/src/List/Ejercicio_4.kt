package List

/*
* Ejercicio 4:
Crea una  Lista Mutable llamada grupo con 3 nombres de tus compañeros
Agrega al final de la lista: Francisco y Blanca


Inserta “Maria Isabel” en la posición 2


Cambia el nombre en el índice 3 por “Felix”.


Quita el nombre “Jorge”.


Comprueba si “Ad” está en la lista (usando el operador in).
 Imprime la lista completa tras cada operación (o al final).
* */
fun main() {
    val lista = mutableListOf<String>("Ana","Carlos","Jorge", "Ad")
    lista.add(2,"Maria Isabel")
    lista[3]="felix"
    lista.remove("Jorge")
    print(lista)
    println()
    val buscar : String = "Ad"
    if (buscar in lista){
        println("esta en la lista")
    } else {
        println("No esta en la lista")
    }
}