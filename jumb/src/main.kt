fun main(){
    val gameController = GameController()

    gameController.ispisiKocke()

    println("Želite li zamijeniti neke kocke(y/n): ")

    do{
        val response = readLine()

        if(response!="y" && response != "n") println("Pogrešan unos.")

        if(response =="y"){

            println("Unesite koliko kockica želite zaključati: ")
            val brojZakljucanih : Int = readLine()!!.toInt()

            for(i in 1 until brojZakljucanih+1){

                println("Unesite koju želite zaključati:")
                val brojkocke : Int = readLine()!!.toInt()
                gameController.zakljucaj(brojkocke);
            }
            println("Zaključavanje završeno.")
            println("Ponovno vrtimo nezaključane")
            gameController.zavrtiNezakljucane();
            gameController.ispisiKocke()

        }
    }while(response!="y" && response != "n")

    gameController.provjeriUspjeh()
}