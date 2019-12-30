// 
// Decompiled by Procyon v0.5.36
// 

package ch.admin.bar.siard2.api.generated;

import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "actionTimeType", namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
@XmlEnum
public enum ActionTimeType
{
    BEFORE("BEFORE"), 
    @XmlEnumValue("INSTEAD OF")
    INSTEAD_OF("INSTEAD OF"), 
    AFTER("AFTER");
    
    private final String value;
    
    private ActionTimeType(final String v) {
        this.value = v;
    }
    
    public String value() {
        return this.value;
    }
    
    public static ActionTimeType fromValue(final String v) {
        for (final ActionTimeType c : values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
