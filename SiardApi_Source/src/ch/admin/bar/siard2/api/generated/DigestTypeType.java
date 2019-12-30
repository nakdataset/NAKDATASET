// 
// Decompiled by Procyon v0.5.36
// 

package ch.admin.bar.siard2.api.generated;

import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "digestTypeType", namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
@XmlEnum
public enum DigestTypeType
{
    @XmlEnumValue("MD5")
    MD_5("MD5"), 
    @XmlEnumValue("SHA-1")
    SHA_1("SHA-1"), 
    @XmlEnumValue("SHA-256")
    SHA_256("SHA-256");
    
    private final String value;
    
    private DigestTypeType(final String v) {
        this.value = v;
    }
    
    public String value() {
        return this.value;
    }
    
    public static DigestTypeType fromValue(final String v) {
        for (final DigestTypeType c : values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
