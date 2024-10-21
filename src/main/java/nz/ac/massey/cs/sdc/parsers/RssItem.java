//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.3.2 ���ɵ�
// ����� <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2024.10.21 ʱ�� 04:53:56 PM CST 
//


package nz.ac.massey.cs.sdc.parsers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RssItem", propOrder = {
    "titleOrDescriptionOrLink"
})
public class RssItem {

    @XmlElementRefs({
        @XmlElementRef(name = "title", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "description", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "link", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "author", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "category", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "comments", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "enclosure", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "guid", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pubDate", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "source", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> titleOrDescriptionOrLink;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the titleOrDescriptionOrLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titleOrDescriptionOrLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitleOrDescriptionOrLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Category }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Enclosure }{@code >}
     * {@link JAXBElement }{@code <}{@link Guid }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Source }{@code >}
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getTitleOrDescriptionOrLink() {
        if (titleOrDescriptionOrLink == null) {
            titleOrDescriptionOrLink = new ArrayList<Object>();
        }
        return this.titleOrDescriptionOrLink;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
