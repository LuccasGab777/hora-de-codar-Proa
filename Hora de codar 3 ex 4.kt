fun main() {
    /*
     Faça um algoritmo que calcule e escreva a média aritmética dos números inteiros entre 15 (inclusive)
     e 100 (inclusive).
     */
    var n1:Int
    var n2:Int

    do {
    println("Informe o primeiro valor (entre 15 a 100)")
     n1 = readln().toInt()
    } while (n1 < 14 || n1 > 100)




    do {
        println("Informe o segundo valor (entre 15 a 100)")
         n2 = readln().toInt()

    } while (n2 < 14 || n2 > 100)

    val resultado=(n1 + n2)/2
    println("O resultado da média aritimetica dos valores é: $resultado")


}