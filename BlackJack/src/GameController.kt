class GameController(name:String) {

    var computer = Player("Računalo")
    var player = Player(name)
    var margin21 : String = "under"
    var resultChecker = ResultChecker(player,computer)

    fun computerPlay()  {
        if(computer.result < 17){
            do{
                computer.giveMeCard()

            }while(computer.result < 17)
        }
        if(computer.result > 21 ) {
            margin21="over"
        }
    }
    fun printComputerCards(){
        for(card in computer.cards){
            println(card)
        }
    }
    fun youPlay()  {
        println("Korisnik ${player.name} je započeo igru. Skor je ${player.result}.")

        do {
            for(card in player.cards){
                println(card)
            }
            if(player.result >21) break

            println("Zelite li povuci kartu: (y/n)")
            val response = readLine()
            if(response=="y"){
                player.giveMeCard()
                println("Sada je vaš rezultat ${player.result} " )
            }
            else if(response!="y" && response!="n" ){
                println("Krivi unos")
            }
        }
        while (response !="n" || player.result>21)
    }
}