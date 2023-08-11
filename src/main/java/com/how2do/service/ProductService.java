package com.how2do.service;

import com.how2do.entity.Product;

public interface ProductService {
	
	public int saveProduct(Product product);
	public Product getProductById(long productId);
	

}
