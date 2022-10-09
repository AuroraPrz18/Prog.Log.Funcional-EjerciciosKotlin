package U2.Tarea2

/*
Construir una función que permita hacer búsqueda de inmuebles en función de un presupuesto dado.
La función recibirá como entrada la lista de inmuebles y un precio, y devolverá otra lista con los
inmuebles cuyo precio sea menor o igual que el dado. Los inmuebles de la lista que se devuelva deben
incorporar un nuevo par a cada diccionario con el precio del inmueble, donde el precio de un inmueble
se calcula con las siguiente fórmula en función de la zona:
Zona A: precio = (metros * 1000 + habitaciones * 5000 + garaje * 15000) * (1-antiguedad/100)
Zona B: precio = (metros * 1000 + habitaciones * 5000 + garaje * 15000) * (1-antiguedad/100) * 1.5
 */

fun main(args: Array<String>) {
    val inmuebles: List<MutableMap<String, Any>> = listOf(
        mutableMapOf("anio" to 2000, "metros" to 100, "habitaciones" to 3, "garaje" to true, "zona" to 'A'),
        mutableMapOf("anio" to 2012, "metros" to 60, "habitaciones" to 2, "garaje" to true, "zona" to 'B'),
        mutableMapOf("anio" to 1980, "metros" to 120, "habitaciones" to 4, "garaje" to false, "zona" to 'A'),
        mutableMapOf("anio" to 2005, "metros" to 75, "habitaciones" to 3, "garaje" to true, "zona" to 'B'),
        mutableMapOf("anio" to 2015, "metros" to 90, "habitaciones" to 2, "garaje" to false, "zona" to 'A'))
    println("Inventario:\n $inmuebles")
    println("\nPosibles casas con $10000:\n"+ findInmueble(inmuebles, 10000.0))
    println("\nPosibles casas con $100000:\n"+ findInmueble(inmuebles, 100000.0))
    println("\nPosibles casas con $1000000:\n"+ findInmueble(inmuebles, 1000000.0))
}

fun findInmueble(inmuebles: List<MutableMap<String, Any>>, presupuesto: Double):List<MutableMap<String, Any>> {
    return inmuebles.map {
        // (metros * 1000 + habitaciones * 5000 + garaje * 15000) * (1-antiguedad/100)
        var precio = (it.get("metros")!!.toString().toDouble().times(1000.0) +
                    it.get("habitaciones")!!.toString().toDouble().times(5000.0) +
                    (if(it.get("garaje") == true) 15000 else 0)).times((1 - (2022 - it.get("anio")!!.toString().toDouble()) / 100.0))
        if(it.get("zona") == 'B') {
            precio *= 1.5
        }else if(it.get("zona") != 'A') {
            precio = -1.0
        }
        it.set("precio", precio)
        it
    }.filter {
        it.get("precio")!!.toString().toDouble() <= presupuesto
    }
}


