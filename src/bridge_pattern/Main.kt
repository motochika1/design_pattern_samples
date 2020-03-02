package bridge_pattern

import bridge_pattern.functional_layer.CountDisplay
import bridge_pattern.functional_layer.Display
import bridge_pattern.functional_layer.RandomDisplay
import bridge_pattern.implimantation_layer.FileDisplayImpl
import bridge_pattern.implimantation_layer.StringdisplayImpl
import java.io.File

fun main(){

    val d1: Display =
        Display(StringdisplayImpl("Hello Japan!"))
    val d2: Display = CountDisplay(StringdisplayImpl("Hello World!"))
    val d3: CountDisplay =
        CountDisplay(StringdisplayImpl("Hello Universe!"))

    val d4:RandomDisplay = RandomDisplay(StringdisplayImpl("Hello USA!"))

    val d5 = CountDisplay(FileDisplayImpl(File("/Users/hirosemotochika/VSC/kotlin/test.txt")))

    d1.display()
    d2.display()
    d3.display()
    d4.display()
    d3.multiDisplay(4)
    d4.randomDisplay(5)
    d5.multiDisplay(4)


}