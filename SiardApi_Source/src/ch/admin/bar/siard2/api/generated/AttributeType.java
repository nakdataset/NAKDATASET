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
@XmlType(name = "attributeType", namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd", propOrder = { "name", "type", "typeSchema", "typeName", "typeOriginal", "nullable", "defaultValue", "cardinality", "description" })
public class AttributeType
{
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd", required = true)
    protected String name;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected String type;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected String typeSchema;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected String typeName;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected String typeOriginal;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected Boolean nullable;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected String defaultValue;
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
    
    public Boolean isNullable() {
        return this.nullable;
    }
    
    public void setNullable(final Boolean value) {
        this.nullable = value;
    }
    
    public String getDefaultValue() {
        return this.defaultValue;
    }
    
    public void setDefaultValue(final String value) {
        this.defaultValue = value;
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
