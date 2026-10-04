fun limparBancoDeDados(emails: List<String?>) {

    var contasInvalidas = 0

    for (email in emails) {

        if (email == null || (email?.length ?: 0) == 0) {
            contasInvalidas++
            println("Aviso de deleção: Conta sem e-mail ou com e-mail em branco.")
        } else {
            println("Conta válida: $email")
        }
    }

    println("\n--- Resumo da Limpeza ---")
    println("Contas que precisam ser apagadas: $contasInvalidas")
}

fun main() {
    val listaDeEmails: List<String?> = listOf(
        "maria@email.com",
        null,
        "",
        "joao@email.com",
        null,
        "ana@email.com"
    )

    limparBancoDeDados(listaDeEmails)
}