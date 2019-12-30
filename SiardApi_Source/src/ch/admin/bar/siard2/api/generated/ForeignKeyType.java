// 
// Decompiled by Procyon v0.5.36
// 

package ch.admin.bar.siard2.api.generated;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlSchemaType;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "foreignKeyType", namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd", propOrder = { "name", "referencedSchema", "referencedTable", "reference", "matchType", "deleteAction", "updateAction", "description" })
public class ForeignKeyType
{
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd", required = true)
    protected String name;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd", required = true)
    protected String referencedSchema;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd", required = true)
    protected String referencedTable;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd", required = true)
    protected List<ReferenceType> reference;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    @XmlSchemaType(name = "string")
    protected MatchTypeType matchType;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    @XmlSchemaType(name = "string")
    protected ReferentialActionType deleteAction;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    @XmlSchemaType(name = "string")
    protected ReferentialActionType updateAction;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
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
    
    public ReferentialActionType getDeleteAction() {
        return this.deleteAction;
    }
    
    public void setDeleteAction(final ReferentialActionType value) {
        this.deleteAction = value;
    }
    
    public ReferentialActionType getUpdateAction() {
        return this.updateAction;
    }
    
    public void setUpdateAction(final ReferentialActionType value) {
        this.updateAction = value;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(final String value) {
        this.description = value;
    }
}
