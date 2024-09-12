    fun main ()
    {
        /*
        Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive).
        Considere que o N será sempre maior que ZERO.
        N  é um valor informado pelo usuário
        */

        val n1:Int
        println("Informe um valor maior que zero ")
        n1= readln().toInt()

        for (i in 1..n1)
        {
            println(i)
        }

    }