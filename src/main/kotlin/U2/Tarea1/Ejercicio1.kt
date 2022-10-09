/*
 Desarrollar una función que aplique un descuento a un precio y otra que aplique el IVA a un precio.
 Escribir una tercera función que reciba un diccionario con los precios y porcentajes de una cesta de
 la compra, y una de las funciones anteriores, y utilice la función pasada para aplicar los descuentos
 o el IVA a los productos de la cesta y devolver el precio final de la cesta.
 */

fun main(args: Array<String>) {
    // Aplicar descuento a un producto
    println("Carrito aplicando descuento")
    println("Descuento a $1500 del 10% = "+ applyDiscount(1500.0, .10))
    println("Descuento a $100 del 30% = "+ applyDiscount(100.0, .30))
    println("Descuento a $5135 del 9% = "+ applyDiscount(5135.0, .09))
    var cart = mutableMapOf(1500.0 to 0.10, 100.0 to .30, 5135.0 to 0.09)
    println("Total = "+ getTotal(cart, ::applyDiscount))
    println()
    println()
    // Aplicar IVA  a un producto
    println("Carrito aplicando iva")
    println("Aplicar IVA a $1500 = "+ applyIVA(1500.0, 0.16))
    println("Aplicar IVA a $100 = "+ applyIVA(100.0, 0.16))
    println("Aplicar IVA a $5135 = "+ applyIVA(5135.0, 0.16))
    cart = mutableMapOf(1500.0 to 0.16, 100.0 to .16, 5135.0 to 0.16)
    println("Total = "+ getTotal(cart, ::applyIVA))
}
fun Double.roundTo2():Double{
    return String.format("%2f", this).toDouble()
}

fun applyDiscount(price: Double, discount: Double): Double {
    return (price*(1.0-discount)).roundTo2()
}

fun applyIVA(price: Double, iva: Double): Double {
    return (price*(1.0+iva)).roundTo2()
}

fun getTotal(cart: Map<Double, Double>, action: (Double, Double) -> Double): Double {
    var total:Double = 0.0
    for(product in cart){
        total+= action(product.key, product.value)
    }
    return total.roundTo2()
}