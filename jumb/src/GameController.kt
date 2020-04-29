class GameController {
    val kocke = Array(6) { Kocka() }

    val provjeraRezultata = ProvjeraRezultata(kocke)

    var brojZakljucanih : Int =0

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
        kocke[broj].zakljucano=true
    }
    fun zavrtiNezakljucane(){
        for(kocka in kocke){
            if(!kocka.zakljucano){
                kocka.ponovnoZavrti()
            }
        }
    }

}