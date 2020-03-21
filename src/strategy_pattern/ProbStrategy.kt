package strategy_pattern

import kotlin.random.Random

class ProbStrategy : Strategy {

    private var prevHandValue = 0
    private var currentHandValue = 0

    private var history_guu = arrayListOf(1,1,1)
    private var history_choki = arrayListOf(1,1,1)
    private var history_paa = arrayListOf(1,1,1)


    override fun nextHand():Hand{
        var bet = Random.nextInt(getSum(currentHandValue))
        var handvalue = 0

        if(currentHandValue == 0){
            if(bet < history_guu[0]) handvalue = 0
            else if(bet < history_guu[0] + history_guu[1]) handvalue = 1
            else handvalue = 2
        }
        else if(currentHandValue == 1){
            if(bet < history_choki[0]) handvalue = 0
            else if(bet < history_choki[0] + history_choki[1]) handvalue = 1
            else handvalue = 2
        }
        else{
            if(bet < history_paa[0]) handvalue = 0
            else if(bet < history_paa[0] + history_paa[1]) handvalue = 1
            else handvalue = 2
        }

        prevHandValue = currentHandValue
        currentHandValue = handvalue

        return Hand.getHand(handvalue)
    }

    private fun getSum(hv:Int):Int{

        return when(hv){
            0 -> history_guu.sum()
            1 -> history_choki.sum()
            else -> history_paa.sum()
        }

    }

    override fun study(win: Boolean) {
        if(win){
            if(prevHandValue == 0) history_guu[currentHandValue]++
            else if(prevHandValue == 1) history_choki[currentHandValue]++
            else history_paa[currentHandValue]++
        }
        else{
            if(prevHandValue == 0) history_guu[(currentHandValue+1)%3]++
            else if(prevHandValue == 1) history_choki[(currentHandValue+1)%3]++
            else history_paa[(currentHandValue+1)%3]++

        }
    }

}