val calcularGorjeta: (Double?) -> Double = { valorDaGorjeta ->
    if (valorDaGorjeta == null || valorDaGorjeta < 0.0) {
        0.0
    } else {
        valorDaGorjeta
    }
}


fun main() {

    val gorjeta1 = calcularGorjeta(15.5)
    println("Gorjeta 1: R$ $gorjeta1")

    val gorjeta2 = calcularGorjeta(null)
    println("Gorjeta 2 (nula): R$ $gorjeta2")

    val gorjeta3 = calcularGorjeta(-5.0)
    println("Gorjeta 3 (negativa): R$ $gorjeta3")

    val gorjeta4 = calcularGorjeta(0.0)
    println("Gorjeta 4 (zero): R$ $gorjeta4")
}