package com.citibank.main;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import com.citibank.main.pojo.Product;
import com.citibank.util.JSONUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;

import java.net.http.HttpClient.Version;

public class ProductHTTPClientMain {
	private static final HttpClient client = HttpClient.newBuilder().version(Version.HTTP_2).build();
	private static final String serverURL = "http://localhost:8080/product/controller/";

	public static void main(String[] args) {
		// sending request 1
		 getAllProducts();

		// sending request 2
		// addProduct();

		// sending request 3
		// getProductDetailsByProductId();

		// sending request 4
		// updateProduct();
		
		// sending request 5
		// deleteProduct();

	}

	public static void deleteProduct() {
		try {
			HttpRequest request = HttpRequest.newBuilder(URI.create(serverURL + "deleteProduct/102")).DELETE().build();
			CompletableFuture<HttpResponse<String>> response = client.sendAsync(request,
					HttpResponse.BodyHandlers.ofString());

			if (response.get().statusCode() == 500) {
				System.out.println("Product Not Available");
			} else {
				Product product = JSONUtils.convertFromJsonToObject(response.get().body(), Product.class);
				System.out.println(product);
			}
		} catch (InterruptedException | ExecutionException | JsonProcessingException e) {
			System.out.println("Exception");
			System.out.println(e.getMessage());
		}

	}

	public static void updateProduct() {

		try {
			Product product = new Product(102, "Hash Wash", "Herbal Product", 200);
			String productJSON = JSONUtils.convertFromObjectToJson(product);
			HttpRequest request = HttpRequest.newBuilder(URI.create(serverURL + "updateProduct"))
					.header("Content-Type", "application/json").PUT(HttpRequest.BodyPublishers.ofString(productJSON))
					.build();
			CompletableFuture<HttpResponse<String>> response = client.sendAsync(request,
					HttpResponse.BodyHandlers.ofString());

			if (response.get().statusCode() == 500) {
				System.out.println("Product Not Available");
			} else {
				product = JSONUtils.convertFromJsonToObject(response.get().body(), Product.class);
				System.out.println(product);
			}

		} catch (JsonProcessingException | InterruptedException | ExecutionException e) {
			System.out.println("Exception");
			System.out.println(e.getMessage());
		}
	}

	public static void getProductDetailsByProductId() {

		try {
			HttpRequest request = HttpRequest.newBuilder(URI.create(serverURL + "getDetailsById/102")).GET().build();
			CompletableFuture<HttpResponse<String>> response = client.sendAsync(request, BodyHandlers.ofString());

			if (response.get().statusCode() == 500) {
				System.out.println("Product Not Available");
			} else {
				Product product = JSONUtils.convertFromJsonToObject(response.get().body(), Product.class);
				System.out.println(product);
			}
		} catch (JsonProcessingException | InterruptedException | ExecutionException e) {
			System.out.println("Exception");
			System.out.println(e.getMessage());
		}
	}

	public static void addProduct() {
		try {
			System.out.println("In addProduct()");
			Product product = new Product(103, "Product 3", "New Product Description", 100);
			String productJSON = JSONUtils.convertFromObjectToJson(product);

			HttpRequest request = HttpRequest.newBuilder(URI.create(serverURL + "addProduct"))
					.header("Content-Type", "application/json").POST(HttpRequest.BodyPublishers.ofString(productJSON))
					.build();

			CompletableFuture<HttpResponse<String>> response = client.sendAsync(request,
					HttpResponse.BodyHandlers.ofString());

			System.out.println(response.get().body());

		} catch (JsonProcessingException | InterruptedException | ExecutionException e) {
			System.out.println("Exception");
			System.out.println(e.getMessage());
		}
	}

	public static void getAllProducts() {
		try {
			System.out.println("In getAllProducts()");
			HttpRequest request = HttpRequest.newBuilder(URI.create(serverURL + "getDetails")).GET().build();
			CompletableFuture<HttpResponse<String>> response = client.sendAsync(request, BodyHandlers.ofString());

			List<Product> products = JSONUtils.convertFromJsonToList(response.get().body(),
					new TypeReference<List<Product>>() {
					});
			for (Product product : products) {
				System.out.println(product);
			}
		} catch (JsonProcessingException | InterruptedException | ExecutionException e) {
			System.out.println("Exception");
			System.out.println(e.getMessage());
		}
	}

}
