package strategy_pattern


    fun main(){

        val player1 = Player("Taro",WinningStrategy())
        //val player2 = Player("Hanako",ProbStrategy())
        val player3 = Player("Takeshi",RandomStrategy())

        for(i in 0..100){
            val nextHand1 = player1.nextHand()
            //val nextHand2 = player2.nextHand()
            val nextHand3 = player3.nextHand()

            if(nextHand1.isStrongerThan(nextHand3)){
                println("Winner : $player1")
                player1.win()
                player3.lose()
            }
            else if(nextHand3.isStrongerThan(nextHand1)){
                println("Winner : $player3")
                player3.win()
                player1.lose()
            }
            else{
                println("Even・・")
                player1.even()
                player3.even()
            }

        }
        println("Total result: ")
        println(player1.toString())
        println(player3.toString())
    }
