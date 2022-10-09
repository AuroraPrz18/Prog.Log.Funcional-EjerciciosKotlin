package U2.Tarea2

/*
Escribir una función reciba un diccionario con las asignaturas y las notas de un alumno y devuelva otro
diccionario con las asignaturas en mayúsculas y las calificaciones correspondientes a las notas aprobadas.
95-100(excelente), 85-94(Notable), 75-84(Bueno), 70-74(Suficiente)  <70(Desempeño insuficiente).
 */


fun main(args: Array<String>) {
    val coursesToScore = mutableMapOf("Etica" to 100.0, "Matematicas" to 76.5,
        "Ingles" to 94.0, "Programacion" to 70.0, "Tutoria" to 67.0)
    println("De las notas: $coursesToScore")
    println("Se obtuvo calificaciones aprobatorias: "+ getFeedback(coursesToScore))

}

fun getFeedback(courses: Map<String, Double>): Map<String, String>{
    val findFeedback = { score: Double ->
        if(score<70){
            "Desempeño insuficiente"
        }else if(score<=74){
            "Suficiente"
        }else if(score<=84){
            "Bueno"
        }else if(score<=94){
            "Notable"
        }else{
            "Excelente"
        }
    }
    return courses.filter { it.value >= 70 }.map { it.key.uppercase() to findFeedback(it.value)}.toMap()
}


