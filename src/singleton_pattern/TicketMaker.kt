package singleton_pattern
// 63p問題5-1

class TicketMaker(private var ticket: Int = 1000) {

    companion object {
        private val ticketMaker = TicketMaker()

        @JvmName("getTicketMaker1")
        fun getTicketMaker(): TicketMaker {
            return ticketMaker
        }

    }

    fun getNextTicketNumber():Int {
        return ticket++
    }

}