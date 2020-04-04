package Decorator

class StringDisplay(private val string:String) : Display() {

    override fun getColumns(): Int = string.toByteArray().size

    override fun getRows(): Int = 1

    override fun getRowText(row: Int): String? {

        return if(row == 0) string
        else null
    }

}