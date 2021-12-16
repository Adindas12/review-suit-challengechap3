import elements.Paper
import elements.Rock
import elements.Scissors

fun main(args: Array<String>) {
    println("input suit: (gunting, batu, kertas)")
    startSuit()
}

private fun startSuit(){
    val input1 = readLine()
    val suit1 = when (input1) {
        "gunting" -> Scissors(StringContainer.scissors)
        "batu" -> Rock(StringContainer.rock)
        "kertas" -> Paper(StringContainer.paper)
        else -> Suit("nothing else")
    }

    if (suit1.name != "nothing else") {
        val input2 = readLine()
        val suit2 = when (input2) {
            "gunting" -> Scissors(StringContainer.scissors)
            "batu" -> Rock(StringContainer.rock)
            "kertas" -> Paper(StringContainer.paper)
            else -> Suit("nothing else")
        }

        if (suit2.name != "nothing else") {
            val winnerSuit1 = suit1.actionAgainst(suit2)
            println(winnerSuit1.status)
        } else {
            println("silahkan input kembali")
        }
    } else {
        println("silahkan input kembali")
        startSuit()

    }
}