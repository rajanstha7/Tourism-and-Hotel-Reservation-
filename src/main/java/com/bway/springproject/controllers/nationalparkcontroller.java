package com.bway.springproject.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class nationalparkcontroller {
	
	// home1 ko ahref sanga name milnu parxa mapping gardaa

	@RequestMapping(value = "/annapurnamap", method = RequestMethod.GET)
	public String getaboutinfo(Model model) {



		return "annapurna";

	}
	
	@RequestMapping(value = "/bankemap", method = RequestMethod.GET)
	public String getaboutinf01(Model model) {



		return "banke";

	}
	
	@RequestMapping(value = "/bardiyamap", method = RequestMethod.GET)
	public String getaboutinf02(Model model) {



		return "bardiya";

	}
	@RequestMapping(value = "/langtangmap", method = RequestMethod.GET)
	public String getaboutinf03(Model model) {



		return "langtang";

	}
	
	@RequestMapping(value = "/manaslumap", method = RequestMethod.GET)
	public String getaboutinf04(Model model) {



		return "manaslu";

	}
	
	@RequestMapping(value = "/makalumap", method = RequestMethod.GET)
	public String getaboutinf05(Model model) {



		return "makalubarun";

	}
	@RequestMapping(value = "/raramap", method = RequestMethod.GET)
	public String getaboutinf06(Model model) {



		return "rara";

	}
	
	@RequestMapping(value = "/sagarmathamap", method = RequestMethod.GET)
	public String getaboutinf07(Model model) {



		return "sagarmatha";

	}
	
	@RequestMapping(value = "/sheyphoksundomap", method = RequestMethod.GET)
	public String getaboutinf08(Model model) {



		return "sheyphoksundo";

	}
	@RequestMapping(value = "/chitwanmap", method = RequestMethod.GET)
	public String getaboutinf09(Model model) {



		return "chitwan";

	}

}
