fun main() {
    var soma = 0.0
    var contador = 0

    println("Informe o primeiro valor (entre 0 e 10):")
    val n1 = readln().toInt()
    if (n1 > 0 && n1 < 10) {
        soma += n1
        contador++
    }

    println("Informe o segundo valor (entre 0 e 10):")
    val n2 = readln().toInt()
    if (n2 > 0 && n2 < 10) {
        soma += n2
        contador++
    }

    println("Informe o terceiro valor (entre 0 e 10):")
    val n3 = readln().toInt()
    if (n3 > 0 && n3 < 10) {
        soma += n3
        contador++
    }

    println("Informe o quarto valor (entre 0 e 10):")
    val n4 = readln().toInt()
    if (n4 > 0 && n4 < 10) {
        soma += n4
        contador++
    }

    val media = if (contador > 0) soma / contador else 0.0

    if (media > 5) {
        println("Você passou no teste. \nNota: $media")
    } else {
        println("Tente novamente. \nNota: $media")
    }
}


