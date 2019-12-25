package com.bway.springproject.controllers;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bway.springproject.daos.UserDao;
import com.bway.springproject.models.User;

@Controller
public class loginController {

	private static final Logger logger = LoggerFactory.getLogger(loginController.class);
	@Autowired
	private UserDao udao;
	private HttpSession session;
	
	
//	@RequestMapping(value = "/userlogin", method = RequestMethod.GET)
//	public String getLoginForm() {
//		return "loginForm";
//	}
//
//	@RequestMapping(value = "/userlogin", method = RequestMethod.POST)
//	public String userLogin(@ModelAttribute User u, Model model) {
//		if (udao.login(u.getUsername(), u.getPassword())) {
//			model.addAttribute("user", u.getUsername());
//			return "home1";
//		} else {
//			model.addAttribute("error", "user does nt exit!!");
//			logger.info("login failed");
//			return "loginForm";
//		}
//		
//	}

	@RequestMapping(value = "/userlogin", method = RequestMethod.GET)
	public String getLoginForm() {
		return "login";
	}

	@RequestMapping(value = "/userlogin", method = RequestMethod.POST)
	public String userLogin(@ModelAttribute User u, Model model) {
		if (udao.login(u.getUsername(), u.getPassword())) {
			model.addAttribute("user", u.getUsername());
			return "home1";
		} else {
			model.addAttribute("error", "user does nt exit!!");
			logger.info("login failed");
			return "login";
		}
	//	return"home1";
		
	}
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String userLogout(HttpSession Sesssion) {
		logger.info("user logout Success");
		session.invalidate();
		return "home";
	}
}
