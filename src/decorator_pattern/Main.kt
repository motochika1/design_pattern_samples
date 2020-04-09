package decorator_pattern

import kotlin.reflect.jvm.internal.impl.types.DisjointKeysUnionTypeSubstitution

fun main(){
    /*val d1 : Display = StringDisplay("design pattern")
    val d2 : Display = UpDownBorder(d1,'-')
    val d3 : Display = SideBorder(d2,'*')

    d1.show()
    d2.show()
    d3.show()

    val d4 : Display = FullBorder(
        UpDownBorder(
            SideBorder(
                UpDownBorder(
                    SideBorder(
                        StringDisplay("Hello World.")
                    ,'*'),
                '='),
            '|'),
        '/')
    )

    d4.show()*/

    val md : MultiStringDisplay = MultiStringDisplay()

    md.add("おはようございます")
    md.add("こんにちは")
    md.add("おやすみなさいまた明日")
    md.show()

    val d1 : Display = SideBorder(md,'#')
    d1.show()
    val d2 : Display = FullBorder(md)
    d2.show()
}