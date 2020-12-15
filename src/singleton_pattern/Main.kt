package singleton_pattern

    fun main() {

        val obj1 = SingltonKt
        val obj2 = SingltonKt

        if (obj1 == obj2) println("obj1 and obj2 are same objects")
        else println("not same object")

        for (i in 1..10) {
            val id = SingltonKt.getNextTicketNumber()
            println("$i id:$id")
        }
    }