fun main() {
    /*
    Escreva um algoritmo para ler as notas de avaliações de um aluno, calcule
    e imprima a média (simples) desse aluno. Só devem ser aceitos valores válidos
    durante a leitura (0 a 10) para cada nota. São 6 notas ao total.
    Caso o valor informado para qualquer uma das notas esteja fora do limite
    estabelecido, deve ser solicitado um novo valor ao usuário.
     */
    var n1:Double
    var n2:Double
    var n3:Double
    var n4:Double
    var n5:Double
    var n6:Double

    do {
        println("Informe a primeira nota do aluno")
        n1= readln().toDouble()
    }while( n1<0 || n1>10)

    do {
        println("Informe a segunda nota do aluno")
        n2= readln().toDouble()
    }while( n2<0 || n2>10)

    do {
        println("Informe a terceira nota do aluno")
        n3= readln().toDouble()
    }while( n3<0 || n3>10)

    do {
        println("Informe a quarta nota do aluno")
        n4= readln().toDouble()
    }while( n4<0 || n4>10)

    do {
        println("Informe a quinta nota do aluno")
        n5= readln().toDouble()
    }while( n5<0 || n5>10)

    do {
        println("Informe a sexta nota do aluno")
        n6= readln().toDouble()
    }while( n6<0 || n6>10)

    val media=(n1+n2+n3+n4+n5+n6)/6
    println("A média do aluno é: $media")
}