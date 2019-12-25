package com.bway.springproject.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class backcontroller {
	
	// home1 ko ahref sanga name milnu parxa mapping gardaa

	 
	@RequestMapping(value="/{id}/back",method=RequestMethod.GET)
	//@RequestMapping(value="/back",method=RequestMethod.GET)
	public String editStud1(Model model){
		 
		
		return "home1";
		
	}

}
