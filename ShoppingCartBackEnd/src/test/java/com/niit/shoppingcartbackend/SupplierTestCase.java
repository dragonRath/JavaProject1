package com.niit.shoppingcartbackend;

	import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

	import com.niit.shoppingcartbackend.dao.SupplierDAO;

import com.niit.shoppingcartbackend.model.Supplier;

	public class SupplierTestCase {
		@Autowired
		static AnnotationConfigApplicationContext context;

		@Autowired
		static Supplier supplier;

		@Autowired
		static SupplierDAO supplierDAO;

		

		@BeforeClass
		public static void init()
		{
	    context  = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcartbackend");
		context.refresh();
		supplierDAO  = (SupplierDAO) context.getBean("supplierDAO");
		supplier =(Supplier) context.getBean("supplier");
		System.out.println("the objects are created");
		}
		@Test
		public void createSupplierTestCase()
		{
			supplier.setId("S001");
			supplier.setName("Big Bazzar");
			supplier.setAddress("BBSR");
		
		Boolean status=supplierDAO.save(supplier);
		Assert.assertEquals("createSupplierTestCase",true,status);
		}
		@Test
		public void deleteSupplierTestCase()
		{
			supplier.setId("S001");
			supplier.setName("Big Bazzar");
			supplier.setAddress("BBSR");
		
		Boolean status=supplierDAO.delete(supplier);
		Assert.assertEquals("createSupplierTestCase",true,status);
		}
		@Test
		public void updateSupplierTestCase()
		{
			supplier.setId("SOO1");
			supplier.setName("Bigmart");
			supplier.setAddress("BBSR");
		
		Boolean status=supplierDAO.update(supplier);
		Assert.assertEquals("createSupplierTestCase",true,status);
		}
		
		


	}




