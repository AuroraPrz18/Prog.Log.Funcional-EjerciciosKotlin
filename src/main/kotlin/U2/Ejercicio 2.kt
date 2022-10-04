/*
 Desarrollar una función que reciba otra función y una lista, y devuelva otra lista con el resultado de aplicar la función
 dada a cada uno de los elementos de la lista.
 */

fun main(args: Array<String>) {
    val words = listOf("Aurora", "PeReZ", "calderon")
    print(uppercaseAll(words, ::stringToUppercase))

}

/*
Uppercase all the letters in the string
 */
fun stringToUppercase(word: String): String{
    return word.uppercase()
}

/*
Uppercase all the words in a list
 */
fun uppercaseAll(words: List<String>, action: (String)-> String): List<String>{
    return words.map{
        action(it)
    }
}
