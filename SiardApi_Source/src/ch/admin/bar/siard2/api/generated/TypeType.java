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
@XmlType(name = "typeType", namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd", propOrder = { "name", "category", "underSchema", "underType", "instantiable", "_final", "base", "attributes", "description" })
public class TypeType
{
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd", required = true)
    protected String name;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd", required = true)
    @XmlSchemaType(name = "string")
    protected CategoryType category;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected String underSchema;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected String underType;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected boolean instantiable;
    @XmlElement(name = "final", namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected boolean _final;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected String base;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected AttributesType attributes;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected String description;
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String value) {
        this.name = value;
    }
    
    public CategoryType getCategory() {
        return this.category;
    }
    
    public void setCategory(final CategoryType value) {
        this.category = value;
    }
    
    public String getUnderSchema() {
        return this.underSchema;
    }
    
    public void setUnderSchema(final String value) {
        this.underSchema = value;
    }
    
    public String getUnderType() {
        return this.underType;
    }
    
    public void setUnderType(final String value) {
        this.underType = value;
    }
    
    public boolean isInstantiable() {
        return this.instantiable;
    }
    
    public void setInstantiable(final boolean value) {
        this.instantiable = value;
    }
    
    public boolean isFinal() {
        return this._final;
    }
    
    public void setFinal(final boolean value) {
        this._final = value;
    }
    
    public String getBase() {
        return this.base;
    }
    
    public void setBase(final String value) {
        this.base = value;
    }
    
    public AttributesType getAttributes() {
        return this.attributes;
    }
    
    public void setAttributes(final AttributesType value) {
        this.attributes = value;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(final String value) {
        this.description = value;
    }
}
