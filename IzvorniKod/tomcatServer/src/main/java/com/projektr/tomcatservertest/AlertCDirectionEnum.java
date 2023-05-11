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
 * <p>Java class for AlertCDirectionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlertCDirectionEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="both"/&gt;
 *     &lt;enumeration value="negative"/&gt;
 *     &lt;enumeration value="positive"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AlertCDirectionEnum")
@XmlEnum
public enum AlertCDirectionEnum {


    /**
     * Indicates that both directions of traffic flow are affected by the situation or relate to the traffic data.
     * 
     */
    @XmlEnumValue("both")
    BOTH("both"),

    /**
     * The direction of traffic flow concerned by a situation or traffic data. In ALERT-C the negative direction corresponds to the negative offset direction within the RDS location table.
     * 
     */
    @XmlEnumValue("negative")
    NEGATIVE("negative"),

    /**
     * The direction of traffic flow concerned by a situation or traffic data. In ALERT-C the positive direction corresponds to the positive offset direction within the RDS location table.
     * 
     */
    @XmlEnumValue("positive")
    POSITIVE("positive"),

    /**
     * Unknown direction.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    AlertCDirectionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AlertCDirectionEnum fromValue(String v) {
        for (AlertCDirectionEnum c: AlertCDirectionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
