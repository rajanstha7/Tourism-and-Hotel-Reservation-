package com.bway.springproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class HotelPamiloController {
	@RequestMapping(value = "/Hotel Pamilo House", method = RequestMethod.GET)
	public String getaboutinfo(Model model) {

//		List<String> imglist = Arrays.asList("009.jpg", "008.jpg", "007.jpg", "006.jpg", "005.jpg", "004.jpg",
//				"003.jpg", "002.jpg");
//		
//		
//		model.addAttribute("imglist", imglist);

		return "Hotel Pamilo House";

	}


}
