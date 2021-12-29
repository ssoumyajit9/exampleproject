package com.project.GroceryFrontend.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController
{

	@RequestMapping(value="/admission",method=RequestMethod.GET)
	public ModelAndView getForm()
	{
		ModelAndView mv=new ModelAndView("AdmissionForm");
		return mv;
	}
	
	  @RequestMapping(value="/form",method=RequestMethod.POST) 
	  public ModelAndView submitAdmission(@RequestParam ("email") String UserEmail ,
	  
	  @RequestParam ("password") String UserPassword )
	  { 
		  ModelAndView mv=new ModelAndView("AdmissionSuccess");
	  
	  mv.addObject("msg","details submitted by me :Email_id" +UserEmail+ "Passwd" +UserPassword);
	  return mv;
	  }
	 
}
