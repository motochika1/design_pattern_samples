package singleton_pattern

object SingltonKt {
    var ticketnum: Int = 1000
    fun getNextTicketNumber(): Int {
        return ticketnum++
    }

}