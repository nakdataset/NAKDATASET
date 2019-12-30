// 
// Decompiled by Procyon v0.5.36
// 

package ch.admin.bar.siard2.api.generated;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fieldsType", namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd", propOrder = { "field" })
public class FieldsType
{
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd", required = true)
    protected List<FieldType> field;
    
    public List<FieldType> getField() {
        if (this.field == null) {
            this.field = new ArrayList<FieldType>();
        }
        return this.field;
    }
}
