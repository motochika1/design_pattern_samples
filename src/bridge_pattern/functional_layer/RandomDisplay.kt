package bridge_pattern.functional_layer

import bridge_pattern.implimantation_layer.DisplayImpl
import kotlin.random.Random

class RandomDisplay(impl:DisplayImpl) : CountDisplay(impl) {

    fun randomDisplay(times:Int){

        multiDisplay(Random.nextInt(times))


    }
}