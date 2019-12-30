// 
// Decompiled by Procyon v0.5.36
// 

package ch.admin.bar.siard2.api.generated;

import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "messageDigestType", namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd", propOrder = { "digestType", "digest" })
public class MessageDigestType
{
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd", required = true)
    @XmlSchemaType(name = "string")
    protected DigestTypeType digestType;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd", required = true)
    protected String digest;
    
    public DigestTypeType getDigestType() {
        return this.digestType;
    }
    
    public void setDigestType(final DigestTypeType value) {
        this.digestType = value;
    }
    
    public String getDigest() {
        return this.digest;
    }
    
    public void setDigest(final String value) {
        this.digest = value;
    }
}
