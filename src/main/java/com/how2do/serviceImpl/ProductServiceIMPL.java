package com.how2do.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2do.dao.ProductDao;
import com.how2do.entity.Product;
import com.how2do.service.ProductService;

@Service
public class ProductServiceIMPL implements ProductService {
	
	@Autowired
	private ProductDao dao;

	@Override
	public int saveProduct(Product product) {
		
		int status = dao.saveProduct(product);
		
		return status;
	}

	@Override
	public Product getProductById(long productId) {
		
		return dao.getProductById(productId);
	}

}
