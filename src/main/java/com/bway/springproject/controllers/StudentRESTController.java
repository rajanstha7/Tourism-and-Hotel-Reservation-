//package com.bway.springproject.controllers;
//
//
//import java.util.List;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.bway.springproject.daos.Bookingdao;
//import com.bway.springproject.daos.StudentDao;
//import com.bway.springproject.models.Booking;
//import com.bway.springproject.models.Student;
//
//@RestController
//@RequestMapping("api/booking")
//
//public class StudentRESTController {
//	
//	@Autowired
//	private Bookingdao bdao;
//	
//	
//	@RequestMapping(value="/hlist",method=RequestMethod.GET)
//	public ResponseEntity<List<Student>>studentList(){
//		
//	//
//		//ResponseEntity<List<Student>>hotelList=new ResponseEntity<List<Booking>>(Booking.getAllBooking(),HttpStatus.OK);
//	ResponseEntity<List<Booking>>hlist= new ResponseEntity<List<Booking>>(Booking.getAllBooking(),HttpStatus.OK);
//		
//		return hlist;
//	
//	}
//	
//	
//	
//
//	
//
//}
