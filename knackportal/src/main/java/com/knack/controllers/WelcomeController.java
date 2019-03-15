package com.knack.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.knack.dao.impl.EmployeDaoImpl;
import com.knack.models.Employe;

@Controller
public class WelcomeController {
	
	@Autowired
	EmployeDaoImpl obj;
	
	@RequestMapping(value="/Welcome",method=RequestMethod.POST)
	public ModelAndView welcomeHandler(Model model) {
		ModelAndView mv=new ModelAndView();
		Employe emp=obj.see;
		mv.setViewName("welcome");
		model.addAttribute("fname",emp.getFname());
		model.addAttribute("role",emp.getRole());
		model.addAttribute("empid",emp.getEmpcode());
		return mv;
	}
}
