class GameController(name:String) {


    var computer = Player("Računalo")
    var player = Player(name)
    var secondPlay : String = "under"

    init{


    }
    fun computerPlay()  {
        if(computer.result < 17){
            do{
                if(computer.numberOfCard >5 ){
                    println("Imate maksimalan broj karata")
                    break
                }

                computer.giveMeCard()
            }while(computer.result < 17)
        }
        if(computer.result > 21 ) {
            secondPlay="over"
        }
    }

    fun checkComputerResult() : String{
        return secondPlay
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
    fun determineWinner(){
        if(player.result<22 && computer.result<22){
            if(player.result >computer.result){
                println("${player.name} je pobijednik !!")
            }
            else if ( player.result < computer.result){
                println("${computer.name} je pobijednik !!")
            }
            else {
                println("Ova igra je završila izjednačeno !!.")
            }
        }
        else if(player.result < 22 && computer.result > 21){
            println("Pobijednik je ${player.name} !")
        }
        else if(player.result > 21 && computer.result<22){
            println("Pobijednik je ${computer.name} !")

        }
    }
    fun getResult(){

        println("Rezultat ${player.name} je ${player.result}")
        println("Rezultat ${computer.name} je ${computer.result}")
    }
    fun compCards(){
        for(card in computer.cards){
            println(card)
        }
    }
}