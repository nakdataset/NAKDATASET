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
@XmlType(name = "fieldType", namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd", propOrder = { "name", "lobFolder", "fields", "mimeType", "description" })
public class FieldType
{
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd", required = true)
    protected String name;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    @XmlSchemaType(name = "anyURI")
    protected String lobFolder;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected FieldsType fields;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected String mimeType;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected String description;
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String value) {
        this.name = value;
    }
    
    public String getLobFolder() {
        return this.lobFolder;
    }
    
    public void setLobFolder(final String value) {
        this.lobFolder = value;
    }
    
    public FieldsType getFields() {
        return this.fields;
    }
    
    public void setFields(final FieldsType value) {
        this.fields = value;
    }
    
    public String getMimeType() {
        return this.mimeType;
    }
    
    public void setMimeType(final String value) {
        this.mimeType = value;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(final String value) {
        this.description = value;
    }
}
