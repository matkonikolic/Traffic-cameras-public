//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.12.17 at 06:36:56 PM UTC 
//


package com.projektr.tomcatservertest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * One or more physically separate locations. Multiple locations may be related, as in an itinerary (or route), or may be unrelated. It is not for identifying the same physical location using different Location objects for different referencing systems.
 * 
 * <p>Java class for GroupOfLocations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupOfLocations"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="groupOfLocationsExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupOfLocations", propOrder = {
    "groupOfLocationsExtension"
})
@XmlSeeAlso({
    Location.class
})
public abstract class GroupOfLocations {

    protected ExtensionType groupOfLocationsExtension;

    /**
     * Gets the value of the groupOfLocationsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGroupOfLocationsExtension() {
        return groupOfLocationsExtension;
    }

    /**
     * Sets the value of the groupOfLocationsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGroupOfLocationsExtension(ExtensionType value) {
        this.groupOfLocationsExtension = value;
    }

}