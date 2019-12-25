//package com.bway.springproject.controllers;
//
//import java.util.Arrays;
//import java.util.List;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import com.bway.springproject.daos.Bookingdao;
//import com.bway.springproject.models.Booking;
//@Controller
//public class cancelformcontroller {
//	
//	@Autowired
//	private Bookingdao bdao;
//	
//	// home1 ko ahref sanga name milnu parxa mapping gardaa
//
//	@RequestMapping(value = "/cancelform", method = RequestMethod.GET)
//	public String getbookingformm(Model model) {
//
//
//		return "cancelform";
//
//	}
//	
//
//	@RequestMapping(value = "/bookedConfirm", method = RequestMethod.POST)
//	public String getbookingformm1(@ModelAttribute Booking bok ,Model model) {
//		
//		
//		String to = bok.getEmail();
//		String subject = "Booking Confirm";
//		String msg = "Dear Customer "+"Hotel Name :  "+bok.getHotelName()+"Room No :"+bok.getRoomno()+"Hotel Type:"+bok.getRoomType()+"Booking Date:"+bok.getBookingDate()+ "Checkout Date:"+bok.getCheckoutDate();
//
//		Mailer.send(to, subject, msg);
//		
//		bok.setAvailable("no");
//		bdao.bookingDone(bok);
//		model.addAttribute("hlist",bdao.getAllBooking());
//		
//		//return "redirect:/booking";
//		return "redirect:/package";
//	}
//	
//	 
//	@RequestMapping(value="/{id}/bookingCancel",method=RequestMethod.GET)
//	public String editStud(@PathVariable("id") int id, Model model){
//		Booking b = bdao.getById(id);
//
//		b.setAvailable("yes");
//		bdao.bookingDone(b);
//		 
//		return "redirect:/booking";
//		
//		
//	}
//	
//
//}
