import kotlin.Result

class ResultSuit (val status: String){

    companion object {
        const val WIN = "win"
        const val LOSE = "lose"
        const val DRAW = "draw"
        const val EMPTY = ""
    }
}