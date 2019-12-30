// 
// Decompiled by Procyon v0.5.36
// 

package ch.admin.bar.siard2.api.generated.table;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAnyElement;
import java.util.List;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recordType", namespace = "http://www.bar.admin.ch/xmlns/siard/2/table.xsd", propOrder = { "any" })
public class RecordType
{
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    
    public List<Object> getAny() {
        if (this.any == null) {
            this.any = new ArrayList<Object>();
        }
        return this.any;
    }
}
