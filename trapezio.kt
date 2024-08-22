fun main () {
    // trapezio area=[(base maior+base menor).h]/2

    println("Informe o valor base menor: \n")
    val basemenor=readln().toDouble()

    println("Informe o valor da base maior: \n")
    val basemaior=readln().toDouble()

    println("Informe o valor da altura? \n")
    val altura=readln().toDouble()

    val area=((basemaior+basemenor)*altura)/2

    println("O valor da area é: $area")


}