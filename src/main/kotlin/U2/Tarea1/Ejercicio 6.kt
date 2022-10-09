import kotlin.math.sqrt

/*
Desarrollar una función que reciba una muestra de números y devuelva los valores atípicos, es decir, los valores cuya
puntuación típica sea mayor que 3 o menor que -3. Nota: La puntuación típica de un valor se obtiene restando la media y
dividiendo por la desviación típica de la muestra.
*/

fun main(args: Array<String>){
    val sample = listOf(20000.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 8.0, 9.0, 8.0, 8.0, 1.0, 2.0, 3.0, 4.0,
        1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 8.0, 9.0, 8.0, 8.0, 1.0, 2.0, 3.0, 4.0, 1.0, 2.0, 3.0, 4.0, 5.0,
        6.0, 8.0, 9.0, 8.0, 8.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 8.0, 9.0, 8.0, 8.0, -10000.0)
    println("Valores atipicos: "+getAtipicos(sample))
}

fun getAtipicos(sample: List<Double>):List<Double>{
    val average = sample.fold(0.0){sum, value -> sum + value}.toDouble()/sample.size.toDouble()
    println("Media = "+average)
    val o = sqrt(sample.fold(0.0){sum, value -> sum + ((value - average)*(value - average))/sample.size.toDouble()})
    println("Desviacion = "+o)
    val getPuntTipica = {x:Double -> (x-average)/o}
    return sample.filter {
        println("Puntuacion tipica de {$it} es "+getPuntTipica(it))
        getPuntTipica(it) > 3 ||  getPuntTipica(it) < -3
    }
}