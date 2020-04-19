class Player(name:String) {

    var name : String ="Josip"
    var cards: MutableList<String> = mutableListOf<String>()
    var result : Int = 0
    var numberOfCard : Int = 2
    init{
        this.name=name

        var card1 = Card()
        var card2 = Card()

        cards.add(card1.name)
        cards.add(card2.name)
        if(card1.name == "ACE" && card2.name == "ACE")
            card2.value=1

        result = card1.value + card2.value;

        if(name == "Računalo")
            println("Igrač $name je započeo igru.")
    }
    fun giveMeCard()  {
        println("Izvlačim kartu...")
        var card = Card()
        if(card.name == "ACE"){
            cards.add(card.name)
            if(result+card.value >21){
                result++
            }
            else{
                result+= card.value
            }
        }
        else{
            cards.add(card.name)
            result+= card.value
            numberOfCard++
        }

    }

}