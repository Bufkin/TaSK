//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2023.01.12 um 11:15:04 AM CET 
//


package generated.jaxb.configuration;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für usetype.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="usetype"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="optional"/&gt;
 *     &lt;enumeration value="required"/&gt;
 *     &lt;enumeration value="atLeastOne"/&gt;
 *     &lt;enumeration value="forbidden"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "usetype")
@XmlEnum
public enum Usetype {

    @XmlEnumValue("optional")
    OPTIONAL("optional"),
    @XmlEnumValue("required")
    REQUIRED("required"),
    @XmlEnumValue("atLeastOne")
    AT_LEAST_ONE("atLeastOne"),
    @XmlEnumValue("forbidden")
    FORBIDDEN("forbidden");
    private final String value;

    Usetype(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Usetype fromValue(String v) {
        for (Usetype c: Usetype.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
