package visitor_pattern

class ListVisitor : Visitor() {
    
    private var currentdir = ""

    override fun visit(file: File) {
        println("$currentdir/$file")
    }

    override fun visit(directory: Directory) {
        
        println("$currentdir/$directory")
        
        var savedir = currentdir
        currentdir = "$currentdir/${directory.name}"
        
        val it = directory.iterator()
        
        while (it.hasNext()){
            var entry = it.next()
            entry.accept(this)
        }
        currentdir = savedir
        
        
        
        
    }
    
}