package sintegra

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement

@XmlRootElement(name = "infSintegra")
@XmlAccessorType(XmlAccessType.FIELD)
data class SintegraData(
    val credDisp: Double = 0.toDouble(),
    val tempo: Double = 0.toDouble(),
    val UFCons: String? = null,
    val dtCons: String? = null,
    val CNPJ: String? = null,
    val IE: String? = null,
    val xNome: String? = null,
    val end: End? = null,
    val fone: String? = null,
    val email: String? = null,
    val infComp: InfComp? = null
)

@XmlRootElement(name = "end")
@XmlAccessorType(XmlAccessType.FIELD)
data class End(
    val xLgr: String? = null,
    val nro: Int = 0,
    val xCpl: String? = null,
    val xBairro: String? = null,
    val xMun: String? = null,
    val UF: String? = null,
    val CEP: String? = null
)

@XmlRootElement(name = "infComp")
@XmlAccessorType(XmlAccessType.FIELD)
data class InfComp(
    val ativEcon: String? = null,
    val xAtivEcon: String? = null,
    val xSitCad: String? = null,
    val flAtivo: String? = null
)