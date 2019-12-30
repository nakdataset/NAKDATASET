// 
// Decompiled by Procyon v0.5.36
// 

package ch.admin.bar.siard2.api.generated.old10;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "viewType", namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd", propOrder = { "name", "query", "queryOriginal", "description", "columns" })
public class ViewType
{
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd", required = true)
    protected String name;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd")
    protected String query;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd")
    protected String queryOriginal;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd")
    protected String description;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd", required = true)
    protected ColumnsType columns;
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String value) {
        this.name = value;
    }
    
    public String getQuery() {
        return this.query;
    }
    
    public void setQuery(final String value) {
        this.query = value;
    }
    
    public String getQueryOriginal() {
        return this.queryOriginal;
    }
    
    public void setQueryOriginal(final String value) {
        this.queryOriginal = value;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(final String value) {
        this.description = value;
    }
    
    public ColumnsType getColumns() {
        return this.columns;
    }
    
    public void setColumns(final ColumnsType value) {
        this.columns = value;
    }
}
