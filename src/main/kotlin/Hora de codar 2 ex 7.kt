fun main(){
    /*
    Faça um programa que leia 6 números que o usuário vai informar.
    Todos os números lidos com valor inferior a 72 devem ser somados.
    Escreva o valor final da soma efetuada e também todos valores que o usuário informou.
     */
    var soma=0
    println("Informe o primeiro valor"); val n1=readln().toInt()
    println("Informe o segundo valor");  val n2=readln().toInt()
    println("Informe o terceiro valor"); val n3=readln().toInt()
    println("Informe o quarto valor");   val n4=readln().toInt()
    println("Informe o quinto valor");   val n5=readln().toInt()
    println("Informe o sexto valor");    val n6=readln().toInt()

    if(n1<72)
    {
         soma +=n1
    }
    if(n2<72)
    {
         soma +=n2
    }
    if(n3<72)
    {
         soma +=n3
    }
    if(n4<72)
    {
         soma +=n4
    }
    if(n5<72)
    {
         soma +=n5
    }
    if(n6<72)
    {
         soma +=n6
    }
    println("OS números informados são \nprimeiro:$n1\nsegundo:$n2\nterceiro:$n3\nquarto$n4\nquinto$n5\nsexto$n6\n")
    println("A soma dos números menores que 72 é $soma")

}