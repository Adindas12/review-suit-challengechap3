
class ResultSuit (val status: String){
    companion object {
        const val WIN: String = "MENANG !! Selamat!"
        const val LOSE: String = "KALAH :("
        const val DRAW: String = "SERI"
        const val EMPTY: String = "Salah memasukan data, ulang kembali!!"
    }
}