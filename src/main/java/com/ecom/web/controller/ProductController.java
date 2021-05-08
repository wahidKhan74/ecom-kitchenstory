package com.ecom.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.web.entity.Product;
import com.ecom.web.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productservice;

	// Get all products

	@GetMapping("/products")
	public List<Product> getAllProducts() {
		return productservice.geAllMyProducts();

	}

	// Add a Product
	@PostMapping("/products")
	public Product addProduct(@RequestBody Product product) {
		return productservice.addMyProduct(product);
	}

	// Find Products by Category Name
	@GetMapping("/products/{cusine}")
	public List<Product> getAllProductsByCusine(@PathVariable String cusine) {
		return productservice.getProductbyMyCusine(cusine);
	}

	// Update a Product
	@PutMapping("/updateproduct")
	public Product updateProduct(@RequestBody Product product) {
		return productservice.updateMyProduct(product);
	}

	// Delete a Product by Id
	@DeleteMapping("/deleteproduct/{p_id}")
	public String deleteProductById(@PathVariable("p_id") long prodid) {
		return productservice.deleteMyProductById(prodid);
	}
}
