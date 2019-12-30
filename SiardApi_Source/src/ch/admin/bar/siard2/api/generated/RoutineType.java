// 
// Decompiled by Procyon v0.5.36
// 

package ch.admin.bar.siard2.api.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "routineType", namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd", propOrder = { "specificName", "name", "description", "source", "body", "characteristic", "returnType", "parameters" })
public class RoutineType
{
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd", required = true)
    protected String specificName;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd", required = true)
    protected String name;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected String description;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected String source;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected String body;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected String characteristic;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected String returnType;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected ParametersType parameters;
    
    public String getSpecificName() {
        return this.specificName;
    }
    
    public void setSpecificName(final String value) {
        this.specificName = value;
    }
    
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
    
    public String getSource() {
        return this.source;
    }
    
    public void setSource(final String value) {
        this.source = value;
    }
    
    public String getBody() {
        return this.body;
    }
    
    public void setBody(final String value) {
        this.body = value;
    }
    
    public String getCharacteristic() {
        return this.characteristic;
    }
    
    public void setCharacteristic(final String value) {
        this.characteristic = value;
    }
    
    public String getReturnType() {
        return this.returnType;
    }
    
    public void setReturnType(final String value) {
        this.returnType = value;
    }
    
    public ParametersType getParameters() {
        return this.parameters;
    }
    
    public void setParameters(final ParametersType value) {
        this.parameters = value;
    }
}
