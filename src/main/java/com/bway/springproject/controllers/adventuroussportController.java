package com.bway.springproject.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class adventuroussportController {
	
	// home1 ko ahref sanga name milnu parxa mapping gardaa

	@RequestMapping(value = "/paragliding", method = RequestMethod.GET)
	public String getaboutinfo(Model model) {



		return "paragliding";

	}
	
	@RequestMapping(value = "/bungejump", method = RequestMethod.GET)
	public String getadventure1(Model model) {



		return "bungejump";

	}
	
	@RequestMapping(value = "/canyoning", method = RequestMethod.GET)
	public String getadventure2(Model model) {



		return "canyoning";

	}
	
	@RequestMapping(value = "/rafting", method = RequestMethod.GET)
	public String getadventure3(Model model) {



		return "raft";

	}
	

	@RequestMapping(value = "/mountaineering", method = RequestMethod.GET)
	public String getadventure4(Model model) {



		return "mountaineering";

	}
	
	@RequestMapping(value = "/trekking", method = RequestMethod.GET)
	public String getadventure5(Model model) {



		return "trekking";

	}
	
	@RequestMapping(value = "/whiterafting", method = RequestMethod.GET)
	public String getadventure6(Model model) {



		return "whiteraft";

	}
	
	@RequestMapping(value = "/kayak", method = RequestMethod.GET)
	public String getadventure7(Model model) {



		return "kayak";

	}
	
	@RequestMapping(value = "/onehorn", method = RequestMethod.GET)
	public String getadventure8(Model model) {



		return "onehorn";

	}
	
	@RequestMapping(value = "/kathmanduworld", method = RequestMethod.GET)
	public String getadventure9(Model model) {



		return "kathmanduworld";

	}
	
	@RequestMapping(value = "/lumbini", method = RequestMethod.GET)
	public String getadventure10(Model model) {



		return "lumbini";

	}


}
