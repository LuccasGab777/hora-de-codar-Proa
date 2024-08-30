fun main(){
    /*Faça um programa para ler 3 valores (considere que não serão informados valores iguais)
    e escrever o maior deles.
     */
    println("Informe o primeiro valor"); val n1=readln().toInt()
    println("Informe o segundo valor");  val n2=readln().toInt()
    println("Informe o terceiro valor"); val n3=readln().toInt()

    if(n1>n2 && n1>n3)
    {
      println("O número $n1 é o maior")
    }
    else if(n2>n1 && n2>n3)
    {
        println("O número $n2 é o maior")
    }
    else if(n3>n1 && n3>n2)
    {
        println("O número $n3 é o maior")
    }else{ println("Os números informados são iguais") }
}