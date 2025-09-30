package Ejercicios

fun main() {
    for (i:Int in 1..100){
        val divportres= i % 3 == 0
        val divporcinco = i % 5 == 0
        if (divportres && divporcinco){
            println("Hacker-maater")

        } else if(divportres){
            print("${i} Hacker \n")
        }else if(divporcinco){
            print("${i} maater\n")
        }else{
            println("${i}No es primo")
        }
    }
}