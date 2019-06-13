package receita

import java.io.File
import java.nio.file.Files
import java.nio.file.attribute.BasicFileAttributes
import java.nio.file.attribute.FileTime
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import javax.xml.bind.JAXBContext
import javax.xml.bind.JAXBException

fun teste() {
    try {
        val file = File("/mnt/servidor/orion/xml/receita")

        val files = file.listFiles()

        val dataAtual = LocalDate.now()



        files.forEach {
            if(it.name == "05129003000143.xml") {
                val fileAttributes = Files.readAttributes(it.toPath(), BasicFileAttributes::class.java)
                val fileTime: FileTime = fileAttributes.creationTime()

                val fileTimeToString = SimpleDateFormat("yyyy-MM-dd").format(fileTime.toMillis())
                val dataCriacaoArquivo = LocalDate.parse(fileTimeToString, DateTimeFormatter.ofPattern("yyyy-MM-dd"))

                if (dataAtual.isEqual(dataCriacaoArquivo)) {
                    val jaxbContext = JAXBContext.newInstance(ReceitaData::class.java)
                    val jaxbUnmarshaller = jaxbContext.createUnmarshaller()
                    val infCNPJ = jaxbUnmarshaller.unmarshal(it) as ReceitaData
                    println(infCNPJ)
                }
            }
        }
    } catch (e: JAXBException) {
       throw  JAXBException("Não foi posuvel acessar arquivo")
    }
}
