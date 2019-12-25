package com.bway.springproject.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class populardestinationcontroller {
	
	// home1 ko ahref sanga name milnu parxa mapping gardaa

	@RequestMapping(value = "/pokharavalley", method = RequestMethod.GET)
	public String getaboutinfo(Model model) {


		return "pokharavalley";

	}
	
	@RequestMapping(value = "/boudhanath", method = RequestMethod.GET)
	public String getpopualardestination(Model model) {


		return "boudhanath";

	}
	
	@RequestMapping(value = "/bhaktapur", method = RequestMethod.GET)
	public String getpopualardestination1(Model model) {


		return "bhaktapur";

	}
	
	@RequestMapping(value = "/everestbasecamp", method = RequestMethod.GET)
	public String getpopualardestination2(Model model) {


		return "everestbasecamp";

	}
	
	@RequestMapping(value = "/tilicholake", method = RequestMethod.GET)
	public String getpopualardestination3(Model model) {


		return "tilicholake";

	}
	
	
	@RequestMapping(value = "/gosaikunda", method = RequestMethod.GET)
	public String getpopualardestination4(Model model) {


		return "gosaikunda";

	}
	
	@RequestMapping(value = "/langtangtrek", method = RequestMethod.GET)
	public String getpopualardestination5(Model model) {


		return "langtangtrek";

	}

}
