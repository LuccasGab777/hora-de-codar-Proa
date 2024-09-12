fun main(){
    /*
    Escreva um programa para ler 2 notas de um aluno, calcular e imprimir a média final.
    Considere que a nota de aprovação é 9,5. Logo após escrever a mensagem "Calcular a
    média de outro aluno Sim/Não?" e solicitar um resposta. Se a resposta for "S", o
    programa deve ser executado novamente, caso contrário deve ser encerrado exibindo
    a quantidade de alunos aprovados.
     */
var n1:Double
var n2:Double
var resposta:String

do{
    println("Informe a primeira nota (a nota tem que menor ou igual a 10 e maior ou igual a 0): ")
     n1= readln().toDouble()
    println(" Informe a segunda nota (a nota tem que menor ou igual a 10 e maior ou igual a 0): ")
     n2= readln().toDouble()


}while(n1 > 10 || n2 > 10 || n1 <0 || n2<0)

val media = n1/n2
println("A média do aluno é: $media")




}