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
@XmlType(name = "usersType", namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd", propOrder = { "user" })
public class UsersType
{
    @XmlElement(namespace = "http://www.bar.admin.ch/xmlns/siard/2/metadata.xsd")
    protected List<UserType> user;
    
    public List<UserType> getUser() {
        if (this.user == null) {
            this.user = new ArrayList<UserType>();
        }
        return this.user;
    }
}
