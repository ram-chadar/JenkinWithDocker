package com.how2do.daoIMPL;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.how2do.dao.ProductDao;
import com.how2do.entity.Product;

@Repository
public class ProductDaoIMPL implements ProductDao {

	@Autowired
	private SessionFactory factory;

	@Override
	public int saveProduct(Product product) {
		int status = 0;
		try (Session session = factory.openSession();) {

			if (getProductById(product.getProductId()) == null) {
				session.save(product);
				session.beginTransaction().commit();
				status = 1;
			} else {
				status = 3;
			}
		}

		catch (Exception e) {
			status = 2;
			e.printStackTrace();
		}

		return status;
	}

	@Override
	public Product getProductById(long productId) {
		Product product = null;
		try (Session session = factory.openSession();) {

			product = session.get(Product.class, productId);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return product;
	}

}
