package com.bway.springproject.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class readbookController {
	
	// home1 ko ahref sanga name milnu parxa mapping gardaa

	@RequestMapping(value = "/houseofsnow", method = RequestMethod.GET)
	public String getbookinfo(Model model) {



		return "houseofsnow";

	}
	@RequestMapping(value = "/tutorofhistory", method = RequestMethod.GET)
	public String getbookinfo1(Model model) {



		return "TheTutorofHistory";

	}
	
	@RequestMapping(value = "/kathmandu2016", method = RequestMethod.GET)
	public String getbookinfo2(Model model) {



		return "Kathmandu(2016)";

	}
	@RequestMapping(value = "/whilethegod", method = RequestMethod.GET)
	public String getbookinfo3(Model model) {



		return "whilethegodsweresleeping";

	}
	@RequestMapping(value = "/thamel", method = RequestMethod.GET)
	public String getbookinfo4(Model model) {



		return "thamel";

	}
	@RequestMapping(value = "/battleofnewrepublic", method = RequestMethod.GET)
	public String getbookinfo5(Model model) {



		return "battlesofnewrepublic";

	}
	@RequestMapping(value = "/livinggoddess", method = RequestMethod.GET)
	public String getbookinfo6(Model model) {



		return "Thelivinggoddess";

	}
	@RequestMapping(value = "/bulletandballet", method = RequestMethod.GET)
	public String getbookinfo7(Model model) {



		return "Thebulletandballetbox";

	}
	@RequestMapping(value = "/mustang", method = RequestMethod.GET)
	public String getbookinfo8(Model model) {



		return "mustang";

	}
	@RequestMapping(value = "/intothinair", method = RequestMethod.GET)
	public String getbookinfo9(Model model) {



		return "IntoThinAir";

	}
	
	@RequestMapping(value = "/royalghost", method = RequestMethod.GET)
	public String getbookinfo10(Model model) {



		return "royalghost";

	}


}
