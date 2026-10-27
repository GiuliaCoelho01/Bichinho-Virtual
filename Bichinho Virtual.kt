

class BichinhoVirtual(val nome: String) {

    var nivelDeFome = 50
    var nivelFelicidade = 50
    var nivelcansaco = 0
    var idade = 0

    fun alimentar() {
        nivelDeFome -= 10
        println("$nome foi alimentado. O nível de fome diminuiu.")
    }

    fun brincar() {
        nivelFelicidade += 10
        println("$nome está brincando e se sentindo mais feliz.")
        nivelcansaco += 15
        println("$nome, agora esta mais cansado")
    }

    fun verificarStatus() {
        println("Status atual de $nome:")
        println("Idade: $idade")
        println("Nível de fome: $nivelDeFome")
        println("Nível de felicidade: $nivelFelicidade")
        println("Nível de cansaço: $nivelcansaco")
    }

    fun passarTempo() {
        nivelDeFome += 3
        println("$nome está ficando mais faminto com o passar do tempo.")
        idade += 1
        println("$nome está envelhecendo")
        nivelFelicidade -=3
        println("$nome está ficando mais triste com o passar do tempo.")
        nivelcansaco += 10
        println("$nome está ficando mais cansado com o passar do tempo.")

    }

    fun descansar(){
        nivelcansaco -=20
        if (nivelcansaco < 0) nivelcansaco = 0
        println("$nome foi descansar e recuperou as energias.")
    }
}

