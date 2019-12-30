// 
// Decompiled by Procyon v0.5.36
// 

package ch.admin.bar.siard2.api.generated;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAttribute;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "dbname", "description", "archiver", "archiverContact", "dataOwner", "dataOriginTimespan", "lobFolder", "producerApplication", "archivalDate", "messageDigest", "clientMachine", "databaseProduct", "connection", "databaseUser", "schemas", "users", "roles", "privileges" })
@XmlRootElement(name = "siardArchive", namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
public class SiardArchive
{
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd", required = true)
    protected String dbname;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected String description;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected String archiver;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected String archiverContact;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd", required = true)
    protected String dataOwner;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd", required = true)
    protected String dataOriginTimespan;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    @XmlSchemaType(name = "anyURI")
    protected String lobFolder;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected String producerApplication;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar archivalDate;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected List<MessageDigestType> messageDigest;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected String clientMachine;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected String databaseProduct;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected String connection;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected String databaseUser;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd", required = true)
    protected SchemasType schemas;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd", required = true)
    protected UsersType users;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected RolesType roles;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected PrivilegesType privileges;
    @XmlAttribute(name = "version", required = true)
    protected String version;
    
    public String getDbname() {
        return this.dbname;
    }
    
    public void setDbname(final String value) {
        this.dbname = value;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(final String value) {
        this.description = value;
    }
    
    public String getArchiver() {
        return this.archiver;
    }
    
    public void setArchiver(final String value) {
        this.archiver = value;
    }
    
    public String getArchiverContact() {
        return this.archiverContact;
    }
    
    public void setArchiverContact(final String value) {
        this.archiverContact = value;
    }
    
    public String getDataOwner() {
        return this.dataOwner;
    }
    
    public void setDataOwner(final String value) {
        this.dataOwner = value;
    }
    
    public String getDataOriginTimespan() {
        return this.dataOriginTimespan;
    }
    
    public void setDataOriginTimespan(final String value) {
        this.dataOriginTimespan = value;
    }
    
    public String getLobFolder() {
        return this.lobFolder;
    }
    
    public void setLobFolder(final String value) {
        this.lobFolder = value;
    }
    
    public String getProducerApplication() {
        return this.producerApplication;
    }
    
    public void setProducerApplication(final String value) {
        this.producerApplication = value;
    }
    
    public XMLGregorianCalendar getArchivalDate() {
        return this.archivalDate;
    }
    
    public void setArchivalDate(final XMLGregorianCalendar value) {
        this.archivalDate = value;
    }
    
    public List<MessageDigestType> getMessageDigest() {
        if (this.messageDigest == null) {
            this.messageDigest = new ArrayList<MessageDigestType>();
        }
        return this.messageDigest;
    }
    
    public String getClientMachine() {
        return this.clientMachine;
    }
    
    public void setClientMachine(final String value) {
        this.clientMachine = value;
    }
    
    public String getDatabaseProduct() {
        return this.databaseProduct;
    }
    
    public void setDatabaseProduct(final String value) {
        this.databaseProduct = value;
    }
    
    public String getConnection() {
        return this.connection;
    }
    
    public void setConnection(final String value) {
        this.connection = value;
    }
    
    public String getDatabaseUser() {
        return this.databaseUser;
    }
    
    public void setDatabaseUser(final String value) {
        this.databaseUser = value;
    }
    
    public SchemasType getSchemas() {
        return this.schemas;
    }
    
    public void setSchemas(final SchemasType value) {
        this.schemas = value;
    }
    
    public UsersType getUsers() {
        return this.users;
    }
    
    public void setUsers(final UsersType value) {
        this.users = value;
    }
    
    public RolesType getRoles() {
        return this.roles;
    }
    
    public void setRoles(final RolesType value) {
        this.roles = value;
    }
    
    public PrivilegesType getPrivileges() {
        return this.privileges;
    }
    
    public void setPrivileges(final PrivilegesType value) {
        this.privileges = value;
    }
    
    public String getVersion() {
        return this.version;
    }
    
    public void setVersion(final String value) {
        this.version = value;
    }
}
