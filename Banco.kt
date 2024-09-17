fun main() {

    // Ao acessar o sistema, pergunte o nome do usuário e diga "Olá {Nome} é um prazer ter você por aqui!"

    println("Olá, como você se chama ?")
    val nome = readln()

    println("É um prazer te-lô por aqui $nome")

    //Na função "inicio", utilize escolha/caso (switch/case) para validar a opção escolhida pelo usuário.
    inicio()
}

fun inicio() {
    //Saldo, Extrato, Saque, Depósito, Transferência e Sair.
    println("Escolha um número de 1 a 6 para ir na aba que deseja")
    println("1 - Ver Saldo")
    println("2 - ver Extrato")
    println("3 - Sacar")
    println("4 - Depositar")
    println("5 - Transferir")
    println("6 - Sair")


    val escolha = readln().toIntOrNull()

    when (escolha) {
        1 -> saldo()
        2 -> extrato()
        3 -> sacar()
        4 -> depositar()
        5 -> transferir()
        6 -> sair()
        else -> erro()

    }

}

var saldo = 0.0
fun saldo() {

    println(saldo)
}

    fun extrato() {
        //Adicionar a opção para ver o extrato (Coloque algumas compras ou depósitos fictícios).
        println(" Deposito:R$1000 \n Deposito:R$2000 \n Compra:R$100 \n Tranferencia:R$900 \n Compra:1500 \n Compra:50 \n Compra:R$450")


    }
var sacar=0.0
    fun sacar() {
        /*Sempre que o usuário for sacar dinheiro, o valor restante não pode ser negativo, ou seja, caso o usuário tente sacar mais
        do que tem em saldo, a ação não deve ocorrer. Exiba uma mensagem de "Operação não autorizada".
        */
println("Quantos você deseja sacar do saldo $saldo ?")

        sacar=saldo-sacar
    }

var depositar:Double = 0.0
fun depositar() {

        println("Quantos você deseja depositar")
        depositar= readln().toDouble()
        println("O valor atual é $depositar")
        depositar=depositar+saldo
    }

    fun transferir() {

    }

    fun sair() {

        println("Foi um prazer te-lô por aqui, volte sempre!")
    }

    fun erro() {
        inicio()
    }