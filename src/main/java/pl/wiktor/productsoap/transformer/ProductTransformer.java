package pl.wiktor.productsoap.transformer;

import pl.wiktor.productsoap.model.ProductBO;
import pl.wiktor.wsdl.products.ProductSOAP;

public class ProductTransformer {

	public static ProductSOAP fromModelToSoap(ProductBO bo) {
		ProductSOAP soap = new ProductSOAP();
		soap.setId(bo.getId());
		soap.setName(bo.getName());
		soap.setPrice(bo.getPrice());
		return soap;
	}

	public static ProductBO fromSoapToModel(ProductSOAP soap) {
		ProductBO bo = new ProductBO();
		bo.setId(soap.getId());
		bo.setName(soap.getName());
		bo.setPrice(soap.getPrice());
		return bo;
	}

}
