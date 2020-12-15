package singleton_pattern

class Singleton {
    companion object  {
        private val singleton = Singleton()
        fun getSingleton(): Singleton{
            return singleton
        }
    }
}