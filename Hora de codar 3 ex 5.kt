/*
 Faça um algorismo que calcule e escreva a média aritimetica dos dois números inteiros
 informados pelo usuario e todos os numeros inteiros entre eles.
 Considerando que o primeiro sempre é menor que o segundo
 */
fun main(){

var n1:Int
var n2:Int
var resultado:Int

    println("Informe o primeiro valor")
    n1=readln().toInt()

    do{
        println("Informe o segundo valor tem que ser maior que o primeiro")
        n2=readln().toInt()
    }while(n2<=n1)
 var soma=0
 var contador=0
    for(i in n1..n2) {
        soma += 1
        contador += 1
    }
        println("a soma dos valores é $soma")
        println(", a soma dos número sera divididos por  $contador")

        val media= soma.toDouble()/contador

    println("O resultado da média aritimética é: $media")




}