fun avaliarMotorista(nota: Int?) {

    val notaTratada = nota ?: 0

    when (notaTratada) {
        5 -> println("Excelente corrida!")
        4 -> println("Boa corrida.")
        1, 2, 3 -> println("Precisamos melhorar.")
        0 -> println("Nenhuma avaliação fornecida.")
        else -> println("Nota inválida.")
    }
}

fun main() {
    println("Teste nota 5:")
    avaliarMotorista(5)

    println("\nTeste nota 4:")
    avaliarMotorista(4)

    println("\nTeste nota 2:")
    avaliarMotorista(2)

    println("\nTeste nota nula:")
    avaliarMotorista(null)
}