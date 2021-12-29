package com.project.GroceryBackend.DAO;

import java.util.List;

import com.project.GroceryBackend.model.Category;

public interface CategoryDAO
{


	Category getCategory(int id);
	List<Category> categoryList();
	boolean addCategory(Category category);
	boolean updateCategory(Category category);
	boolean deleteCategory(Category category);
}
