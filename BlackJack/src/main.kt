fun main(){

    println("Upišite svoje ime: ")
    val playerName = readLine()

    val gameController = GameController("$playerName")

    gameController.computerPlay()

    if(gameController.margin21 == "over"){
        gameController.resultChecker.computerOver("$playerName")
        gameController.printComputerCards()
    }
    else{
        gameController.youPlay()
        println("====================")
        gameController.resultChecker.getResult()
        gameController.resultChecker.determineWinner()
    }
}
