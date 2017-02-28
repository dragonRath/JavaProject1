
	package com.niit.shoppingcartbackend;

	import org.junit.Assert;
	import org.junit.BeforeClass;
	import org.junit.Test;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.context.annotation.AnnotationConfigApplicationContext;

	import com.niit.shoppingcartbackend.dao.CategoryDAO;
	import com.niit.shoppingcartbackend.model.Category;

	public class TestCase {
		@Autowired
		static AnnotationConfigApplicationContext context;

		@Autowired
		static Category category;

		@Autowired
		static CategoryDAO categoryDAO;

		

		@BeforeClass
		public static void init()
		{
	    context  = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcartbackend");
		context.refresh();
		categoryDAO  = (CategoryDAO) context.getBean("categoryDAO");
		category =(Category) context.getBean("category");
		System.out.println("the objects are created");
		}
		@Test
		public void createCategoryTestCase()
		{
		category.setId("C002");
		category.setDescription("This is Mobile Category");
		category.setName("Mobe Category");
		Boolean status=categoryDAO.save(category);
		Assert.assertEquals("Create Category Test Case",true,status);
		}
		@Test
		public void deleteCategoryTestCase()
		{
		category.setId("C002");
		category.setDescription("This is Mobile Category");
		category.setName("Mobe Category");
		Boolean status=categoryDAO.delete(category);
		Assert.assertEquals("Create Category Test Case",true,status);
		}
		@Test
		public void updateCategoryTestCase()
		{
		category.setId("C001");
		category.setDescription("mobile");
		category.setName("Mobe Category");
		Boolean status=categoryDAO.update(category);
		Assert.assertEquals("Create Category Test Case",true,status);
		}
		


	}






