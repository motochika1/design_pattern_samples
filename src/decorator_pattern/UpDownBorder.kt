package decorator_pattern

import java.lang.StringBuilder

class UpDownBorder(display: Display, private val borderChar: Char) : Border(display) {

    override fun getColumns(): Int = display.getColumns()
    override fun getRows(): Int = 1 + display.getRows() + 1
    override fun getRowText(row: Int): String? {

        return if(row == 0 || row == display.getRows() + 1) {
            makeLine(borderChar,getColumns())
        } else display.getRowText(row - 1)
    }
    private fun makeLine(ch:Char,count:Int): String{
        val bil = StringBuilder()
        for(i in 0..count) bil.append(ch)

        return bil.toString()
    }
}