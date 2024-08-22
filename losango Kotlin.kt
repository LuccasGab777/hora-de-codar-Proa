fun main() {
    //Losango Area=(diagonalMaior.Diagonalmenor)/2

    println("Informe o valor de diagonal menor: \n")
    val diagonalmenor=readln().toDouble()

    println("Informe o valor do diagonal maior: \n")
    val diagonalmaior=readln().toDouble()

    val area=(diagonalmaior*diagonalmenor)/2
    println("O valor da area é: $area")
}