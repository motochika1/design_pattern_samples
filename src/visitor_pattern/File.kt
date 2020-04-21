package visitor_pattern

class File(override val name: String, override val size: Int) : Entry() {

    override fun accept(v: Visitor) {
        v.visit(this)
    }

}