package visitor_pattern

import composite_pattern.FileTreatmentException

fun main(){

    try{
        println("Making root entries...")

        val rootdir = Directory("root")
        val bindir = Directory("bin")
        val tmpdir = Directory("tmp")
        val usrdir = Directory("user")

        rootdir.add(bindir)
        rootdir.add(tmpdir)
        rootdir.add(usrdir)
        bindir.add(File("vi",10000))
        bindir.add(File("latex",20000))
        rootdir.accept(ListVisitor())

        println("")
        println("Making user entries...")
        val yuki = Directory("yuki")
        val hanako = Directory("hanako")
        val hirose = Directory("hirose")
        val practicekt = Directory("practicekt")
        val practiceja = Directory("practiceja")
        usrdir.add(yuki)
        usrdir.add(hanako)
        usrdir.add(hirose)
        yuki.add(File("diary.html",100))
        hanako.add(File("memo.txt",200))
        hirose.add(practicekt)
        hirose.add(practiceja)
        practicekt.add(File("practice1.kt",500))
        practicekt.add(File("practice2.kt",400))
        practiceja.add(File("practice.java",400))

        rootdir.accept(ListVisitor())
    } catch (e:FileTreatmentException){
        e.printStackTrace()
    }
}