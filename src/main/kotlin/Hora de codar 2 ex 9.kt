fun main() {
           inicio()
           }
     /*
     Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem
     que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que ela nasceu).
     */

      fun inicio() {

          println("Informe o ano que você nasceu ex(1999):")
          val idade = readln().toInt()


    if(idade<2006 && idade>1954)
    {
        println("Você pode votar!")

    }
    else if (idade < 1954)
    {
        println("Você não precisa votar!")

    } else {
        println("Você não pode votar!")
    }

      println("Você quer continuar ? Sim/Não"); val escolha= readln()

        if(escolha=="Não" || escolha=="não" || escolha=="n" || escolha=="N"){

            println("Até mais!")
        }else{
            inicio()
        }

}