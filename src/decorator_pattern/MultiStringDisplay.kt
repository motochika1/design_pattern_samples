package decorator_pattern

import kotlin.reflect.jvm.internal.impl.renderer.KeywordStringsGenerated

class MultiStringDisplay() : Display() {


    private val stringList = arrayListOf<String>()
    private var columns = 0


    override fun getColumns(): Int = columns
    override fun getRows(): Int = stringList.size
    override fun getRowText(row: Int):String? = stringList[row]

    fun add(str:String){
        stringList.add(str)
        updateColumn(str)

    }
    private fun updateColumn(str: String){
        if(str.toByteArray().size > columns) columns = str.length
        for(i in 0 until stringList.size) run {
            var fills = columns - (stringList[i].toByteArray().size)
            if(fills > 0) stringList[i] = stringList[i] + spaces(fills)
        }
    }

    private fun spaces(count:Int):String{
        val strBuf = StringBuffer()
        for(i in 0 until count) strBuf.append(' ')
        return strBuf.toString()
    }




}