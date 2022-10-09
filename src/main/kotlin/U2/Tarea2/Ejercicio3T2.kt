package U2.Tarea2

/*
 Escribir una función reciba una lista de calificaciones y devuelva la lista de calificaciones
 correspondientes a esas notas.
95-100(excelente), 85-94(Notable), 75-84(Bueno), 70-74(Suficiente)  <70(Desempeño insuficiente).
 */

fun main(args: Array<String>) {
    val scores = listOf(100.0, 76.5, 94.0, 70.0, 67.0)
    println("De las notas: $scores")
    println("Se ovtuvo: "+ getFeedback(scores))
}

fun getFeedback(scores: List<Double>): List<String>{
    return scores.map {
        if(it<70){
            "Desempeño insuficiente"
        }else if(it<=74){
            "Suficiente"
        }else if(it<=84){
            "Bueno"
        }else if(it<=94){
            "Notable"
        }else{
            "Excelente"
        }
    }
}


