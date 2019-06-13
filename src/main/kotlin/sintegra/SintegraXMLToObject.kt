package sintegra

import java.io.File
import java.nio.file.Files
import java.nio.file.attribute.BasicFileAttributes
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import javax.xml.bind.JAXBContext

fun main() {
    val file = File("/mnt/servidor/orion/xml/sintegra")

    val files = file.listFiles()

    val dataAtual = LocalDate.now()

    files.forEach {
        // if(it.name == ""){
        val fileAttributes = Files.readAttributes(it.toPath(), BasicFileAttributes::class.java)
        val fileDataCriacao = fileAttributes.creationTime()

        println("fileDataCriacao -> " + fileDataCriacao)
        val fileDataCriacaoToString = SimpleDateFormat("yyyy-MM-dd").format(fileDataCriacao.toMillis())

        println("fileDataCriacao.toMillis() -> " + fileDataCriacao)
        println("fileDataCriacaoToString -> " + fileDataCriacaoToString)
        println("------------------------------------------------------------------------")
        val dataCriacaoArquivo = LocalDate.parse(fileDataCriacaoToString, DateTimeFormatter.ofPattern("yyyy-MM-dd"))

        //   if(dataAtual.isEqual(dataCriacaoArquivo)){
        val jaxnContext = JAXBContext.newInstance(SintegraData::class.java)
        val jaxbUnmarshaller = jaxnContext.createUnmarshaller()
        val sintegraData = jaxbUnmarshaller.unmarshal(it) as SintegraData

        //println(sintegraData)
        //  }

        // }
    }
}