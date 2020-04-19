import com.sun.org.apache.xpath.internal.operations.Bool

class Kocka {
    var broj : Int = 0
    var zakljucano : Boolean=false
    init{

        broj = (1..6).random()
    }
    fun ponovnoZavrti(){
            broj=(1..6).random()

    }
}