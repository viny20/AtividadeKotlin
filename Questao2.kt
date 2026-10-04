fun auditarEntregas(enderecos: List<String?>) {
    for (endereco in enderecos) {

        val enderecoValido = endereco ?: "Endereço Desconhecido"

        if (enderecoValido == "Endereço Desconhecido") {
            println("Entrega Pendente: Falta de dados")
        } else {
            println("Rota traçada para: $enderecoValido")
        }
    }
}

fun main() {
    val listaDeEnderecos: List<String?> = listOf(
        "Rua das Flores, 123",
        null,
        "Avenida Paulista, 1500",
        null,
        "Rua XV de Novembro, 88"
    )

    auditarEntregas(listaDeEnderecos)
}