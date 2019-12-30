// 
// Decompiled by Procyon v0.5.36
// 

package ch.admin.bar.siard2.api.generated.old10;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "triggersType", namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd", propOrder = { "trigger" })
public class TriggersType
{
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd", required = true)
    protected List<TriggerType> trigger;
    
    public List<TriggerType> getTrigger() {
        if (this.trigger == null) {
            this.trigger = new ArrayList<TriggerType>();
        }
        return this.trigger;
    }
}
