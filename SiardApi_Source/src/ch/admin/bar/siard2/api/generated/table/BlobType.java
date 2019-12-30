// 
// Decompiled by Procyon v0.5.36
// 

package ch.admin.bar.siard2.api.generated.table;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "blobType", namespace = "http://www.bar.admin.ch/xmlns/siard/2/table.xsd", propOrder = { "value" })
public class BlobType
{
    @XmlValue
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] value;
    @XmlAttribute(name = "file")
    @XmlSchemaType(name = "anyURI")
    protected String file;
    @XmlAttribute(name = "length")
    protected BigInteger length;
    @XmlAttribute(name = "digestType")
    protected DigestTypeType digestType;
    @XmlAttribute(name = "digest")
    protected String digest;
    
    public byte[] getValue() {
        return this.value;
    }
    
    public void setValue(final byte[] value) {
        this.value = value;
    }
    
    public String getFile() {
        return this.file;
    }
    
    public void setFile(final String value) {
        this.file = value;
    }
    
    public BigInteger getLength() {
        return this.length;
    }
    
    public void setLength(final BigInteger value) {
        this.length = value;
    }
    
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
