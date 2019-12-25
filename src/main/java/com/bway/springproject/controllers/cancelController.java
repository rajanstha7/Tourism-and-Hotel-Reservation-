package com.bway.springproject.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bway.springproject.daos.Bookingdao;
@Controller
public class cancelController {
	
	@Autowired
	private   Bookingdao bdao;
	
	// home1 ko ahref sanga name milnu parxa mapping gardaa

	@RequestMapping(value = "/cancel", method = RequestMethod.GET)
	public String getbookinginfo1(Model model) {
		
		model.addAttribute("hlist",bdao.getAllBooking());

		return "cancel";
	}
//	 
//	@RequestMapping(value="/{id}/booking",method=RequestMethod.GET)
//	public String editStud(@PathVariable("id") int id, Model model){
//		 
//		model.addAttribute("booking",bdao.getById(id));
//		return "bookingform";
//		
//	}
//	
//	@RequestMapping(value = "/ConfirmBookingList", method = RequestMethod.GET)
//	public String getbookedList(Model model) {
//		
//		model.addAttribute("hlist",bdao.getAllBookedList());
//		return "bookingConfirmList";
//	}
//	


}
