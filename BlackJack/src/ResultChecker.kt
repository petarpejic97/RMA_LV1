
class ResultChecker(private val player : Player, private val computer:Player) {

    fun computerOver(playerName : String){
        println("REZULTAT: $playerName je pobijednik. Računalo ima preko 21")
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
}