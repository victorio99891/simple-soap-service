package pl.wiktor.productsoap.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import pl.wiktor.productsoap.model.ProductBO;

@Service
public class ProductService {

	public static HashMap<Integer, ProductBO> productsMap = new HashMap<Integer, ProductBO>();

	@PostConstruct
	public void initMockedData() {
		ProductBO product1 = new ProductBO(1, "Scissors", 12.39);
		ProductBO product2 = new ProductBO(2, "Blade", 9.99);
		ProductBO product3 = new ProductBO(3, "Knife", 5.50);
		productsMap.put(product1.getId(), product1);
		productsMap.put(product2.getId(), product2);
		productsMap.put(product3.getId(), product3);
	}

	public ProductBO getProductById(int id) {
		return productsMap.get(id);
	}

	public List<ProductBO> getAllProducts() {
		List<ProductBO> productList = new ArrayList<ProductBO>();
		productsMap.forEach((id, product) -> {
			productList.add(product);
		});
		return productList;
	}

}
