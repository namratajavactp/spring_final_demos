package training.web.spring;

import java.util.Iterator;
import java.util.List;
import java.io.Serializable;

public class ProductManager implements Serializable {

	private List<Product> products;

	public void setProducts(List<Product> products) {
		this.products = products;
		
		
	}

	public List<Product> getProducts() {
		return products;
	}
};