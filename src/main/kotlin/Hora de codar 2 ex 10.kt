fun main() {
    comeco()
}
    /*
        Tendo como entrada a altura e o gênero designado ao nascer
        (codificado da seguinte forma: 1: feminino - 2: masculino
        de uma pessoa, construa um programa que calcule e imprima seu
        peso ideal, utilizando as seguintes fórmulas.
         */
fun comeco() {
        println("Informe a sua altura em metros:")
        val alto = readln().toDouble()

        println("Informe o seu genêro masculino/feminino:")
        val gen = readln()


        val peso: Double
        if (gen == "feminino" || gen == "mulher" || gen == "Femea" || gen == "Mulher" || gen == "menina" || gen == "Menina"||gen=="femea" || gen=="Femenino") {
            peso = (62.1 * alto) - 44.7
            println("O seu peso ideal é $peso")



        } else if (gen == "macho" || gen == "masculino" || gen == "Masculino" || gen == "Macho" || gen == "Menino" || gen == "menino") {
            peso = (72.7 * alto) - 58
            println("O seu peso ideal é $peso")

        } else {
            println("genero não informado ou digitado de forma errada")
        }

    println ("Voce deseja continuar ?");val resposta=readln()
    if(resposta=="sim"||resposta=="Sim"||resposta=="s"||resposta=="S") {
        comeco()
    }else {
        println("Até mais!")
    }
    }
