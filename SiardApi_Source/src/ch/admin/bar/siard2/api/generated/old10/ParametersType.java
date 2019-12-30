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
@XmlType(name = "parametersType", namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd", propOrder = { "parameter" })
public class ParametersType
{
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/1.0/metadata.xsd", required = true)
    protected List<ParameterType> parameter;
    
    public List<ParameterType> getParameter() {
        if (this.parameter == null) {
            this.parameter = new ArrayList<ParameterType>();
        }
        return this.parameter;
    }
}
