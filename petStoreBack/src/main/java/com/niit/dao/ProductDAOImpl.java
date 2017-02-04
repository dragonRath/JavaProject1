package com.niit.dao;

import java.util.ArrayList;
import java.util.List;



import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Product;

@Repository("productDAO")

public class ProductDAOImpl implements ProductDAO{


	@Autowired
	private SessionFactory sessionFactory;


	@Override
	@Transactional
	public List<Product> getAll() {				
		return sessionFactory.getCurrentSession().createQuery("FROM Product").list();
	}

	@Override
	@Transactional
	public void insert(Product p) {
		sessionFactory.getCurrentSession().persist(p);

	}

	@Override
	@Transactional
	public void update(Product p) {

		sessionFactory.getCurrentSession().update(p);

	}

	@Override
	@Transactional
	public void delete(int id) {

		sessionFactory.getCurrentSession().delete(getProduct(id));
	}


	@Override
	@Transactional
	public Product getProduct(int id) {
		return sessionFactory.getCurrentSession().get(Product.class, id);
	}

}

