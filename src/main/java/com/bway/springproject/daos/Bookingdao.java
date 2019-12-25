package com.bway.springproject.daos;

import java.util.List;

import com.bway.springproject.models.Booking;


public interface Bookingdao {

		
		
		public void book(int id);
	
		
		public List<Booking> getAllBooking();


		Booking getById(int id);


		void bookingDone(Booking b);


		List<Booking> getAllBookedList();
		
}
