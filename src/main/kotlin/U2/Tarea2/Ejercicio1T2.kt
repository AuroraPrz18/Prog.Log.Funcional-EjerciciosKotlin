package U2.Tarea2

import java.nio.DoubleBuffer
import kotlin.math.*

/*
 Desarrollar una función que simule una calculadora científica que permita calcular el seno, coseno, tangente,
 exponencial y logaritmo neperiano. La función preguntará al usuario el valor y la función a aplicar, y mostrará
 por pantalla una tabla con los enteros de 1 al valor introducido y el resultado de aplicar la función a esos enteros.
 */

fun main(args: Array<String>) {
    println("Ingrese la función a realizar: ")
    println("1.- Seno")
    println("2.- Coseno")
    println("3.- Tangente")
    println("4.- Exponencial")
    println("5.- Logaritmo neperiano")
    var ope = readLine()?.toInt() as Int
    println("\nIngrese limite superior: ")
    var num = readLine()?.toInt() as Int

    if(ope == 1) doIt(num, ::sin)
    else if(ope == 2) doIt(num, ::cos)
    else if(ope == 3) doIt(num, ::tan)
    else if(ope == 4) doIt(num, ::exp)
    else if(ope == 5) doIt(num, ::ln)
    else println("No existe esa opcion")
}

fun doIt(n: Int, action: (Double)-> Double){
    for(i in 1..n){
        println("${i} - ${action(i.toDouble())}")
    }
}
