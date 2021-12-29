package com.project.GroceryBackend.HQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.project.GroceryBackend.model.Category;

public class HQLExample {

	public static void main(String[] args)
	{
		    Configuration cfg=new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory factory=cfg.buildSessionFactory();
	        Session s=factory.openSession();
	        Transaction t=s.beginTransaction();
	        //String query="from Category ";//all category fetch
	        Query query= s.createQuery("INSERT INTO Category (id,categoryName, description, active) select id,categoryName,description, active from Category");
		
		Category categorynew=new Category();
		categorynew.setId(60);
		categorynew.setCategoryName("Pinaple");
		categorynew.setDescription("fruits good ");
		categorynew.setActive(true);
		
		//s.save(categorynew);
		
		int result = query.executeUpdate();
		
		s.save(categorynew);
		
		System.out.println("Insert table : " + result);
		
		
		
		
		/*
		 * Query q=s.createQuery(query);
		 * 
		 * List<Category> list=q.list();
		 * 
		 * for(Category allCategory :list) {
		 * System.out.println(allCategory.getCategoryName()); }
		 */
		t.commit();
		s.close();
		factory.close();

	}
}
