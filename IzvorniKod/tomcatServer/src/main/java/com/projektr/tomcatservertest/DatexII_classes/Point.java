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
 * A single geospatial point.
 * 
 * <p>Java class for Point complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Point"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}NetworkLocation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alertCPoint" type="{http://datex2.eu/schema/2/2_0}AlertCPoint" minOccurs="0"/&gt;
 *         &lt;element name="pointAlongLinearElement" type="{http://datex2.eu/schema/2/2_0}PointAlongLinearElement" minOccurs="0"/&gt;
 *         &lt;element name="pointByCoordinates" type="{http://datex2.eu/schema/2/2_0}PointByCoordinates" minOccurs="0"/&gt;
 *         &lt;element name="pointExtension" type="{http://datex2.eu/schema/2/2_0}_PointExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Point", propOrder = {
    "alertCPoint",
    "pointAlongLinearElement",
    "pointByCoordinates",
    "pointExtension"
})
public class Point
    extends NetworkLocation
{

    protected AlertCPoint alertCPoint;
    protected PointAlongLinearElement pointAlongLinearElement;
    protected PointByCoordinates pointByCoordinates;
    protected PointExtensionType pointExtension;

    /**
     * Gets the value of the alertCPoint property.
     * 
     * @return
     *     possible object is
     *     {@link AlertCPoint }
     *     
     */
    public AlertCPoint getAlertCPoint() {
        return alertCPoint;
    }

    /**
     * Sets the value of the alertCPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCPoint }
     *     
     */
    public void setAlertCPoint(AlertCPoint value) {
        this.alertCPoint = value;
    }

    /**
     * Gets the value of the pointAlongLinearElement property.
     * 
     * @return
     *     possible object is
     *     {@link PointAlongLinearElement }
     *     
     */
    public PointAlongLinearElement getPointAlongLinearElement() {
        return pointAlongLinearElement;
    }

    /**
     * Sets the value of the pointAlongLinearElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointAlongLinearElement }
     *     
     */
    public void setPointAlongLinearElement(PointAlongLinearElement value) {
        this.pointAlongLinearElement = value;
    }

    /**
     * Gets the value of the pointByCoordinates property.
     * 
     * @return
     *     possible object is
     *     {@link PointByCoordinates }
     *     
     */
    public PointByCoordinates getPointByCoordinates() {
        return pointByCoordinates;
    }

    /**
     * Sets the value of the pointByCoordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointByCoordinates }
     *     
     */
    public void setPointByCoordinates(PointByCoordinates value) {
        this.pointByCoordinates = value;
    }

    /**
     * Gets the value of the pointExtension property.
     * 
     * @return
     *     possible object is
     *     {@link PointExtensionType }
     *     
     */
    public PointExtensionType getPointExtension() {
        return pointExtension;
    }

    /**
     * Sets the value of the pointExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointExtensionType }
     *     
     */
    public void setPointExtension(PointExtensionType value) {
        this.pointExtension = value;
    }

}