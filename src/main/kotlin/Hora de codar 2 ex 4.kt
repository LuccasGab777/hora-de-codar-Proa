fun main(){
    /*
    Faça um programa que leia 3 valores informados pelo usuário
    (considere que não serão informados valores iguais)
    e escrever a soma dos 2 maiores.
    */

    println("Informe o número 1 "); val numb1=readln().toInt()
    println("Informe o número 2 "); val numb2=readln().toInt()
    println("Informe o número 3 "); val numb3=readln().toInt()

    if(numb1>numb3 && numb2>numb3)
    {
        val soma = numb1+numb2
        println("A soma dos maiores números é:$soma")
    }
    else if (numb3>numb1 && numb2>numb1)
    {
        val soma = numb3+numb2
        println("A soma dos maiores números é:$soma")
    } else{
        val soma = numb1+numb3
        println("A soma dos maiores números é:$soma")
    }

}