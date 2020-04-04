package Decorator

abstract class Display {

    abstract fun getColumns():Int
    abstract fun getRows():Int
    abstract fun getRowText(row:Int):String?

    fun show(){
        for(i in 0..getRows()) println(getRowText(i))
    }

}