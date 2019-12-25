package com.bway.springproject.daos;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bway.springproject.models.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	
	@Resource
	public SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public void addStudent(Student s) {
		Session session = sessionFactory.getCurrentSession();
		session.save(s);

	}
	@Override
	@Transactional
	public Student getById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Student s = (Student) session.get(Student.class, id);
		return s;
	}

	@Override
	@Transactional
	public void deleteStudent(int id) {
		Session session = sessionFactory.getCurrentSession();
		Student s = (Student) session.get(Student.class, id);
		session.delete(s);

	}

	@Override
	@Transactional
	public void updateStudent(Student s) {
		Session session = sessionFactory.getCurrentSession();
		session.update(s);

	}

	@Override
	@Transactional
	public List<Student> getAllStudent() {
		Session session = sessionFactory.getCurrentSession();
		Criteria crt=session.createCriteria(Student.class);
		return crt.list();
	}

}
