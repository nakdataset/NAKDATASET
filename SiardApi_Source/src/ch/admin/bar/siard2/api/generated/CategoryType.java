// 
// Decompiled by Procyon v0.5.36
// 

package ch.admin.bar.siard2.api.generated;

import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "categoryType", namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
@XmlEnum
public enum CategoryType
{
    @XmlEnumValue("distinct")
    DISTINCT("distinct"), 
    @XmlEnumValue("udt")
    UDT("udt");
    
    private final String value;
    
    private CategoryType(final String v) {
        this.value = v;
    }
    
    public String value() {
        return this.value;
    }
    
    public static CategoryType fromValue(final String v) {
        for (final CategoryType c : values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
