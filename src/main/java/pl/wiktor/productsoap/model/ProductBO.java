package pl.wiktor.productsoap.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProductBO {

	private int id;
	private String name;
	private double price;

	public ProductBO() {
	}

	public ProductBO(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

}
