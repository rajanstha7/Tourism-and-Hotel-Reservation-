package com.bway.springproject;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletResponse;

import org.jsoup.Jsoup;
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

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private UserDao udao;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "login";
	}

//	@RequestMapping(value = "/userlogin", method = RequestMethod.POST)
//	// public String loginForm(){
//
//	public String loginForm(@ModelAttribute User u, Model method) {
//
//		 if (udao.login(u.getUsername(), u.getPassword())) {
//		//	 return "home1";
//			 
//		 }
//
//	return "home1";
//
//	}


	@RequestMapping(value="/downloadWebpage")
  public void downloadWebpage(HttpServletResponse resp) throws IOException{
	  
	 String webPage = "https://www.google.com";
	 // String webPage = "https://nepalihotels.com";
      String html = Jsoup.connect(webPage).get().html();
      
       resp.getWriter().println(html);
  }

}



 

// @RequestMapping (value="/usersignup",method=RequestMethod.POST)
// public String SignupForm(){
// return "login";
// }
