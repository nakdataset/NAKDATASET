// 
// Decompiled by Procyon v0.5.36
// 

package ch.admin.bar.siard2.api.generated.old10;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "matchTypeType", namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd")
@XmlEnum
public enum MatchTypeType
{
    FULL, 
    PARTIAL, 
    SIMPLE;
    
    public String value() {
        return this.name();
    }
    
    public static MatchTypeType fromValue(final String v) {
        return valueOf(v);
    }
}
