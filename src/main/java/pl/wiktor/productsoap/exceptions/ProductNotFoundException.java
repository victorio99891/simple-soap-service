package pl.wiktor.productsoap.exceptions;

import org.springframework.http.HttpStatus;

import pl.wiktor.productsoap.config.ServiceFaultException;
import pl.wiktor.wsdl.products.GetSingleProductRequest;
import pl.wiktor.wsdl.products.ServiceStatus;

public class ProductNotFoundException extends ServiceFaultException {

	private static final long serialVersionUID = 1L;

	public ProductNotFoundException(GetSingleProductRequest request) {
		super(String.format("ProductNotFoundException: Product with id: %d has been not found.", request.getId()), new ServiceStatus(HttpStatus.NOT_FOUND.toString(),
				String.format("Product with id: %d has been not found.", request.getId())));
	}
}
