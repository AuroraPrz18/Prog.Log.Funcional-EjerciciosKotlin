import kotlin.math.sqrt

/*
Desarrollar   una función que calcule el módulo de un vector.
Nota:  El módulo de un vector es la raíz cuadrada de la coordenada x al cuadrado más la coordenada «y» al cuadrado.
*/

fun main(args: Array<String>){
    println("Siendo x=2.0 y y=10.0: "+getVectorModule(2.0, 10.0))
    println("Siendo x=3.3 y y=67.43: "+getVectorModule(3.3, 67.43))
    println("Siendo x=-7.7 y y=10.0: "+getVectorModule(-7.7, 10.0))
}

fun getVectorModule(x: Double, y: Double):Double{
    return sqrt(x*x+y*y)
}