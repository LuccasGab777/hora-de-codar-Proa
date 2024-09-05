fun main ()
{
    /*
    Crie uma array de planetas que inclua "Terra", "Marte", "Plutão", "Vênus", "Júpiter", "Saturno"  e,
    em seguida, peça ao usuário para digitar o nome de um planeta.
    Verifique se o planeta que o usuário informou está na array e informe ao usuário.
     */

    val  planeta= mutableListOf<String>("venus", "terra","mercurio","marte","Jupter","urano","netuno" )

        println("Informe o nome de um planeta")
        val maiuscolo = readln().lowercase()
       if (planeta.contains(maiuscolo)){
           println("Esse planeta existe!")
       }else{
           println("Esse planeta não existe!")
       }


}




