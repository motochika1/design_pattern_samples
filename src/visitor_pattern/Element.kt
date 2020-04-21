package visitor_pattern

interface Element {
    abstract fun accept(v:Visitor)
}