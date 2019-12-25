package com.bway.springproject.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class festivalController {
	
	// home1 ko ahref sanga name milnu parxa mapping gardaa

	@RequestMapping(value = "/internationalfestival", method = RequestMethod.GET)
	public String getfestivalinfo(Model model) {


		return "InternationalFestivals";

	}
	
	@RequestMapping(value = "/localfestival", method = RequestMethod.GET)
	public String getlocalfestivalinfo(Model model) {


		return "LocalFestivals";

	}

}
