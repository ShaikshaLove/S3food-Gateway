package io.s3soft.proxyapp.model.wrapper;

import java.util.List;

import io.s3soft.proxyapp.model.Product;

public class ProductList {
	private List<Product> products;

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
