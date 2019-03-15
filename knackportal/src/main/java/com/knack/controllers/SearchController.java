package com.knack.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.knack.dao.impl.EmployeDaoImpl;
import com.knack.models.Employe;

@Controller
public class SearchController {
	
	@Autowired
	EmployeDaoImpl emp;
	
	@RequestMapping(value="/Search", method=RequestMethod.POST)
	public ModelAndView searchHandler(@RequestParam("search") String id,Model model) {
		ModelAndView mv=new ModelAndView();
		ArrayList<Employe> employe =(ArrayList<Employe>) emp.getByid(id);
		mv.setViewName("searchpage");
		mv.addObject("employe",employe);
		if(employe.size()<1) {
			model.addAttribute("message", "No record found!!");
		}
		return mv;
	}
}
