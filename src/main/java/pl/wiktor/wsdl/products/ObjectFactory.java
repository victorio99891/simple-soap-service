//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.18 at 05:12:07 PM CEST 
//


package pl.wiktor.wsdl.products;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pl.wiktor.wsdl.products package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.wiktor.wsdl.products
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSingleProductRequest }
     * 
     */
    public GetSingleProductRequest createGetSingleProductRequest() {
        return new GetSingleProductRequest();
    }

    /**
     * Create an instance of {@link GetSingleProductResponse }
     * 
     */
    public GetSingleProductResponse createGetSingleProductResponse() {
        return new GetSingleProductResponse();
    }

    /**
     * Create an instance of {@link ProductSOAP }
     * 
     */
    public ProductSOAP createProductSOAP() {
        return new ProductSOAP();
    }

    /**
     * Create an instance of {@link ServiceStatus }
     * 
     */
    public ServiceStatus createServiceStatus() {
        return new ServiceStatus();
    }

}
