package com.project.GroceryBackend;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.GroceryBackend.DAO.ProductDAO;
import com.project.GroceryBackend.model.Product;

public class ProductTest {

private static AnnotationConfigApplicationContext context;
	
	static Product product;
	static ProductDAO productDAO;
	@BeforeClass
	public static void init() 
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.project.GroceryBackend");
		context.refresh();
		
		productDAO = (ProductDAO)context.getBean("productDAO");
	}

	@Test
	public void testAddProduct()
	{
		
		product = new Product();
		
		product.setName("Mango juice");
		product.setBrand("Malda-mango");
		product.setDescription("testy testy");
		product.setUnitPrice(60);
		product.setActive(true);
		product.setCategoryId(4);
		product.setSupplierId(2);
		product.setQuantity(5);
		
		assertEquals("Something went wrong while inserting a new product!",
				true,productDAO.addProduct(product));
		
	}
}
