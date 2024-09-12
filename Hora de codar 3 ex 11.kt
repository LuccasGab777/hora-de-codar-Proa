fun main (){
    /*
    Escreva um programa em que o usuário informe 10 valores e escreva quantos desses valores
    lidos estão entre os números 24 e 42 (incluindo os valores 24 e 42)
    e quantos deles estão fora deste intervalo.
     */

    var dentro = 0
    var fora = 0

    for (i in 1..10) {
        println("Informe o valor $i º :")
        val valor = readln().toInt()

        if (valor in 24..42) {
            dentro++
        } else {
            fora++
        }
    }
    println("A quantidade de números que estão dentro do 24 e 42 é: $dentro ")
    println("A quantidade de números que estão fora do 24 e 42 é: $fora ")
}