fun main() {
    /*
    Crie um programa onde o usuário possa cadastrar estudantes sem limites, e, em seguida, Se o usuário digitar
    "PARE" o programa deve exibir a quantidade de estudantes cadastrados e a lista com cada um deles.
    */
    val estudante = mutableListOf<String>()

    while (true) {
        println("Digite o nome de estudante ou digite 'Pare' para finalizar")

        val maiusculo = readln().lowercase();
        if (maiusculo == "pare") {
            break
        } else {
            estudante.add(maiusculo)
        }
    }
    println("Quantidade de estudantes cadastrado ${estudante.size}")
    println("Lista de estudantes:")
    estudante.forEach() {
        println(it);
    }
}

