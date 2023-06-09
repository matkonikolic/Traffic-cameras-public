//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.12.17 at 06:36:56 PM UTC 
//


package com.projektr.tomcatservertest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A point location is a zero-dimensional element in a map that specifies a geometric location.
 * 
 * <p>Java class for OpenlrPointLocationReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrPointLocationReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="openlrGeoCoordinate" type="{http://datex2.eu/schema/2/2_0}OpenlrGeoCoordinate" minOccurs="0"/&gt;
 *         &lt;element name="openlrPoiWithAccessPoint" type="{http://datex2.eu/schema/2/2_0}OpenlrPoiWithAccessPoint" minOccurs="0"/&gt;
 *         &lt;element name="openlrPointAlongLine" type="{http://datex2.eu/schema/2/2_0}OpenlrPointAlongLine" minOccurs="0"/&gt;
 *         &lt;element name="openlrPointLocationReferenceExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrPointLocationReference", propOrder = {
    "openlrGeoCoordinate",
    "openlrPoiWithAccessPoint",
    "openlrPointAlongLine",
    "openlrPointLocationReferenceExtension"
})
public class OpenlrPointLocationReference {

    protected OpenlrGeoCoordinate openlrGeoCoordinate;
    protected OpenlrPoiWithAccessPoint openlrPoiWithAccessPoint;
    protected OpenlrPointAlongLine openlrPointAlongLine;
    protected ExtensionType openlrPointLocationReferenceExtension;

    /**
     * Gets the value of the openlrGeoCoordinate property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrGeoCoordinate }
     *     
     */
    public OpenlrGeoCoordinate getOpenlrGeoCoordinate() {
        return openlrGeoCoordinate;
    }

    /**
     * Sets the value of the openlrGeoCoordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrGeoCoordinate }
     *     
     */
    public void setOpenlrGeoCoordinate(OpenlrGeoCoordinate value) {
        this.openlrGeoCoordinate = value;
    }

    /**
     * Gets the value of the openlrPoiWithAccessPoint property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrPoiWithAccessPoint }
     *     
     */
    public OpenlrPoiWithAccessPoint getOpenlrPoiWithAccessPoint() {
        return openlrPoiWithAccessPoint;
    }

    /**
     * Sets the value of the openlrPoiWithAccessPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrPoiWithAccessPoint }
     *     
     */
    public void setOpenlrPoiWithAccessPoint(OpenlrPoiWithAccessPoint value) {
        this.openlrPoiWithAccessPoint = value;
    }

    /**
     * Gets the value of the openlrPointAlongLine property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrPointAlongLine }
     *     
     */
    public OpenlrPointAlongLine getOpenlrPointAlongLine() {
        return openlrPointAlongLine;
    }

    /**
     * Sets the value of the openlrPointAlongLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrPointAlongLine }
     *     
     */
    public void setOpenlrPointAlongLine(OpenlrPointAlongLine value) {
        this.openlrPointAlongLine = value;
    }

    /**
     * Gets the value of the openlrPointLocationReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getOpenlrPointLocationReferenceExtension() {
        return openlrPointLocationReferenceExtension;
    }

    /**
     * Sets the value of the openlrPointLocationReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setOpenlrPointLocationReferenceExtension(ExtensionType value) {
        this.openlrPointLocationReferenceExtension = value;
    }

}
