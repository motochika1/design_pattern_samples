package bridge_pattern.functional_layer

import bridge_pattern.implimantation_layer.DisplayImpl

open class CountDisplay(impl: DisplayImpl) : Display(impl) {

    fun multiDisplay(times:Int){
        open()

        for(i in 0..times){
            print()
        }

        close()
    }
}