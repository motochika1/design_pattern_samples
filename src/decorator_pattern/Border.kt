package decorator_pattern

abstract class Border(protected val display: Display) : Display()