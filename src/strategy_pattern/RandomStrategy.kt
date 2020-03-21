package strategy_pattern

import kotlin.random.Random

class RandomStrategy : Strategy {

    var won = false

    override fun nextHand(): Hand {

        return Hand.getHand(Random.nextInt(3))
    }

    override fun study(win: Boolean) {
       won = win
    }
}