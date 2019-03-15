package com.knack.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.knack.dao.impl.EmployeDaoImpl;
import com.knack.models.Employe;

@Controller
public class RegistrationController {
@Autowired
EmployeDaoImpl empDaoImpl;
	
	@RequestMapping(value="/Register", method=RequestMethod.GET)
	public String registration(){
		return "registrationpage";
	}
	
	@RequestMapping(value="/Register", method=RequestMethod.POST)
	public ModelAndView Registrationhandler(@ModelAttribute("details") Employe e) {
		ModelAndView mv=new ModelAndView();
		mv.addObject(e);
		mv.setViewName("loginpage");
		empDaoImpl.save(e.getFname(), e.getLname(), e.getGender(), e.getRole(), e.getEmpcode(), e.getContact(), e.getPassword());
		return mv;
	}
}
