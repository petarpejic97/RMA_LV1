import com.sun.org.apache.xpath.internal.operations.Bool

class ProvjeraRezultata(private var kocke: Array<Kocka>) {

    var jumb =false
    var poker =false
    var skala =false

    fun provjeriUspjeh() {
        jumb = provjeriJumb()

        poker = provjeriPoker()

        skala = provjeriSkalu()

        ispisiRezultat()
    }
    fun provjeriJumb() : Boolean {
        return kocke.groupingBy { it.broj }.eachCount().any { it.value > 4 }
    }
    fun provjeriPoker() : Boolean {
        return kocke.groupingBy { it.broj }.eachCount().any { it.value == 4 }
    }
    fun provjeriSkalu() : Boolean{
        val listaDobivenihKocki : MutableList<Int> = mutableListOf<Int>()

        for(kocka in kocke){
            listaDobivenihKocki.add(kocka.broj)
        }
        val nizaSkala= listOf<Int>(1,2,3,4,5)

        val visaSkala= listOf<Int>(2,3,4,5,6)

        if(listaDobivenihKocki.containsAll(nizaSkala) || listaDobivenihKocki.containsAll(visaSkala))
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