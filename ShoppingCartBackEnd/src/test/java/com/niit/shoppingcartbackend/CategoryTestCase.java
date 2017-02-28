package com.niit.shoppingcartbackend;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcartbackend.dao.CategoryDAO;
import com.niit.shoppingcartbackend.model.Category;

public class CategoryTestCase {

	
	public static void main(String[] args) {
		System.out.println("er1");
			
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
			
			context.scan("com.niit.shoppingcartbackend");
			context.refresh();
			System.out.println("er2");	
			
		   CategoryDAO categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
		   System.out.println("er3");
		   Category category = 	(Category) context.getBean("category");
		   System.out.println("er4");
		   category.setId("C001");
		   category.setName("CGName120");
		   category.setDescription("CGDesc120");
		   category.setId("C001");
		   category.setName("CGName120");
		   category.setDescription("CGDesc120");
		   System.out.println("er5");
		   
		   categoryDAO.save(category);
		   
		   
		   System.out.println("er6");
		   
		   
		   
		 /* if(   categoryDAO.get("sdfsf") ==null)
		  {
			  System.out.println("Category does not exist");
		  }
		  else
		  {
			  System.out.println("Category exist .. the details are ..");
			  System.out.println();
		  }
		  */
			
			
			
		}

}

