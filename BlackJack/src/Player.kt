class Player(name:String) {

    var name : String ="Josip"
    var cards: MutableList<String> = mutableListOf<String>()
    private var deck : Deck = Deck()
    var result : Int = 0
    init{
        this.name=name

        val card1 = deck.giveMeCard()
        val card2 = deck.giveMeCard()

        cards.add(card1.cardName)
        result+=card1.value

        if(card1.cardName == "ACE" && card2.cardName == "ACE"){
            cards.add("ACE")
            result = card1.value + 1
        }
        else{
            cards.add(card2.cardName)
            result+card2.value
        }


        if(name == "Računalo")
            println("Igrač $name je započeo igru.")
    }
    fun giveMeCard()  {
        println("Izvlačim kartu...")

        val card = deck.giveMeCard()
        if(card.cardName == "ACE"){
            cards.add(card.cardName)
            if(result+card.value >21){
                result++
            }
            else{
                result += card.value
            }
        }
        else{
            cards.add(card.cardName)
            result+= card.value
        }

    }

}