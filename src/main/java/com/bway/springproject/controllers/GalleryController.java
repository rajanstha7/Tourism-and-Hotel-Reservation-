package com.bway.springproject.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class GalleryController {
	
	// home1 ko ahref sanga name milnu parxa mapping gardaa

	@RequestMapping(value = "/kathmandu", method = RequestMethod.GET)
	public String getGalleryForm(Model model) {

//		List<String> imglist = Arrays.asList("009.jpg", "008.jpg", "007.jpg", "006.jpg", "005.jpg", "004.jpg",
//				"003.jpg", "002.jpg");
//		
//		
//		model.addAttribute("imglist", imglist);

		return "ktm5";

	}

}
