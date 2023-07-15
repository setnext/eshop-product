package com.setnext.eshop.products.entities;

import java.util.List;

public class ProductsArray {

	List<Product> products;

	public ProductsArray() {
	}


	public ProductsArray(List<Product> products) {
		super();
		this.products = products;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
