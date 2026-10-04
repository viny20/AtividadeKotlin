fun validarBioInfantil(bio: String?) {

    val tamanho = bio?.length ?: 0

    if (tamanho <= 50) {
        println("Bio aceita")
    } else {
        println("Bio muito longa")
    }
}

fun main() {

    validarBioInfantil("Gosto de desenhos, jogos e aventuras!")

    validarBioInfantil("Exemplo kotlin, somente caso seja aceito, que no caso esperamos que nao seja aceita, até porque esperamos que passe de 50 caracteres")

    validarBioInfantil("12345678901234567890123456789012345678901234567890")

    validarBioInfantil("Esta biografia é extremamente longa e com certeza vai ultrapassar o limite permitido de cinquenta caracteres.")
}