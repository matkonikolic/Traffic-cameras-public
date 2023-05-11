//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.12.17 at 06:36:56 PM UTC 
//


package com.projektr.tomcatservertest;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinearReferencingDirectionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LinearReferencingDirectionEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="both"/&gt;
 *     &lt;enumeration value="opposite"/&gt;
 *     &lt;enumeration value="aligned"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LinearReferencingDirectionEnum")
@XmlEnum
public enum LinearReferencingDirectionEnum {


    /**
     * Indicates that both directions of traffic flow are affected by the situation or relate to the traffic data.
     * 
     */
    @XmlEnumValue("both")
    BOTH("both"),

    /**
     * Indicates that the direction of traffic flow affected by the situation or related to the traffic data is in the opposite sense to the direction in which the linear element is defined.
     * 
     */
    @XmlEnumValue("opposite")
    OPPOSITE("opposite"),

    /**
     * Indicates that the direction of traffic flow affected by the situation or related to the traffic data is in the same sense as the direction in which the linear element is defined.
     * 
     */
    @XmlEnumValue("aligned")
    ALIGNED("aligned"),

    /**
     * Indicates that the direction of traffic flow affected by the situation or related to the traffic data is unknown.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    LinearReferencingDirectionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LinearReferencingDirectionEnum fromValue(String v) {
        for (LinearReferencingDirectionEnum c: LinearReferencingDirectionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}