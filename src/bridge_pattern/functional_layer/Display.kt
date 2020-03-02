package bridge_pattern.functional_layer

import bridge_pattern.implimantation_layer.DisplayImpl

open class Display(private val impl: DisplayImpl) {

    fun open(){
        impl.rawOpen()
    }

    fun print(){
        impl.rawPrint()
    }

    fun close(){
        impl.rawClose()
    }

    fun display(){
        open()
        print()
        close()
    }

}