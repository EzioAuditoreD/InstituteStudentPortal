package com.isp.dao;


import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.isp.pojos.Attendance;
import com.isp.pojos.Course;
import com.isp.pojos.Marks;
import com.isp.pojos.Notice;
import com.isp.pojos.Schedule;
import com.isp.pojos.Student;

@Repository
@Transactional
@SuppressWarnings("unused")
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private SessionFactory sf;
	
	@Override
	public Student validateStudent(String usn, String pwd) {
		String jpql="select s from Student s where s.username= :username and s.password = :password";
		Session hs = sf.getCurrentSession();
		Student s;
		try {
			s = hs.createQuery(jpql, Student.class).setParameter("username", usn).setParameter("password", pwd).getSingleResult();
		} catch (HibernateException e) {
			throw e;
		}
		return s;
	}

	@Override
	public List<Notice> getNotices(Integer courseId) {
		String jpql="select c from Course c where c.courseID= :courseId";
		List<Notice> li = null;
		Session hs = sf.getCurrentSession();
		try {
			Course c = hs.createQuery(jpql, Course.class).setParameter("courseId", courseId).getSingleResult();
			li=c.getNotices();
			for(Notice n : li);
		} catch (HibernateException e) {
			throw e;
		}
		return li;
	}

	@Override
	public List<Schedule> getSchedules(Integer courseId) {
		String jpql="select c from Course c where c.courseID= :courseId";
		List<Schedule> li = null;
		Session hs = sf.getCurrentSession();
		try {
			Course c = hs.createQuery(jpql, Course.class).setParameter("courseId", courseId).getSingleResult();
			li=c.getSchedules();
			for(Schedule s : li);
		} catch (HibernateException e) {
			throw e;
		}
		return li;
	}

	@Override
	public Student getDetails(Integer studId) {
		String jpql="select s from Student s where s.id = :studId";
		Session hs = sf.getCurrentSession();
		Student s;
		try {
		s= hs.createQuery(jpql, Student.class).setParameter("studId", studId).getSingleResult();
		} catch (HibernateException e) {
			throw e;
		}
		return s;
	}

	@Override
	public String updatePassword(Integer studId,String pwd) {
		String jpql="select s from Student s where s.id = :studId";
		Session hs = sf.getCurrentSession();
		try {
			Student s = hs.createQuery(jpql, Student.class).setParameter("studId", studId).getSingleResult();
			s.setPassword(pwd);
		} catch (HibernateException e) {
			throw e;
		}
		return "Password changed successfully";
	}

	@Override
	public List<Marks> getMarks(Integer studId) {
		String jpql="select s from Student s where s.id = :studId";
		List<Marks> li = null;
		Session hs = sf.getCurrentSession();
		try {
			Student s = hs.createQuery(jpql, Student.class).setParameter("studId", studId).getSingleResult();
			li=s.getMarks();
			for(Marks m : li);
		} catch (HibernateException e) {
			throw e;
		}
		return li;
	}

	@Override
	public List<Attendance> getAttendance(Integer studId) {
		String jpql="select s from Student s where s.id = :studId";
		List<Attendance> li = null;
		Session hs = sf.getCurrentSession();
		try {
			Student s = hs.createQuery(jpql, Student.class).setParameter("studId", studId).getSingleResult();
			li=s.getAttendance();
			for(Attendance a : li);
		} catch (HibernateException e) {
			throw e;
		}
		return li;
	}

}
