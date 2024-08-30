fun main(){
    /*
    Faça um programa que leia 6 valores informados pelo usuário, calcule,
    exiba os números informados e escreva a média aritmética desses valores lidos.
     */
    println("Informe o número 1 "); val numb1=readln().toInt()
    println("Informe o número 2 "); val numb2=readln().toInt()
    println("Informe o número 3 "); val numb3=readln().toInt()
    println("Informe o número 4 "); val numb4=readln().toInt()
    println("Informe o número 5 "); val numb5=readln().toInt()
    println("Informe o número 6 "); val numb6=readln().toInt()

    val soma=(numb1+numb2+numb3+numb4+numb5+numb6)/6
    println("A média aritmética desses valores é:$soma")
}