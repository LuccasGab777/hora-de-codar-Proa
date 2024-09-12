
fun main()  {
    /*
     Crie uma bomba relógio (usando somente código para deixar claro!)
     cuja contagem regressiva vá de 30 a 0. No final da repetição escreva "EXPLOSÃO".
     */

var tempo=30

while(tempo>0){
    println("Exolosão em  $tempo")

    tempo -= 1
    Thread.sleep(1000)
}
println("Explosão!")
}