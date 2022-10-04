/*
Desarrollar una función que reciba una frase y devuelva un diccionario con las palabras que contiene y su longitud.
 */

fun main(args: Array<String>) {
    val phrase = "Kotlin es un lenguaje de programacion muy curioso"
    print(phraseToMap(phrase))

}

fun phraseToMap(phrase: String): Map<String, Int>{
    val strings = phrase.split(" ").map { it.trim() }
    return strings.map{it to it.length}.toMap()
}