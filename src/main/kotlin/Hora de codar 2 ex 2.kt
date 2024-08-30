fun main (){
  /*Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo,
   negativo ou zero.
  */

    println  ("Informe um número: ")
    val n1=readln().toInt()

    if(n1 < 0)
    {
        println("O valor:$n1 é negativo!")
    }
    else if(n1 > 0 )
    {
       println("O valor:$n1 é positivo!")
    }else{
        println("O valor é nulo")
    }
}