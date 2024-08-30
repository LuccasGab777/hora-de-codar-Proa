fun main() {
//Escreva um programa em que o usuário informe dois números. Então escreva em tela o maior deles.

println("Informe o primeiro valor ")
val p1= readln().toInt()

println("Informe o segundo valor ")
val p2=readln().toInt()

    if(p1>p2)
    {
        println("O primeiro valor é o maior: $p1 ")
    }
    else if (p2 > p1)
    {
        println("O segundo valor é o maior: $p2")
    }else { println("Os dois valores são iguais! ")

    }
}