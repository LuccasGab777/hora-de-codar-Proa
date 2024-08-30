
fun main() {
    /*
    Uma micro calculadora. Escreva um programa para ler 2 valores inteiros informados pelo
    usuário e uma das seguintes operações a serem executadas
    (codificada da seguinte forma: 1. Adição, 2. Subtração, 3. Divisão, 4. Multiplicação).
    O programa deve calcular e escrever o resultado dessa operação sobre os dois valores lidos.
    */

    println("Informe o primeiro valor inteiro: ")
    val valor1 = readln().toInt()

    println("Informe o segundo valor inteiro: ")
    val valor2 = readln().toInt()

    println("Escolha a operação (1: Adição, 2: Subtração, 3: Divisão, 4: Multiplicação): ")
    val escolha = readln().toIntOrNull()

    when (escolha) {
        1 -> println("Resultado: ${adicao(valor1, valor2)}")
        2 -> println("Resultado: ${subtracao(valor1, valor2)}")
        3 -> println("Resultado: ${divisao(valor1, valor2)}")
        4 -> println("Resultado: ${multiplicacao(valor1, valor2)}")
        else -> println("Por favor, informe um número entre 1 e 4.")
    }
}

fun adicao(valor1: Int, valor2: Int): Int {
    return valor1 + valor2
}

fun subtracao(valor1: Int, valor2: Int): Int {
    return valor1 - valor2
}

fun divisao(valor1: Int, valor2: Int): Int {
    return valor1 / valor2
}

fun multiplicacao(valor1: Int, valor2: Int): Int {
    return valor1 * valor2
}


