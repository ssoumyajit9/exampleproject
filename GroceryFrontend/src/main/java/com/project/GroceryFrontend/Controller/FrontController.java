package com.project.GroceryFrontend.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.GroceryBackend.DAO.CategoryDAO;
import com.project.GroceryBackend.DAO.UserDAO;
import com.project.GroceryBackend.model.Information;
import com.project.GroceryBackend.model.Login;

@Controller
public class FrontController {

	@Autowired
	CategoryDAO categoryDAO;
@Autowired
UserDAO userDAO;
	@RequestMapping(value = "/")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");

		mv.addObject("title", "My Online Shopping");
		mv.addObject("userclickhome", true);
		mv.addObject("categories", categoryDAO.categoryList());

		return mv;
	}

	@RequestMapping(value = "/service")
	public ModelAndView service() {
		ModelAndView mv = new ModelAndView("page");

		mv.addObject("title", "My Online Shopping");
		mv.addObject("userclickservice", true);

		return mv;

	}

//	@RequestMapping(path = "/processform", method = RequestMethod.POST)
//	public ModelAndView handleForm(@RequestParam("email") String userEmail,
//			@RequestParam("password") String userPassword) 
//	{
//		ModelAndView mv = new ModelAndView("page");
//
//		System.out.println("user email" + userEmail);
//		System.out.println("user password" + userPassword);
//		
//		return mv;
//	}
	
	@RequestMapping(value="/processform",method= RequestMethod.POST)
	public ModelAndView Login(@ModelAttribute("login") Login newlogin)
	{
		ModelAndView mv = new ModelAndView("page");

		mv.addObject("title", "login");
		mv.addObject("userclicklogin", true);

		mv.addObject("logindata",userDAO.addLogin(newlogin));
		return mv;
	}
	@RequestMapping(value="/loginsuccess")
     public ModelAndView loginsuccess()
     {

		ModelAndView mv = new ModelAndView("page");

		mv.addObject("title", "My Online Shopping");
		mv.addObject("userclicksuccess", true);
        mv.addObject("success",userDAO.loginlist());
		return mv;

     }
	@RequestMapping(value="/contact/{userId}")
	public ModelAndView path(@PathVariable("userId") int u_id)
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userclickcontact", true);
       System.out.println(u_id);
		return mv;

	}
	@RequestMapping(value="/aboutus")
	public ModelAndView main()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userclickaboutus", true);
		System.out.println("this is main");
		return mv;
	}
	@RequestMapping(value="/redirect")
	public String redirectMain()
	{

		System.out.println("this is redirect");
		return "redirect:/aboutus" ;
	}
}