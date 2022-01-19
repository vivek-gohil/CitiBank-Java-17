package com.citibank.main.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.citibank.main.pojo.Product;

@Repository
public class ProductDAO {
	private static List<Product> products = new ArrayList<Product>();

	public ProductDAO() {
		Product product = new Product(101, "Product 1", "Sample Product", 10);
		products.add(product);
	}

	public int saveProduct(Product product) {
		products.add(product);
		return product.getId();
	}

	public Product updateProduct(Product product) {
		for (Product p : products) {
			if (p.getId() == product.getId()) {
				p.setName(product.getName());
				p.setDescription(product.getDescription());
				p.setPrice(product.getPrice());
				return p;
			}
		}
		return null;
	}

	public void deleteProduct(int productId) {
		Iterator<Product> iterator = products.iterator();

		while (iterator.hasNext()) {
			Product product = iterator.next();
			if (product.getId() == productId) {
				iterator.remove();
			}
		}
	}

	public List<Product> findAll() {
		return products;
	}

	public Product findOne(int productId) {
		for (Product p : products) {
			if (p.getId() == productId) {
				return p;
			}
		}
		return null;
	}
}
