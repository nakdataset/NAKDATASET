// 
// Decompiled by Procyon v0.5.36
// 

package ch.admin.bar.siard2.api.generated.old10;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlSchemaType;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "foreignKeyType", namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd", propOrder = { "name", "referencedSchema", "referencedTable", "reference", "matchType", "deleteAction", "updateAction", "description" })
public class ForeignKeyType
{
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd", required = true)
    protected String name;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd", required = true)
    protected String referencedSchema;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd", required = true)
    protected String referencedTable;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd", required = true)
    protected List<ReferenceType> reference;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd")
    @XmlSchemaType(name = "string")
    protected MatchTypeType matchType;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd")
    protected String deleteAction;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd")
    protected String updateAction;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd")
    protected String description;
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String value) {
        this.name = value;
    }
    
    public String getReferencedSchema() {
        return this.referencedSchema;
    }
    
    public void setReferencedSchema(final String value) {
        this.referencedSchema = value;
    }
    
    public String getReferencedTable() {
        return this.referencedTable;
    }
    
    public void setReferencedTable(final String value) {
        this.referencedTable = value;
    }
    
    public List<ReferenceType> getReference() {
        if (this.reference == null) {
            this.reference = new ArrayList<ReferenceType>();
        }
        return this.reference;
    }
    
    public MatchTypeType getMatchType() {
        return this.matchType;
    }
    
    public void setMatchType(final MatchTypeType value) {
        this.matchType = value;
    }
    
    public String getDeleteAction() {
        return this.deleteAction;
    }
    
    public void setDeleteAction(final String value) {
        this.deleteAction = value;
    }
    
    public String getUpdateAction() {
        return this.updateAction;
    }
    
    public void setUpdateAction(final String value) {
        this.updateAction = value;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(final String value) {
        this.description = value;
    }
}
