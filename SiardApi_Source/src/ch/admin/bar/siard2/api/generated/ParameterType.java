// 
// Decompiled by Procyon v0.5.36
// 

package ch.admin.bar.siard2.api.generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parameterType", namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd", propOrder = { "name", "mode", "type", "typeSchema", "typeName", "typeOriginal", "cardinality", "description" })
public class ParameterType
{
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd", required = true)
    protected String name;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd", required = true)
    protected String mode;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected String type;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected String typeSchema;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected String typeName;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected String typeOriginal;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected BigInteger cardinality;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected String description;
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String value) {
        this.name = value;
    }
    
    public String getMode() {
        return this.mode;
    }
    
    public void setMode(final String value) {
        this.mode = value;
    }
    
    public String getType() {
        return this.type;
    }
    
    public void setType(final String value) {
        this.type = value;
    }
    
    public String getTypeSchema() {
        return this.typeSchema;
    }
    
    public void setTypeSchema(final String value) {
        this.typeSchema = value;
    }
    
    public String getTypeName() {
        return this.typeName;
    }
    
    public void setTypeName(final String value) {
        this.typeName = value;
    }
    
    public String getTypeOriginal() {
        return this.typeOriginal;
    }
    
    public void setTypeOriginal(final String value) {
        this.typeOriginal = value;
    }
    
    public BigInteger getCardinality() {
        return this.cardinality;
    }
    
    public void setCardinality(final BigInteger value) {
        this.cardinality = value;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(final String value) {
        this.description = value;
    }
}
