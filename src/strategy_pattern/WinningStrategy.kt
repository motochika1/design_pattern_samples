package strategy_pattern

import kotlin.random.Random

class WinningStrategy : Strategy {

    private var won = false
    var prevHand = Hand.getHand(0)


    override fun nextHand(): Hand {

        if(!won){
           prevHand = Hand.getHand(Random.nextInt(3))

        }
        return prevHand
    }

    override fun study(win: Boolean) {
        won = win
    }

}