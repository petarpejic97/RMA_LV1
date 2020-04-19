class GameController {
    val kocke = Array(6) { Kocka() }
    init{
        println("Igra započinje. Kocke se bacaju.")
    }

    fun ispisiKocke(){
        println("Dobivene kocke:")
        for((i,kocka) in kocke.withIndex()){
            println("["+i+"]"+"->"+kocka.broj)
        }
    }
    fun provjeriUspjeh(){
        var jumb = provjeriJumb()

        var poker = provjeriPoker()

        var skala = provjeriSkalu()

        if(jumb == true){
            println("IMAMO JUMB !!")
        }
        if(poker==true){
            println("IMAMPO POKER !!")
        }
        if(skala==true){
            println("IMAMPO SKALU !!")
        }
    }
    fun provjeriJumb() : Boolean{

        for(i in 1 until 6){
            var brojac=0
            for(kocka in kocke)
                if(kocka.broj == i){
                    brojac++
                }
            if(brojac == 5){
                return true;
            }
        }
        return false
    }
    fun provjeriPoker() : Boolean{

        for(i in 1 until 6){
            var brojac=0
            for(kocka in kocke)
                if(kocka.broj == i){
                    brojac++
                }
            if(brojac == 4){
                return true;
            }
        }
        return false
    }
    fun provjeriSkalu() : Boolean{
        //kocke.sortBy { it.broj }
        var prvamoguca=false
        var drugamoguca=false

        if(nadiBroj(1) == true){
            if(nadiBroj(2) == true){
                if(nadiBroj(3) == true){
                    if(nadiBroj(4) == true){
                        if(nadiBroj(5) == true){
                            prvamoguca=true;
                        }
                    }
                }
            }
        }
        if(nadiBroj(2) == true){
            if(nadiBroj(3) == true){
                if(nadiBroj(4) == true){
                    if(nadiBroj(5) == true){
                        if(nadiBroj(6) == true){
                            drugamoguca=true;
                        }
                    }
                }
            }
        }
        if(prvamoguca == true || drugamoguca == true)
            return true
        else
            return false
    }
    fun nadiBroj(broj:Int) : Boolean{
        for((i,kocka) in kocke.withIndex()){
            if(kocka.broj ==broj){
                return true
            }
        }
        return false
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