package composite_pattern

class Directory(override val name: String) : Entry() {

    private val directory = arrayListOf<Entry>()

    override val size: Int
        get(){
            var s = 0

            while(directory.iterator().hasNext()){
                var entry = directory.iterator().next()
                s+=entry.size
            }

            return s

        }

    override fun add(entry:Entry):Entry{

        directory.add(entry)
        return this
    }

    override fun printList(prefix: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}