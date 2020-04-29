
class ProvjeraRezultata(kocke: Array<Kocka>) {
    
    private var kocke = kocke;
    var jumb =false
    var poker =false
    var skala =false

    fun provjeriUspjeh() {
        jumb = provjeriJumb()

        poker = provjeriPoker()

        skala = provjeriSkalu()

        ispisiRezultat()
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
        val listaDobivenihKocki : MutableList<Int> = mutableListOf<Int>();

        for(kocka in kocke){
            listaDobivenihKocki.add(kocka.broj)
        }
        val nizaSkala= listOf<Int>(1,2,3,4,5)

        val visaSkala= listOf<Int>(2,3,4,5,6)

        if(listaDobivenihKocki.containsAll(nizaSkala))
            return true

        if(listaDobivenihKocki.containsAll(visaSkala))
            return true

        return false
    }
    fun ispisiRezultat(){
        if(jumb){
            println("IMAMO JUMB !!")
        }
        if(poker){
            println("IMAMO POKER !!")
        }
        if(skala){
            println("IMAMO SKALU !!")
        }
    }
}