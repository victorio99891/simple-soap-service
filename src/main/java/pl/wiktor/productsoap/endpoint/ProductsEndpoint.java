package pl.wiktor.productsoap.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import pl.wiktor.productsoap.exceptions.ProductNotFoundException;
import pl.wiktor.productsoap.model.ProductBO;
import pl.wiktor.productsoap.service.ProductService;
import pl.wiktor.productsoap.transformer.ProductTransformer;
import pl.wiktor.wsdl.products.GetSingleProductRequest;
import pl.wiktor.wsdl.products.GetSingleProductResponse;

@Endpoint
public class ProductsEndpoint {

	private ProductService service;

	@Autowired
	public ProductsEndpoint(ProductService service) {
		this.service = service;
	}

	@PayloadRoot(namespace = "http://www.wiktor.pl/wsdl/products", localPart = "getSingleProductRequest")
	@ResponsePayload
	public GetSingleProductResponse getSingleProductResponse(@RequestPayload GetSingleProductRequest request)
			throws ProductNotFoundException {
		GetSingleProductResponse response = new GetSingleProductResponse();

		ProductBO productBO = service.getProductById(request.getId());

		if (productBO == null) {
			throw new ProductNotFoundException(request);
		}

		response.setProduct(ProductTransformer.fromModelToSoap(productBO));
		return response;
	}
}
