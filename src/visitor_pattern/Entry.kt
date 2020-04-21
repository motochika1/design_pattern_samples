package visitor_pattern

import composite_pattern.FileTreatmentException

abstract class Entry : Element {

    abstract val name:String
    abstract val size:Int

    open fun add(entry: Entry):Entry{
        throw FileTreatmentException()
    }
    open fun iterator():Iterator<Entry>{
        throw FileTreatmentException()
    }

    override fun toString(): String {
        return "$name ($size)"
    }
}