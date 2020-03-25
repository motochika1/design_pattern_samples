package composite_pattern

class File(override val name: String, override val size: Int) : Entry() {

    override fun printList(prefix: String) {
        println("$prefix/$this")
    }


}