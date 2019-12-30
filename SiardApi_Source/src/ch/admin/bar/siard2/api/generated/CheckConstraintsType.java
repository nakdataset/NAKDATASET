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
@XmlType(name = "checkConstraintsType", namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd", propOrder = { "checkConstraint" })
public class CheckConstraintsType
{
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd", required = true)
    protected List<CheckConstraintType> checkConstraint;
    
    public List<CheckConstraintType> getCheckConstraint() {
        if (this.checkConstraint == null) {
            this.checkConstraint = new ArrayList<CheckConstraintType>();
        }
        return this.checkConstraint;
    }
}
