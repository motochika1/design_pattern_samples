package composite_pattern


abstract class Entry {

    abstract val name:String
    abstract val size:Int

    open fun add(entry: Entry):Entry{
        throw FileTreatmentException()
    }

    fun printList(){
        printList("")
    }
    abstract fun printList(prefix:String)

    override fun toString(): String {
        return "$name ($size)"
    }

}