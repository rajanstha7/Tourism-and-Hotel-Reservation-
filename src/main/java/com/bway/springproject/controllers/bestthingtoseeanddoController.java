package com.bway.springproject.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class bestthingtoseeanddoController {
	
	// home1 ko ahref sanga name milnu parxa mapping gardaa

	@RequestMapping(value = "/climbmountain", method = RequestMethod.GET)
	public String getthinginfo(Model model) {



		return "climbmountain";

	}
	
	@RequestMapping(value = "/gotrekking", method = RequestMethod.GET)
	public String getthinginfo1(Model model) {



		return "gotrekking";

	}
	@RequestMapping(value = "/takeamountainflight", method = RequestMethod.GET)
	public String getthinginfo2(Model model) {



		return "Takeamountainflight";

	}
	@RequestMapping(value = "/joinafestival", method = RequestMethod.GET)
	public String getthinginfo3(Model model) {



		return "Joinafestival";

	}
}