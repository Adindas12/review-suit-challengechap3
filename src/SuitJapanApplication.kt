import elements.Paper
import elements.Rock
import elements.Scissors
import elements.parent.Suit
import helper.StringContainer

fun main(args: Array<String>) {
    startSuitWithCom()
}

private fun startSuitWithCom() {
    val paper = Paper("paper")
    val rock = Rock("rock")
    val scissors = Scissors("scissors")

    val resultList: List<Suit> = listOf(paper, rock, scissors)
    val compSuit = resultList.random()

    println("computer milih -> ${compSuit.name}")
    println("input suit (kertas, gunting, batu)")
    val input = readLine()

    // TODO: "solved this line  (use do-while)"
    /**
     * loop ketika user input selain kertas, gunting, batu
     * User input selain kertas, gunting, batu -> fungsi readline s/d success -> di loop (mengulang)
     * Meminta user menginput kembali
     */
    do {
//        val mySuit = when (input) {
//            "gunting" -> Scissors(StringContainer.scissors)
//            "batu" -> Rock(StringContainer.rock)
//           else -> Paper(StringContainer.paper)
//        }
//
//        val result = mySuit.actionAgainst(compSuit)
//        println("you is ${result.status} | you: ${mySuit.name} vs comp: ${compSuit.name}")
//
//        println("main lagi? (ketik yes jika ingin)")
//        val yes = readLine()
//        if (yes == "yes") {
//            startSuitWithCom()
//        } else {
//            break
//        }
        println(input)
    } while (input == "gunting" && input == "batu" && input == "kertas")
}

private fun startSuit(){
    println("Player 1: Silahkan input")
    val input1 = readLine()
    val suit1 = when (input1) {
        "gunting" -> Scissors(StringContainer.scissors)
        "batu" -> Rock(StringContainer.rock)
        "kertas" -> Paper(StringContainer.paper)
        else -> Suit("nothing else")
    }

    if (suit1.name != "nothing else") {
        println("Player 2: Silahkan input")
        val input2 = readLine()
        val suit2 = when (input2) {
            "gunting" -> Scissors(StringContainer.scissors)
            "batu" -> Rock(StringContainer.rock)
            "kertas" -> Paper(StringContainer.paper)
            else -> Suit("nothing else")
        }

        if (suit2.name != "nothing else") {
            val resultSuit1 = suit1.actionAgainst(suit2)
            val resultSuit2 = suit2.actionAgainst(suit1)

            println("Player1 = ${resultSuit1.status}")
            println("Player2 = ${resultSuit2.status}")
        } else {
            println("silahkan input kembali")
        }
    } else {
        println("silahkan input kembali")
        startSuit()

    }
}