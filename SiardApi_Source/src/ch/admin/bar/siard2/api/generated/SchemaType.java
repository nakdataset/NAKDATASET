// 
// Decompiled by Procyon v0.5.36
// 

package ch.admin.bar.siard2.api.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "schemaType", namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd", propOrder = { "name", "folder", "description", "types", "tables", "views", "routines" })
public class SchemaType
{
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd", required = true)
    protected String name;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd", required = true)
    protected String folder;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected String description;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected TypesType types;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected TablesType tables;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected ViewsType views;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected RoutinesType routines;
    
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
    
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(final String value) {
        this.description = value;
    }
    
    public TypesType getTypes() {
        return this.types;
    }
    
    public void setTypes(final TypesType value) {
        this.types = value;
    }
    
    public TablesType getTables() {
        return this.tables;
    }
    
    public void setTables(final TablesType value) {
        this.tables = value;
    }
    
    public ViewsType getViews() {
        return this.views;
    }
    
    public void setViews(final ViewsType value) {
        this.views = value;
    }
    
    public RoutinesType getRoutines() {
        return this.routines;
    }
    
    public void setRoutines(final RoutinesType value) {
        this.routines = value;
    }
}
