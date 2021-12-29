package com.project.GroceryBackend;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.GroceryBackend.DAO.CategoryDAO;
import com.project.GroceryBackend.model.Category;

public class CategoryTest {

	private static AnnotationConfigApplicationContext context;
	static Category category;
	static CategoryDAO categoryDAO;
	
	@BeforeClass
	public static void init() 
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.project.GroceryBackend");
		context.refresh();
		
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
	}
	

	
	@Test
	public void testAddCategory()
	{
		category = new Category();
		category.setCategoryName("Mango");
		category.setDescription("New sweet &testy fruit");
		category.setActive(true);
		
		assertEquals("Error adding category",true,categoryDAO.addCategory(category));
	}
}
