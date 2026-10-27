

fun main() {

    println("Bem-vindo ao Simulador de Animal de Estimação Virtual!")
    println("Digite o nome do seu animal de estimação:")
    val nomePet = readln() ?: "Baltazar Guilherme Tenório"
    val pet = BichinhoVirtual(nomePet)

    while (true) {
        println("\nEscolha uma ação:")
        println("1. Alimentar $nomePet")
        println("2. Brincar com $nomePet")
        println("3. Verificar o status de $nomePet")
        println("4. Colocar $nomePet para dormir")
        println("5. Sair")

        val escolha = readln().toIntOrNull()

        when (escolha) {
            1 -> pet.alimentar()
            2 -> pet.brincar()
            3 -> pet.verificarStatus()
            4 -> pet.descansar()
            5 -> {
                println("Saindo do Simulador de Animal de Estimação Virtual. Adeus!")
                return
            }

            else -> println("Escolha inválida. Tente novamente.")
        }

        pet.passarTempo() // Simula o tempo que passa após cada ação
        if (pet.idade == 50) {
            println("\n🎉 VITÓRIA! $nomePet chegou à idade 50 com sucesso!")
            return
        }
        if ( pet.nivelDeFome == 100 ){
            println("Seu $nomePet morreu de fome, você perdeu...")
        }
        if ( pet.nivelcansaco == 100 ){
            println("Seu $nomePet morreu de cansaço, você perdeu...")
        }
        if ( pet.nivelFelicidade <= 0 ){
            println("Seu $nomePet está muito triste, você perdeu...")
        }


    }

}