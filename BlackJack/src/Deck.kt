class Deck {
    var deckCards = mutableListOf<Card>()
    init{
        for ( x in 1 until 5){
            deckCards.add(Card.TWO)
            deckCards.add(Card.THREE)
            deckCards.add(Card.FOUR)
            deckCards.add(Card.FIVE)
            deckCards.add(Card.SIX)
            deckCards.add(Card.SEVEN)
            deckCards.add(Card.EIGHT)
            deckCards.add(Card.NINE)
            deckCards.add(Card.TEN)
            deckCards.add(Card.JACK)
            deckCards.add(Card.QUEEN)
            deckCards.add(Card.KING)
            deckCards.add(Card.ACE)
        }

    }
    fun giveMeCard() : Card{
        val card = deckCards.random()
        deckCards.remove(card)
        return card
    }
}