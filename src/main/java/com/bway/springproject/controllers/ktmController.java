package com.bway.springproject.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class ktmController {
	
	// home1 ko ahref sanga name milnu parxa mapping gardaa

	@RequestMapping(value = "/ktm", method = RequestMethod.GET)
	public String getGallery(Model model) {

//		List<String> imglist = Arrays.asList("009.jpg", "008.jpg", "007.jpg", "006.jpg", "005.jpg", "004.jpg",
//				"003.jpg", "002.jpg");
//		
//		
//		model.addAttribute("imglist", imglist);

		return "Kathmandu5";

	}
	
	
	@RequestMapping(value = "/ktm2star", method = RequestMethod.GET)
	public String getaboutinfo12(Model model) {


		return "ktm2star";

	}
	@RequestMapping(value = "/ktm1star", method = RequestMethod.GET)
	public String getaboutinfo123(Model model) {


		return "ktm1star";

	}

}
