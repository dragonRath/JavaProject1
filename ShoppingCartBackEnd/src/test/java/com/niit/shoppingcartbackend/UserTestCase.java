package com.niit.shoppingcartbackend;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



import com.niit.shoppingcartbackend.dao.UserDAO;
import com.niit.shoppingcartbackend.model.User;

public class UserTestCase {
	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static User user;

	@Autowired
	static UserDAO userDAO;
	@BeforeClass
	public static void init()
	{
    context  = new AnnotationConfigApplicationContext();
	context.scan("com.niit.shoppingcartbackend");
	context.refresh();
	userDAO  = (UserDAO) context.getBean("userDAO");
	user =(User) context.getBean("user");
	System.out.println("the objects are created");
	}
	@Test
	public void createUserTestCase()
	{
	user.setId("U002");
	user.setName("Souda");
	user.setPassword("1234");
	user.setMobile("8877665544");
    user.setEmail("hello@gmail.com");
    user.setRole("ROLE_ADMIN");
    user.setEnabled(true);
    
    
	Boolean status=userDAO.save(user);
	Assert.assertEquals("createUserTestCase",true,status);
	}

}
