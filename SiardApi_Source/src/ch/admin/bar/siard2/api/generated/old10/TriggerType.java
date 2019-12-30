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
@XmlType(name = "triggerType", namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd", propOrder = { "name", "actionTime", "triggerEvent", "aliasList", "triggeredAction", "description" })
public class TriggerType
{
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd", required = true)
    protected String name;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd", required = true)
    @XmlSchemaType(name = "string")
    protected ActionTimeType actionTime;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd", required = true)
    protected String triggerEvent;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd")
    protected String aliasList;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd", required = true)
    protected String triggeredAction;
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd")
    protected String description;
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String value) {
        this.name = value;
    }
    
    public ActionTimeType getActionTime() {
        return this.actionTime;
    }
    
    public void setActionTime(final ActionTimeType value) {
        this.actionTime = value;
    }
    
    public String getTriggerEvent() {
        return this.triggerEvent;
    }
    
    public void setTriggerEvent(final String value) {
        this.triggerEvent = value;
    }
    
    public String getAliasList() {
        return this.aliasList;
    }
    
    public void setAliasList(final String value) {
        this.aliasList = value;
    }
    
    public String getTriggeredAction() {
        return this.triggeredAction;
    }
    
    public void setTriggeredAction(final String value) {
        this.triggeredAction = value;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(final String value) {
        this.description = value;
    }
}
