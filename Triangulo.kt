fun main()
{
    //Triângulo area=(base.altura)2

    println("Informe o valor da base do Triangolo: \n")
    val base=readln().toDouble()

    println("Informe o valor da altura do Triangolo: \n")
    val altura=readln().toDouble()

    val area = (base*altura)/2
    println("O valor da aréa do triangulo é: $area \n")
}
