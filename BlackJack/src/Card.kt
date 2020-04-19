class Card {

    var name : String ="card"
    var value : Int = 0
    var random : Int =(2..13).random()

    init{
        when(random){
            2 -> {
                name = "TWO"
                value = 2
            }
            3 ->{
                name = "THREE"
                value = 3
            }
            4 -> {
                    name = "FOUR"
                    value = 4
                }
            5 -> {
                name = "FIVE"
                value = 5
            }
            6 -> {
                name = "SIX"
                value = 6
            }
            7 -> {
                name = "SEVEN"
                value = 7
            }
            8 -> {
                name = "EIGHT"
                value = 8
            }
            9 -> {
                name = "NINE"
                value = 9
            }
            10 -> {
                name = "TEN"
                value = 10
            }
            11 -> {
                name = "JACK"
                value = 10
            }
            12 -> {
                name = "QUEEN"
                value = 10
            }
            13 -> {
                name = "KING"
                value = 10
            }
            14 -> {
                name = "ACE"
                value = 11
            }
        }

    }

}