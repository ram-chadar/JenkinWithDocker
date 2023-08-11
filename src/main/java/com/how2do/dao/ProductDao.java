package com.how2do.dao;

import com.how2do.entity.Product;

public interface ProductDao {
	public int saveProduct(Product product);
	public Product getProductById(long productId);
}
