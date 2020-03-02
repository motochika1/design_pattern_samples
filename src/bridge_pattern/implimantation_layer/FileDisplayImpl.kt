package bridge_pattern.implimantation_layer

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.io.IOException

class FileDisplayImpl(private val filename:File) : DisplayImpl() {

    private val READLIMIT = 4096
    val reader = BufferedReader(FileReader(filename))

    override fun rawOpen() {
        try{

            reader.mark(READLIMIT)

        }catch (e:IOException){
            e.printStackTrace()
        }
    }

    override fun rawPrint() {

        val line = reader.readLine()
        reader.reset()

        println("<--")

            println("*$line")


        println("-->")
    }

    override fun rawClose() {
        try {
            reader.close()
        } catch (e:IOException){
            e.printStackTrace()
        }
    }

}