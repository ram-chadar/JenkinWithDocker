package com.how2do.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.how2do.entity.Product;
import com.how2do.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService service;

	@PostMapping("/save-product")
	public ResponseEntity<String> saveProduct(@RequestBody Product product) {

		int status = service.saveProduct(product);

		if (status == 1) {
			return ResponseEntity.ok("Product Added !");
		} else if (status == 2) {
			return ResponseEntity.ok("Something Wrong !");
		} else {
			return ResponseEntity.ok("Product Already Exists");
		}

	}

	@GetMapping(value = "/get-product/{id}")
	public Product getProduct(@PathVariable long id) {
		return service.getProductById(id);
	}

}
