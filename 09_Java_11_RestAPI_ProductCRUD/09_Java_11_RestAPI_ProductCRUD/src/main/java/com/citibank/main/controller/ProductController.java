package com.citibank.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.citibank.main.dao.ProductDAO;
import com.citibank.main.pojo.Product;

@RestController
public class ProductController {

	@Autowired
	private ProductDAO productDAO;

	public ProductController() {
		System.out.println("ProductController object created");
	}

	@GetMapping(value = "product/controller/getDetails", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Product>> getProductDetails() {
		System.out.println("getProductDetails() called");
		List<Product> products = productDAO.findAll();
		return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
	}

	@GetMapping(value = "product/controller/getDetailsById/{productId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> getProductByProductId(@PathVariable int productId) {
		System.out.println("getProductByProductId() is called");
		Product product = productDAO.findOne(productId);
		if (product != null)
			return new ResponseEntity<Product>(product, HttpStatus.OK);
		else
			return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
	}

	@PostMapping(value = "product/controller/addProduct", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.TEXT_HTML_VALUE)
	public ResponseEntity<String> addProduct(@RequestBody Product product) {
		System.out.println("addProduct() called");
		int productId = productDAO.saveProduct(product);
		return new ResponseEntity<String>("Product added successfully with productId :: " + productId,
				HttpStatus.CREATED);
	}

	@PutMapping(value = "product/controller/updateProduct", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> updateProduct(@RequestBody Product product) {
		System.out.println("updateProduct() called");
		if (productDAO.findOne(product.getId()) == null) {
			Product product2 = null;
			return new ResponseEntity<Product>(product2, HttpStatus.INTERNAL_SERVER_ERROR);
		} else {
			Product updatedProduct = productDAO.updateProduct(product);
			return new ResponseEntity<Product>(updatedProduct, HttpStatus.OK);
			
			
		}
	}

	@DeleteMapping(value = "product/controller/deleteProduct/{productId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> deleteProduct(@PathVariable int productId) {
		System.out.println("deleteProduct() called");
		Product product2 = productDAO.findOne(productId);
		if (product2 == null) {
			return new ResponseEntity<Product>(product2, HttpStatus.INTERNAL_SERVER_ERROR);
		} else {
			productDAO.deleteProduct(productId);
			return new ResponseEntity<Product>(product2, HttpStatus.OK);
		}
	}
}
