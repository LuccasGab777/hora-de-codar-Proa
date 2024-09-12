fun main (){

    // Escreva um programa para imprimir todas as tabuadas de 1 a N. N será informado pelo usuário.
    var n1=1
    var n2:Int
    val n:Int

    println("Até qual tabuada vôce deseja ver ? ")
    n=readln().toInt()

    while (n1<=n) {
        println("Tabuada do $n1:")
        n2=1

        while (n2<=10){
            println("$n1  x  $n2  = ${n1*n2} \n")
            n2 +=1
        }
        println("\n")
        n1 +=1
    }





}