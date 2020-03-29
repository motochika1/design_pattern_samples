package composite_pattern


fun main() {
    try {
        println("Making root entries....")

        val rootdir = Directory("root")
        val bindir = Directory("bin")
        val tmpdir = Directory("tmp")
        val userdir = Directory("user")

        println(rootdir)
        println(bindir)



        rootdir.add(bindir)
        rootdir.add(tmpdir)
        rootdir.add(userdir)


        bindir.add(File("vi", 10))
        bindir.add(File("latex", 20))

        rootdir.printList()


        println("Making root entries....")

        val yukidir = Directory("yuki")
        val hanakodir = Directory("hanako")
        val tomuradir = Directory("tomura")

        userdir.add(yukidir)
        userdir.add(hanakodir)
        userdir.add(tomuradir)

        yukidir.add(File("diary.html", 5))
        yukidir.add(File("Composite.java", 30))

        hanakodir.add(File("memo.txt", 2))

        tomuradir.add(File("game.doc", 5))
        tomuradir.add(File("junk.mail", 3))

        rootdir.printList()

    } catch (e:FileTreatmentException){
        e.printStackTrace()
    }
}