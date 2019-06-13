package receita

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlRootElement

@XmlRootElement(name = "infCNPJ")
@XmlAccessorType(XmlAccessType.FIELD)
data class ReceitaData(
    @XmlElement
    val credDisp: Double = 0.toDouble(),

    @XmlElement
    val tempo: Float = 0.toFloat(),

    @XmlElement
    val CNPJ: String? = null,

    @XmlElement
    val dtAber: String? = null,

    @XmlElement
    val xNome: String? = null,

    @XmlElement
    val xFant: String? = null,

    @XmlElement
    val ativPrinc: AtivPrinc? = null,

    @XmlElement
    val ativSecund: AtivSecund? = null,

    @XmlElement
    val natJur: NatJur? = null,

    @XmlElement
    val end: End? = null,

    @XmlElement
    val email: String? = null,

    @XmlElement
    val fone: String? = null,

    @XmlElement
    val efr: String? = null,

    @XmlElement
    val xSitCad: String? = null,

    @XmlElement
    val dtSitCad: String? = null,

    @XmlElement
    val xMotSitCad: String? = null,

    @XmlElement
    val xSitEsp: String? = null,

    @XmlElement
    val dtSitEsp: String? = null
)

@XmlRootElement(name = "ativPrinc")
@XmlAccessorType(XmlAccessType.FIELD)
data class AtivPrinc(
    @XmlElement
    val xCod: String? = null,

    @XmlElement
    val xDesc: String? = null
)

@XmlRootElement(name = "ativSecund")
@XmlAccessorType(XmlAccessType.FIELD)
data class AtivSecund(
    @XmlElement
    val xCod: String? = null,

    @XmlElement
    val xDesc: String? = null
)

@XmlRootElement(name = "natJur")
@XmlAccessorType(XmlAccessType.FIELD)
data class NatJur(
    @XmlElement
    val xCod: String? = null,

    @XmlElement
    val xDesc: String? = null
)

@XmlRootElement(name = "end")
@XmlAccessorType(XmlAccessType.FIELD)
data class End (
    @XmlElement
    val xLgr: String? = null,

    @XmlElement
    val nro: Int = 0,

    @XmlElement
    val xCpl: String? = null,

    @XmlElement
    val CEP: String? = null,

    @XmlElement
    val xBairro: String? = null,

    @XmlElement
    val xMun: String? = null,

    @XmlElement
    val UF: String? = null
)