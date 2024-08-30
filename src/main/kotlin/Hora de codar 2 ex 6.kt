fun main(){
/*
 Faça um programa que receba quatro valores informados pelo usuário, mas informe somente o primeiro,
 o último e o maior de todos eles (considere que todos os números informados serão diferentes)
 */

    println("Informe o primeiro valor"); val n1=readln().toInt()
    println("Informe o segundo valor"); val n2=readln().toInt()
    println("Informe o terceiro valor"); val n3=readln().toInt()
    println("Informe o quarto valor"); val n4=readln().toInt()

    if (n1>n2 && n1>n3 && n1>n4)
    {
        println("O primeiro número é $n1, o último número é $n4 e o último número é $n1")
    }
    else if (n2>n1 && n2>n3 && n2>n4)
    {
        println("O primeiro número é $n1, o último número é $n4 e o último número é $n2")
    }
    else if (n3>n2 && n3>n1 && n3>n4)
    {
        println("O primeiro número é $n1, o último número é $n4 e o último número é $n3")
    }else{
        println("O primeiro número é $n1, o último número é $n4 e o último número é $n4")
         }
}