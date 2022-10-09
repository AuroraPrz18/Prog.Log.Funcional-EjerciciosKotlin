package U2.Tarea2

/*
 Desarrollar una función que reciba otra función booleana y una lista, y devuelva otra lista con los elementos
 de la lista que devuelvan True al aplicarles la función booleana.
 */

fun main(args: Array<String>) {
    var isAnAdult = {edad: Int -> edad >= 18}
    val ages = listOf(12, 18, 23, 42, 11, 21, 10, 7, 34)
    println("De las edades: $ages")
    println("Tenemos adultos: "+whatIsTrue(ages, isAnAdult))
}

fun whatIsTrue(ages: List<Int>, action: (Int) -> Boolean): List<Int> {
    return ages.filter {
        action(it)
    }
}
