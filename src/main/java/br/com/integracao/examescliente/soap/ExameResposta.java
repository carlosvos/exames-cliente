//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.05.14 às 11:47:22 PM BRT 
//


package br.com.integracao.examescliente.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Exame" type="{https://www.integracaoexames.com.br/xml/exame}Exame"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "exame"
})
@XmlRootElement(name = "ExameResposta")
public class ExameResposta {

    @XmlElement(name = "Exame", required = true)
    protected Exame exame;

    /**
     * Obtém o valor da propriedade exame.
     * 
     * @return
     *     possible object is
     *     {@link Exame }
     *     
     */
    public Exame getExame() {
        return exame;
    }

    /**
     * Define o valor da propriedade exame.
     * 
     * @param value
     *     allowed object is
     *     {@link Exame }
     *     
     */
    public void setExame(Exame value) {
        this.exame = value;
    }

}
