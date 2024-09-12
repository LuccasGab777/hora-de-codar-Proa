fun main (){
    /*
    Escreva um algoritmo para imprimir os números de 1 (inclusive) a 10 (inclusive) em ordem decrescente.
    Exemplo: 10, 9, 8, 7, 6, 5, 4, 3, 2, 1
     */
    var tempo=10

    while( tempo>0)
    {
        println("Em $tempo")
        tempo -=1
        Thread.sleep(1000)
    }
}