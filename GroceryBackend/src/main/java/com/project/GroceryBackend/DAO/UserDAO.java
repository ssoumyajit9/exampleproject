package com.project.GroceryBackend.DAO;

import java.util.List;

import com.project.GroceryBackend.model.Address;
import com.project.GroceryBackend.model.Information;
import com.project.GroceryBackend.model.Login;
import com.project.GroceryBackend.model.User;

public interface UserDAO 
{

	boolean addUser(User user);
	User getByEmail(String email) ;
	boolean addAddress(Address address);
	boolean addInformation(Information information);
	boolean addLogin(Login login);
	Login getLogin(int id);
	List <Login> loginlist();
}
