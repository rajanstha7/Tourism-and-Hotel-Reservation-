package com.bway.springproject.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class pkrcontroller {
	
	// home1 ko ahref sanga name milnu parxa mapping gardaa

	@RequestMapping(value = "/pkr4star", method = RequestMethod.GET)
	public String getaboutinfo(Model model) {

//		List<String> imglist = Arrays.asList("009.jpg", "008.jpg", "007.jpg", "006.jpg", "005.jpg", "004.jpg",
//				"003.jpg", "002.jpg");
//		
//		
//		model.addAttribute("imglist", imglist);

		return "pkr4";

	}
	@RequestMapping(value = "/pkr3star", method = RequestMethod.GET)
	public String getaboutinfo1(Model model) {

		return "pkr3";

	}
	@RequestMapping(value = "/atithi", method = RequestMethod.GET)
	public String getaboutinfo2(Model model) {

		return "atithi";

	}
	
	
	
	@RequestMapping(value = "/middlepath", method = RequestMethod.GET)
	public String getaboutinfo3(Model model) {

		return "middle";

	}
	@RequestMapping(value = "/fishtail", method = RequestMethod.GET)
	public String getaboutinfo4(Model model) {

		return "fishtail";

	}
	@RequestMapping(value = "/oyo", method = RequestMethod.GET)
	public String getaboutinfo5(Model model) {

		return "oyo";

	}

	

}
