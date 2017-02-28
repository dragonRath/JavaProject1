package com.niit.shoppingcartbackend;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcartbackend.dao.ProductDAO;
import com.niit.shoppingcartbackend.model.Product;

public class ProductTestCase {
	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static Product product;

	@Autowired
	static ProductDAO productDAO;

	

	@BeforeClass
	public static void init()
	{
    context  = new AnnotationConfigApplicationContext();
	context.scan("com.niit.shoppingcartbackend");
	context.refresh();
	productDAO  = (ProductDAO) context.getBean("productDAO");
	product =(Product) context.getBean("product");
	System.out.println("the objects are created");
	}
	@Test
	public void createProductTestCase()
	{
	product.setId("P005");
	product.setName("handbag");
	product.setPrice("4000");
	product.setCategory_id("C001");
    product.setSupplier_id("SOO1");
	Boolean status=productDAO.save(product);
	Assert.assertEquals("createProductTestCase",true,status);
	}
	@Test
	public void deleteProductTestCase()
	{
	product.setId("P002");
	product.setName("dress");
	product.setPrice("3000");
	product.setCategory_id("C001");
    product.setSupplier_id("SOO1");
	Boolean status=productDAO.delete(product);
	Assert.assertEquals("deleteProductTestCase",true,status);
	}
	@Test
	public void updateProductTestCase()
	{
	product.setId("P001");
	product.setName("bag");
	product.setPrice("3000");
	product.setCategory_id("C001");
    product.setSupplier_id("SOO1");
	Boolean status=productDAO.update(product);
	Assert.assertEquals("updateProductTestCase",true,status);
	}
	
	
	
}

