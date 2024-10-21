//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.3.2 ���ɵ�
// ����� <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2024.10.21 ʱ�� 04:53:56 PM CST 
//


package nz.ac.massey.cs.sdc.parsers;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RssChannel", propOrder = {
    "titleOrLinkOrDescription",
    "item",
    "any"
})
public class RssChannel {

    @XmlElementRefs({
        @XmlElementRef(name = "title", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "link", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "description", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "language", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "copyright", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "managingEditor", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "webMaster", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pubDate", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "lastBuildDate", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "category", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "generator", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "docs", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cloud", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ttl", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "image", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rating", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "textInput", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "skipHours", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "skipDays", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> titleOrLinkOrDescription;
    @XmlElement(required = true)
    protected List<RssItem> item;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the titleOrLinkOrDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titleOrLinkOrDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitleOrLinkOrDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Category }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Cloud }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link Image }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link TextInput }{@code >}
     * {@link JAXBElement }{@code <}{@link SkipHoursList }{@code >}
     * {@link JAXBElement }{@code <}{@link SkipDaysList }{@code >}
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getTitleOrLinkOrDescription() {
        if (titleOrLinkOrDescription == null) {
            titleOrLinkOrDescription = new ArrayList<Object>();
        }
        return this.titleOrLinkOrDescription;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RssItem }
     * 
     * 
     */
    public List<RssItem> getItem() {
        if (item == null) {
            item = new ArrayList<RssItem>();
        }
        return this.item;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
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
