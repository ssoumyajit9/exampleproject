package com.project.GroceryBackend;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.GroceryBackend.DAO.UserDAO;
import com.project.GroceryBackend.model.Address;
import com.project.GroceryBackend.model.Information;
import com.project.GroceryBackend.model.Login;
import com.project.GroceryBackend.model.User;

public class UserTest
{

	private static AnnotationConfigApplicationContext context;
	static User user;
	static UserDAO userDAO;
	static Address address;
	static Login login;
	static Information information;
	@BeforeClass
	public static void init() 
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.project.GroceryBackend");
		context.refresh();
		
		userDAO = (UserDAO)context.getBean("userDAO");
	}
	@Test
	public void testAddUser()
	{
		
		/*
		 * user = new User(); user.setFirstName("Rohan "); user.setLastName("Mishra");
		 * user.setEmail("rmd@gmail.com"); user.setContactNumber("9874567890");
		 * user.setRole("USER"); user.setPassword("12345");
		 * assertEquals("Error",true,userDAO.addUser(user));
		 * 
		 * address = new Address();
		 * address.setAddressLineOne("101/B Jadoo Society, Krissh Nagar");
		 * address.setAddressLineTwo("Near Kaabil Store"); address.setCity("Mumbai");
		 * address.setState("Maharashtra"); address.setCountry("India");
		 * address.setPostalCode("400001"); address.setBilling(true);
		 * address.setUserId(user.getId());
		 * assertEquals("Error",true,userDAO.addAddress(address));
		 * 
		 */	/*
		 * information=new Information(); information.setOfficeName("KolkataBranch");
		 * information.setOfficemail("shopkol@gmail.com");
		 * information.setOfficeAddress("sector v ,saltlake city");
		 * information.setPhone("8282911227/9874675630");
		 * assertEquals("Error",true,userDAO.addInformation(information));
		 */
		
		/*
		 * newUser=new NewUser(); newUser.setEmail("ak@gmail.com");
		 * newUser.setPassword("123");
		 * assertEquals("Error",true,userDAO.addNewUser(newUser));
		 */
		login=new Login();
		login.setEmail("soumyajit2@gmail.com");
		login.setPassword("123");
		assertEquals("Error",true,userDAO.addLogin(login));
	}
}
