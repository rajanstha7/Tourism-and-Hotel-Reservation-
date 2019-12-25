package com.bway.springproject.controllers;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class MailController {
	
	@RequestMapping(value = "/email", method = RequestMethod.GET)
	public String emailPage() {

		return "email";
	}

	@RequestMapping(value = "/email", method = RequestMethod.POST)
	public String sendEmail(HttpServletRequest request, Model model) {

		String to = request.getParameter("to");
		String subject = request.getParameter("subject");
		String msg = request.getParameter("msg");

		Mailer.send(to, subject, msg);
		
		return "home1";
	}

}
