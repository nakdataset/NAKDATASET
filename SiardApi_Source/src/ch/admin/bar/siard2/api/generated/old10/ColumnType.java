// 
// Decompiled by Procyon v0.5.36
// 

package ch.admin.bar.siard2.api.generated.old10;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "columnType", namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd", propOrder = { "name", "folder", "type", "typeOriginal", "defaultValue", "nullable", "description" })
public class ColumnType
{
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd", required = true)
    protected String name;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd")
    protected String folder;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd", required = true)
    protected String type;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd")
    protected String typeOriginal;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd")
    protected String defaultValue;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd")
    protected boolean nullable;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd")
    protected String description;
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String value) {
        this.name = value;
    }
    
    public String getFolder() {
        return this.folder;
    }
    
    public void setFolder(final String value) {
        this.folder = value;
    }
    
    public String getType() {
        return this.type;
    }
    
    public void setType(final String value) {
        this.type = value;
    }
    
    public String getTypeOriginal() {
        return this.typeOriginal;
    }
    
    public void setTypeOriginal(final String value) {
        this.typeOriginal = value;
    }
    
    public String getDefaultValue() {
        return this.defaultValue;
    }
    
    public void setDefaultValue(final String value) {
        this.defaultValue = value;
    }
    
    public boolean isNullable() {
        return this.nullable;
    }
    
    public void setNullable(final boolean value) {
        this.nullable = value;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(final String value) {
        this.description = value;
    }
}
