package composite_pattern

abstract class Entry {

    abstract val name:String
    abstract val size:Int
    abstract fun add(entry:Entry):Entry

    fun printList(){
        printList("")
    }
    protected abstract fun printList(prefix:String)

    override fun toString(): String {
        return "$name ($size)"
    }

}