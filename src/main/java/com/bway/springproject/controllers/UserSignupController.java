package com.bway.springproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bway.springproject.daos.UserDao;
import com.bway.springproject.models.User;

@Controller
public class UserSignupController {

	@Autowired
	private UserDao udao; //Userdao udao = new UserDaoImpl();
	
	@RequestMapping(value="/usersignup",method=RequestMethod.GET)
	public String getSignupForm()
	{
		return "signup";
	}
	
	@RequestMapping(value="/usersignup",method=RequestMethod.POST)
	public String Usersignup(@ModelAttribute User u)
	{
		udao.signup(u);
		return "login";
	}
}
