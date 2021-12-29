package com.project.GroceryFrontend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.GroceryBackend.DAO.CategoryDAO;
import com.project.GroceryBackend.DAO.ProductDAO;
import com.project.GroceryBackend.model.Category;
import com.project.GroceryBackend.model.Product;

@Controller
@RequestMapping(value="/manage")
public class ManagerProductController 
{

	@Autowired
	CategoryDAO categoryDAO;

	@Autowired
	ProductDAO productDAO;

	@RequestMapping("/product")
	public ModelAndView manageProduct(@RequestParam(name = "operation", required = false) String operation) {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Manage Product");
		mv.addObject("userclickmanageproduct", true);

		if (operation != null) {
			if (operation.equals("product")) {
				mv.addObject("message", "Product submitted successfully!");
			}

			if (operation.equals("category")) {
				mv.addObject("message", "Category submitted successfully!");
			}
		}

		Product newProduct = new Product();
		newProduct.setActive(true);
		newProduct.setSupplierId(1);

		mv.addObject("product", newProduct);
		return mv;

	}
	@RequestMapping("/{id}/product")
	public ModelAndView viewProduct(@PathVariable int id) {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Manage Product");
		mv.addObject("userclickmanageproduct", true);

		Product newProduct = productDAO.getProduct(id);
		mv.addObject("product", newProduct);
		return mv;

	}

	@ModelAttribute("categories")
	public List<Category> modelCategories() {
		return categoryDAO.categoryList();
	}

	@ModelAttribute("category")
	public Category modelCategory() {
		return new Category();
	}
}
