package strategy_pattern

interface Strategy {
    fun nextHand():Hand
    fun study(win:Boolean)
}