package bridge_pattern.implimantation_layer


class StringdisplayImpl(val string:String,val width:Int=string.toByteArray().size) : DisplayImpl() {



    override fun rawOpen() {
        printLine()
    }

    override fun rawPrint() {
        println("| $string |")
    }

    override fun rawClose() {
        printLine()
    }

    private fun printLine(){

        print("+")
        for(i in 0..width){
            print("-")
        }
        println("+")

    }

}