//Variaveis globais

var nome: String =""
//Essa variavél global chama o nome do úsuario

val listaHospedes: MutableList<String> = mutableListOf()
/* Eu coloquei a variavél ListaHospedes aqui, pois ela tem que ser global
 para armazenar os valores da lista corretamente */

val listaQuartos: MutableMap<Int, MutableList<String>> = mutableMapOf()
//Essa variavél é um mapa que relaciona o número do quarto com a lista dos hospede


var novoHospede:String = ""


fun main() {
//Tela de cadastro

    print("Bem vindo ao Hotel Terabithia!\n")

    println("Informe o seu nome ?")
   nome = readln()
    println("Olá $nome,tudo bem com você?")

do{
    println("$nome, Informe a sua senha (1234) para entrar na sua conta!")
    val senha = readlnOrNull()?.toInt()

}while(senha != 1234)
/*esse código esta pedindo uma senha, e enquanto ela for diferente de 1234,
 ele irá perguntar a senha até ser a senha correta
 */

inicio() //está chamando a função inicio

}

fun inicio (){

    println("$nome, Escolha uma opção:")

    println("1 -> Cadastrar Quartos \n"+
            "2 -> Pesquisar Hospedes \n"+
            "3 -> Abastecimento De Automoveis \n" +
            "4 -> Sair do Hotel\n")

    val escolha = readln().toIntOrNull()
    // A varival escolha armazena a opção escolhida pelo usuário.

    when (escolha) {
        /*Esse código entra na função selecionada pelo usúario,
         quando ele digita o número que chama a função */
        1 -> cadastrarQuartos()
        2 -> pesquisarHospede (listaHospedes)
        3 -> AbastecimentoDeAutomoveis()
        4 -> sairDoHotel()
        else -> erro()
    }


}


fun cadastrarQuartos() {
    /*

     */

    var diaria:Int
    do
    {
        println("$nome, o custo da diaria é R$350, informe a quantidade de dias que você deseja permancer entre 1 a 30")
        diaria = readln().toIntOrNull()?: -1

        if(diaria <= 0 || diaria > 30){
        println("Quantidade de dias invalido, por gentileza $nome, informe um número entre (1 a 30)")
        diaria = readln().toInt()
        }

    } while  (diaria <= 0 || diaria > 30)

    val total=diaria*350
    println("Obrigado $nome pela confiança \nA sua diaria é R$$total ")

    escolherQuarto()
}


fun escolherQuarto()
{
    var escolhaQuartos:Int
    do {
        println(" $nome Escolha um quarto de 1 a 20")
        escolhaQuartos = readln().toIntOrNull()?:-1

        if(escolhaQuartos in 1..20) {
            val hospedesNoquarto = listaQuartos[escolhaQuartos]?.size ?: 0
            if (hospedesNoquarto >= 10) {
                println(
                    " $nome, o quarto $escolhaQuartos já está oucupado por ${listaQuartos[escolhaQuartos]}" +
                            "\nPor favor, escolha outro!"
                )
            } else {
                println("$nome, Informe o nome do Hóspede para o quarto $escolhaQuartos:")
                novoHospede = readln()

                if (listaHospedes.contains(novoHospede)) {
                    listaQuartos.getOrPut(escolhaQuartos)
                    { mutableListOf() }.add(novoHospede)
                    println("$novoHospede cadastrado com sucesso no quarto $escolhaQuartos!")

                } else {
                    listaHospedes.add(novoHospede)
                    listaQuartos.getOrPut(escolhaQuartos)
                    { mutableListOf() }.add(novoHospede)
                    println("$novoHospede cadastrado com sucesso no quarto $escolhaQuartos: ${listaQuartos[escolhaQuartos]}")
                    println("Lista de Hóspedes atuais no quarto $escolhaQuartos:" + listaHospedes)
                    break
                }

                listaQuartos.getOrPut(escolhaQuartos) {mutableListOf()}.add(novoHospede)
                println("O quarto $escolhaQuartos foi reservado para $novoHospede.")
                break
            }
        }else{"Número do quarto invalido!\nEscolha um número entre 1 a 20"}
    }
    while(listaQuartos.containsKey(escolhaQuartos))
    inicio()
}


fun pesquisarHospede(listaHospedes: MutableList<String>) {
    println("Pesquisa de Hóspedes.\nPor favor $nome, informe o nome do Hóspede:")
    val nomeHospede = readln()

    if (listaHospedes.any { it.contains(nomeHospede, ignoreCase = true) }) {
        println("\nEncontramos a(s) hóspede(s): ")

        listaHospedes.filter { it.contains(nomeHospede, ignoreCase = true) }
            .forEach { println(it) }
    } else println("Não encontramos nenhuma hóspede com esse nome ($nomeHospede). ")

    println(" voltar para o menu ->(1)\n " +
            "Pesquisar outro Hospede ->(2)\n"+
            "Cadastrar  Hospede ->(3)\n")
    val escolha = readln()

    when (escolha) {

        "1" -> {
            inicio()
        }
        "2" -> {
            pesquisarHospede(listaHospedes)
        }
        "3" -> {
            cadastrarQuartos()
        }
    }
}



fun AbastecimentoDeAutomoveis() {

}

fun erro(){
    println("Por favor, informe um número entre 1 e 4.")
    inicio()
}

fun sairDoHotel() {
    println("Você deseja sair? (S/N)")
    val confirma = readln()
    if (confirma == "sim" || confirma == "Sim" || confirma == "s" || confirma == "S") {
        println("Até logo!")
    } else {
        inicio()
    }

}