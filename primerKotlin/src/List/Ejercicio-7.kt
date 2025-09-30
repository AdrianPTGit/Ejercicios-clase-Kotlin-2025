package List
/*
* Ejercicio 7:
 Usando la List de  8 compañeros , recórrela con un bucle for y imprime para cada alumno una frase como:
 “El/La alumno/a X está presente.”
 Luego, usando el mismo for, imprime los nombres que tienen longitud mayor que 5 caracteres.*/
fun main() {
    val clase = listOf<String>("Zoe","Adrian","Patricia","Tomas","Carlos","Ana","Antonio","Luis")

    for (alumnos in clase){
        println("El/La alumno/a ${alumnos}  esta presente.")
        if(alumnos.length > 5)
            println("Alumnos con nombre mayor de 5 latras: $alumnos")
    }
}