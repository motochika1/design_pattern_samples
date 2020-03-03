package strategy_pattern

import java.util.ArrayList

class Hand(private val handvalue:Int) {

    companion object{
        val HANDVALUE_GUU = 0
        val HANDVALUE_CHOKI = 1
        val HANDVALUE_PAA = 2

        val hand = arrayListOf(Hand(HANDVALUE_GUU), Hand(HANDVALUE_CHOKI), Hand(HANDVALUE_PAA))
        private val handname = arrayListOf("グー","チョキ","パー")

        fun getHand(handvalue: Int):Hand{
            return hand[handvalue]
        }
    }

    fun isStrongerThan(h:Hand):Boolean{
        return fight(h) == 1
    }
    fun isWeakerThan(h:Hand):Boolean{
        return fight(h) == -1
    }

    private fun fight(h:Hand):Int{
        return if(this == h) 0
        else if((this.handvalue + 1) % 3 == h.handvalue) 1
        else -1
    }

    override fun toString():String{
        return handname[handvalue]
    }


}