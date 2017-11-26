
package mobiCRUD.WS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mobiCRUD.WS package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EditaUsuarios_QNAME = new QName("http://WS.mobiSCD/", "editaUsuarios");
    private final static QName _EditaUsuariosResponse_QNAME = new QName("http://WS.mobiSCD/", "editaUsuariosResponse");
    private final static QName _BuscaUsuariosResponse_QNAME = new QName("http://WS.mobiSCD/", "buscaUsuariosResponse");
    private final static QName _BuscaUsuarios_QNAME = new QName("http://WS.mobiSCD/", "buscaUsuarios");
    private final static QName _AdicionaUsuarios_QNAME = new QName("http://WS.mobiSCD/", "adicionaUsuarios");
    private final static QName _RemoveUsuarios_QNAME = new QName("http://WS.mobiSCD/", "removeUsuarios");
    private final static QName _RemoveUsuariosResponse_QNAME = new QName("http://WS.mobiSCD/", "removeUsuariosResponse");
    private final static QName _AdicionaUsuariosResponse_QNAME = new QName("http://WS.mobiSCD/", "adicionaUsuariosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mobiCRUD.WS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EditaUsuarios }
     * 
     */
    public EditaUsuarios createEditaUsuarios() {
        return new EditaUsuarios();
    }

    /**
     * Create an instance of {@link EditaUsuariosResponse }
     * 
     */
    public EditaUsuariosResponse createEditaUsuariosResponse() {
        return new EditaUsuariosResponse();
    }

    /**
     * Create an instance of {@link RemoveUsuarios }
     * 
     */
    public RemoveUsuarios createRemoveUsuarios() {
        return new RemoveUsuarios();
    }

    /**
     * Create an instance of {@link RemoveUsuariosResponse }
     * 
     */
    public RemoveUsuariosResponse createRemoveUsuariosResponse() {
        return new RemoveUsuariosResponse();
    }

    /**
     * Create an instance of {@link AdicionaUsuariosResponse }
     * 
     */
    public AdicionaUsuariosResponse createAdicionaUsuariosResponse() {
        return new AdicionaUsuariosResponse();
    }

    /**
     * Create an instance of {@link BuscaUsuariosResponse }
     * 
     */
    public BuscaUsuariosResponse createBuscaUsuariosResponse() {
        return new BuscaUsuariosResponse();
    }

    /**
     * Create an instance of {@link BuscaUsuarios }
     * 
     */
    public BuscaUsuarios createBuscaUsuarios() {
        return new BuscaUsuarios();
    }

    /**
     * Create an instance of {@link AdicionaUsuarios }
     * 
     */
    public AdicionaUsuarios createAdicionaUsuarios() {
        return new AdicionaUsuarios();
    }

    /**
     * Create an instance of {@link StringArray }
     * 
     */
    public StringArray createStringArray() {
        return new StringArray();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditaUsuarios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS.mobiSCD/", name = "editaUsuarios")
    public JAXBElement<EditaUsuarios> createEditaUsuarios(EditaUsuarios value) {
        return new JAXBElement<EditaUsuarios>(_EditaUsuarios_QNAME, EditaUsuarios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditaUsuariosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS.mobiSCD/", name = "editaUsuariosResponse")
    public JAXBElement<EditaUsuariosResponse> createEditaUsuariosResponse(EditaUsuariosResponse value) {
        return new JAXBElement<EditaUsuariosResponse>(_EditaUsuariosResponse_QNAME, EditaUsuariosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaUsuariosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS.mobiSCD/", name = "buscaUsuariosResponse")
    public JAXBElement<BuscaUsuariosResponse> createBuscaUsuariosResponse(BuscaUsuariosResponse value) {
        return new JAXBElement<BuscaUsuariosResponse>(_BuscaUsuariosResponse_QNAME, BuscaUsuariosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaUsuarios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS.mobiSCD/", name = "buscaUsuarios")
    public JAXBElement<BuscaUsuarios> createBuscaUsuarios(BuscaUsuarios value) {
        return new JAXBElement<BuscaUsuarios>(_BuscaUsuarios_QNAME, BuscaUsuarios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdicionaUsuarios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS.mobiSCD/", name = "adicionaUsuarios")
    public JAXBElement<AdicionaUsuarios> createAdicionaUsuarios(AdicionaUsuarios value) {
        return new JAXBElement<AdicionaUsuarios>(_AdicionaUsuarios_QNAME, AdicionaUsuarios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveUsuarios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS.mobiSCD/", name = "removeUsuarios")
    public JAXBElement<RemoveUsuarios> createRemoveUsuarios(RemoveUsuarios value) {
        return new JAXBElement<RemoveUsuarios>(_RemoveUsuarios_QNAME, RemoveUsuarios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveUsuariosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS.mobiSCD/", name = "removeUsuariosResponse")
    public JAXBElement<RemoveUsuariosResponse> createRemoveUsuariosResponse(RemoveUsuariosResponse value) {
        return new JAXBElement<RemoveUsuariosResponse>(_RemoveUsuariosResponse_QNAME, RemoveUsuariosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdicionaUsuariosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS.mobiSCD/", name = "adicionaUsuariosResponse")
    public JAXBElement<AdicionaUsuariosResponse> createAdicionaUsuariosResponse(AdicionaUsuariosResponse value) {
        return new JAXBElement<AdicionaUsuariosResponse>(_AdicionaUsuariosResponse_QNAME, AdicionaUsuariosResponse.class, null, value);
    }

}
