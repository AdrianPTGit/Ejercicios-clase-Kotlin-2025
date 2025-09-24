//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Hola Mundo")
    val nombre : String = "Maria" //variables Inmutables.
    var apellidos : String? = null /* La interrogacion ? -->puede que la variable puede ser nula */
    val edad : Int = 25
    println(nombre)
    println("nombre: $nombre")//Interpolacion
    println("apellidos: " + apellidos)//concatenación
    println("Edad: ${edad+10}")//expresiones complejas

    //INICIALIZAR VARIABLES SIEMPRE

    val telefono : Int = 0

    //null safety

    var apellidos2 : String? = "Gomez"
    println("Longitud del aplellido: "+apellidos?.length) /* La interrogacion ? --> puede que la variable puede ser nula */
    println("Longitud del aplellido: $apellidos.length")


    var a : Int = 2
    var b : Int = 3
    var resultado : Int = suma(a,  b)

    println(resultado)


    println("El total es: ${suma(a, b)}")

}
//crear función
fun suma(a : Int, b : Int): Int {
    return a+b
}