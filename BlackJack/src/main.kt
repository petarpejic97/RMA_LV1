fun main(){

    println("Upišite svoje ime: ")
    var playerName = readLine()

    var gameController = GameController("$playerName")

    gameController.computerPlay()

    if(gameController.checkComputerResult() == "over"){
        println("REZULTAT: $playerName je pobijednik. Računalo ima preko 21")
        gameController.compCards()
    }
    else{
        gameController.youPlay()
        println("====================")
        gameController.getResult()
        gameController.determineWinner()
    }
}
