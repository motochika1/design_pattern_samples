package singleton_pattern

    fun main() {

        val obj1 = Singleton.getSingleton()
        val obj2 = Singleton.getSingleton()

        if (obj1 == obj2) println("obj1 and obj2 are same objects")
        else println("not same object")
        
    }