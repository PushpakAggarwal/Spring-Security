package com.knack.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.knack.dao.impl.EmployeDaoImpl;
import com.knack.dao.impl.EmployeeMapper;
import com.knack.models.Employe;
import com.knack.services.impl.EmployeServicesImpl;

@Controller
public class LoginController {
	@Autowired
	EmployeDaoImpl emp; 
	EmployeeMapper empMapper;
	
	@RequestMapping(value="/Login")
	public String login() {
		return "loginpage";
	}
	
	
	@RequestMapping(value="/Login", method=RequestMethod.POST)
	public ModelAndView loginhandler(@ModelAttribute("details") Employe ep,Model model) {
		ModelAndView mv=new ModelAndView();
		String view="welcome";
		boolean check= emp.validate(ep.getEmpcode(), ep.getPassword());
		if(!check) {
			view="loginpage";
			model.addAttribute("error","Empoyee code or password is incorrect!!");
		}else {
			model.addAttribute("fname",emp.see.getFname());
			model.addAttribute("role",emp.see.getRole());
			model.addAttribute("empid",emp.see.getEmpcode());
		}
		mv.setViewName(view);
		return mv;
	}
}
