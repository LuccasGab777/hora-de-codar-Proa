fun main() {
/*
Escreva um algoritmo para ler 2 valores informados pelo usuário e se o segundo
valor informado for igual ou menor que ZERO, deve ser lido um novo valor.
Ou seja, para o segundo valor não pode ser aceito o valor zero, nem um valor negativo.
O seu programa deve imprimir o resultado da divisão do primeiro valor lido pelo segundo
valor e exibir o resultado ao usuário.
 */

   println("Informe o primeiro ")
    val numb1= readln().toDouble()

    var numb2:Double

    do {   println("Informe o valor novamente (não pode ser igual ou menor a zero")
         numb2 = readln().toDouble()
        }
    while( numb2<=0)



    val resu = numb1 / numb2
    println("O resultado da divisão do primeiro valor e o segundo é $resu")

}
