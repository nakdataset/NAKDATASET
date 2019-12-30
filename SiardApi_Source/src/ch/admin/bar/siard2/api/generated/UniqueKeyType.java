// 
// Decompiled by Procyon v0.5.36
// 

package ch.admin.bar.siard2.api.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uniqueKeyType", namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd", propOrder = { "name", "description", "column" })
public class UniqueKeyType
{
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd", required = true)
    protected String name;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected String description;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd", required = true)
    protected List<String> column;
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String value) {
        this.name = value;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(final String value) {
        this.description = value;
    }
    
    public List<String> getColumn() {
        if (this.column == null) {
            this.column = new ArrayList<String>();
        }
        return this.column;
    }
}
