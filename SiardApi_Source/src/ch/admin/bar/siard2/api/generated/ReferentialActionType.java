// 
// Decompiled by Procyon v0.5.36
// 

package ch.admin.bar.siard2.api.generated;

import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "referentialActionType", namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
@XmlEnum
public enum ReferentialActionType
{
    CASCADE("CASCADE"), 
    @XmlEnumValue("SET NULL")
    SET_NULL("SET NULL"), 
    @XmlEnumValue("SET DEFAULT")
    SET_DEFAULT("SET DEFAULT"), 
    RESTRICT("RESTRICT"), 
    @XmlEnumValue("NO ACTION")
    NO_ACTION("NO ACTION");
    
    private final String value;
    
    private ReferentialActionType(final String v) {
        this.value = v;
    }
    
    public String value() {
        return this.value;
    }
    
    public static ReferentialActionType fromValue(final String v) {
        for (final ReferentialActionType c : values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
