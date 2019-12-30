// 
// Decompiled by Procyon v0.5.36
// 

package ch.admin.bar.siard2.api.generated.old10;

import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "privilegeType", namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd", propOrder = { "type", "object", "grantor", "grantee", "option", "description" })
public class PrivilegeType
{
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd", required = true)
    protected String type;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd")
    protected String object;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd", required = true)
    protected String grantor;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd", required = true)
    protected String grantee;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd")
    @XmlSchemaType(name = "string")
    protected PrivOptionType option;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd")
    protected String description;
    
    public String getType() {
        return this.type;
    }
    
    public void setType(final String value) {
        this.type = value;
    }
    
    public String getObject() {
        return this.object;
    }
    
    public void setObject(final String value) {
        this.object = value;
    }
    
    public String getGrantor() {
        return this.grantor;
    }
    
    public void setGrantor(final String value) {
        this.grantor = value;
    }
    
    public String getGrantee() {
        return this.grantee;
    }
    
    public void setGrantee(final String value) {
        this.grantee = value;
    }
    
    public PrivOptionType getOption() {
        return this.option;
    }
    
    public void setOption(final PrivOptionType value) {
        this.option = value;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(final String value) {
        this.description = value;
    }
}
