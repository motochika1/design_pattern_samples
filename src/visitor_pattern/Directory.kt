package visitor_pattern

import visitor_pattern.Entry

class Directory(override val name: String) : Entry() {

    private val directory = arrayListOf<Entry>()


    override val size: Int
        get(){
            var s = 0
            val it = directory.iterator()

            while(it.hasNext()){ //directory.iterator().hasNext()   間違い　　参照する変数を共通化しなければいけない
                var entry = it.next() //directory.iterator().next()　間違い
                s+=entry.size
            }

            return s

        }

    override fun add(entry: Entry): Entry {
        directory.add(entry)
        return this
    }

    override fun iterator(): Iterator<Entry> = directory.iterator()

    override fun accept(v: Visitor) {
        v.visit(this)
    }
}