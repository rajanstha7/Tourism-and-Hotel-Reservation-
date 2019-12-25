package com.bway.springproject.daos;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bway.springproject.models.Booking;
import com.bway.springproject.models.Student;


@Repository
public class BookingdaoIMPL implements Bookingdao {
	
	@Resource
	public SessionFactory sessionFactory;
	



	@Override
	@Transactional
	public void book(int roomno) {
		Session session = sessionFactory.getCurrentSession();
		Booking s = (Booking) session.get(Booking.class, roomno);
		session.delete(s);

	}

	
	@Override
	@Transactional
	public List<Booking> getAllBooking() {
		Session session = sessionFactory.getCurrentSession();
		Criteria crt=session.createCriteria(Booking.class);
		  crt.add(Restrictions.eq("available", "yes"));
		
		return crt.list();
	}
	
	
	@Override
	@Transactional
	public List<Booking> getAllBookedList() {
		Session session = sessionFactory.getCurrentSession();
		Criteria crt=session.createCriteria(Booking.class);
		  crt.add(Restrictions.eq("available", "no"));
		
		return crt.list();
	}


	@Override
	@Transactional
	public Booking getById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Booking s = (Booking) session.get(Booking.class, id);
		return s;
	}

	@Override
	@Transactional
	public void bookingDone(Booking b) {
		Session session = sessionFactory.getCurrentSession();
		session.update(b);
	}

}
