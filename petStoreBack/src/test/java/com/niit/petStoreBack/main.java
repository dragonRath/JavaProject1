package com.niit.petStoreBack;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.ProductDAO;
import com.niit.model.Product;

public class main {
	public static void main (String args[]) {
		System.out.println("Before");

		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		ProductDAO dao = (ProductDAO)context.getBean(ProductDAO.class);

		Product bean1 = new Product();
		bean1.setName("Pillow");
		bean1.setBrand("Aerocom");
		bean1.setCategory("Matress");
		dao.insert(bean1);
		Product bean2 = new Product();
		bean2.setName("Blanket");
		bean2.setBrand("Peris");
		bean2.setCategory("Matressgr");
		dao.insert(bean2);

		Product bean3 = new Product();
		bean3.setName("windowcover");
		bean3.setBrand("vanhuisen");
		bean3.setCategory("nasil");
		dao.insert(bean3);
		context.close();


	}

}

