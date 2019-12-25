package com.bway.springproject.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class pokhara4starhotelcontroller {
	
	// home1 ko ahref sanga name milnu parxa mapping gardaa
	
	@RequestMapping(value = "/pavilions", method = RequestMethod.GET)
	public String getaboutpkr4(Model model) {
		
		return "pavilions";
}
	
	@RequestMapping(value = "/dayatra", method = RequestMethod.GET)
	public String getaboutpkr9(Model model) {
		
		return "dayatra";
}

	@RequestMapping(value = "/barahi", method = RequestMethod.GET)
	public String getaboutinfo(Model model) {



		return "barahi";

	}
	
	
	@RequestMapping(value = "/landmark", method = RequestMethod.GET)
	public String getaboutinfo1(Model model) {



		return "landmark";

	}
	
	@RequestMapping(value = "/shangrila", method = RequestMethod.GET)
	public String getaboutinfo2(Model model) {



		return "shangrila";

	}


}
