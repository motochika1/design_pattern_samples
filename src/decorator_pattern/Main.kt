package decorator_pattern

fun main(){
    val d1 : Display = StringDisplay("design pattern")
    val d2 : Display = SideBorder(d1,'*')
    val d3 : Display = FullBorder(d2)

    d1.show()
    d2.show()
    d3.show()
}