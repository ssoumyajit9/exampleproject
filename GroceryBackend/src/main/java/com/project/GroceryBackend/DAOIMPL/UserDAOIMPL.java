package com.project.GroceryBackend.DAOIMPL;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.GroceryBackend.DAO.UserDAO;
import com.project.GroceryBackend.model.Address;
import com.project.GroceryBackend.model.Category;
import com.project.GroceryBackend.model.Information;
import com.project.GroceryBackend.model.Login;
import com.project.GroceryBackend.model.User;


@Repository("userDAO")
@Transactional
public class UserDAOIMPL implements UserDAO {

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public boolean addUser(User user) {
		try
		{
			user.setEnabled(true);
			sessionFactory.getCurrentSession().persist(user);
			return true;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public User getByEmail(String email) {
		
		String selectQuery = "FROM User WHERE email = :email";
		try {
		return sessionFactory
				.getCurrentSession()
					.createQuery(selectQuery,User.class)
						.setParameter("email",email)
							.getSingleResult();
		}
		
		catch(Exception ex) 
		{
			return null;
		}
	}

	@Override
	public boolean addAddress(Address address) {
		try
		{
			sessionFactory.getCurrentSession().persist(address);
			return true;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean addInformation(Information information) {
		try
		{
			sessionFactory.getCurrentSession().persist(information);
			return true;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean addLogin(Login login) {
		try
		{
			sessionFactory.getCurrentSession().persist(login);
			return true;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	
	public Login getLogin(int id) {
		return sessionFactory.getCurrentSession().get(Login.class,id );

	}

	
	public List<Login> loginlist() {
	
/*       String selectlogin = "FROM Login l WHERE l.email = :email";
*/		
		Query query = sessionFactory.getCurrentSession().createQuery("from Login");
				
		/*
		 * query.setParameter("email", true);
		 */						
		return query.getResultList();
	}

	





}
