// 
// Decompiled by Procyon v0.5.36
// 

package ch.admin.bar.siard2.api.generated.old10;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tableType", namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd", propOrder = { "name", "folder", "description", "columns", "primaryKey", "foreignKeys", "candidateKeys", "checkConstraints", "triggers", "rows" })
public class TableType
{
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd", required = true)
    protected String name;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd", required = true)
    protected String folder;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd")
    protected String description;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd", required = true)
    protected ColumnsType columns;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd")
    protected PrimaryKeyType primaryKey;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd")
    protected ForeignKeysType foreignKeys;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd")
    protected CandidateKeysType candidateKeys;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd")
    protected CheckConstraintsType checkConstraints;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd")
    protected TriggersType triggers;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd", required = true)
    protected BigInteger rows;
    
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
    
    public ColumnsType getColumns() {
        return this.columns;
    }
    
    public void setColumns(final ColumnsType value) {
        this.columns = value;
    }
    
    public PrimaryKeyType getPrimaryKey() {
        return this.primaryKey;
    }
    
    public void setPrimaryKey(final PrimaryKeyType value) {
        this.primaryKey = value;
    }
    
    public ForeignKeysType getForeignKeys() {
        return this.foreignKeys;
    }
    
    public void setForeignKeys(final ForeignKeysType value) {
        this.foreignKeys = value;
    }
    
    public CandidateKeysType getCandidateKeys() {
        return this.candidateKeys;
    }
    
    public void setCandidateKeys(final CandidateKeysType value) {
        this.candidateKeys = value;
    }
    
    public CheckConstraintsType getCheckConstraints() {
        return this.checkConstraints;
    }
    
    public void setCheckConstraints(final CheckConstraintsType value) {
        this.checkConstraints = value;
    }
    
    public TriggersType getTriggers() {
        return this.triggers;
    }
    
    public void setTriggers(final TriggersType value) {
        this.triggers = value;
    }
    
    public BigInteger getRows() {
        return this.rows;
    }
    
    public void setRows(final BigInteger value) {
        this.rows = value;
    }
}
