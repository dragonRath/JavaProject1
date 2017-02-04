package com.niit.dao;

import java.util.List;
import com.niit.model.Product;

public interface ProductDAO {

	public void insert(Product p);
	public void update(Product p);
	public	void delete(int id);
	public List<Product> getAll();				
		
	public Product getProduct(int id);


}