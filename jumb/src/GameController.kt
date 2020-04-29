class GameController {
    var kocke = Array(6) { Kocka() }
    init{
        println("Igra započinje. Kocke se bacaju.")
    }

    fun ispisiKocke(){
        println("Dobivene kocke:")
        for((i,kocka) in kocke.withIndex()){
            println("["+i+"]"+"->"+kocka.broj)
        }
    }

    fun zakljucaj(broj:Int){
        kocke[broj].zakljucano=true;
    }
    fun zavrtiNezakljucane(){
        for(kocka in kocke){
            if(kocka.zakljucano == false){
                kocka.ponovnoZavrti()
            }
        }
    }

}