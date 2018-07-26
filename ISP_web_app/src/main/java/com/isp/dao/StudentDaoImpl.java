package com.isp.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.isp.pojos.Attendance;
import com.isp.pojos.Course;
import com.isp.pojos.Marks;
import com.isp.pojos.Notice;
import com.isp.pojos.Schedule;
import com.isp.pojos.Student;


@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private SessionFactory sf;

	@Override
	public Student validateStudent(String usn, String pwd) {
		String jpql="select s from Student s where s.username= :username and s.password = :password";
		return sf.getCurrentSession().createQuery(jpql, Student.class).setParameter("username", usn).setParameter("password", pwd).getSingleResult();
	}

	@Override
	public List<Notice> getNotices(Integer courseId) {
		String jpql="select c from Course c where c.courseID= :courseId";
		List<Notice> li = null;
		Session hs = sf.getCurrentSession();
		Transaction tx = hs.beginTransaction();
		try {
			Course c = hs.createQuery(jpql, Course.class).getSingleResult();
			li=c.getNotices();
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return li;
	}

	@Override
	public List<Schedule> getSchedules(Integer courseId) {
		String jpql="select c from Course c where c.courseID= :courseId";
		List<Schedule> li = null;
		Session hs = sf.getCurrentSession();
		Transaction tx = hs.beginTransaction();
		try {
			Course c = hs.createQuery(jpql, Course.class).getSingleResult();
			li=c.getSchedules();
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return li;
	}

	@Override
	public Student getDetails(Integer studId) {
		String jpql="select s from Student s where s.id = :studId";
		return sf.getCurrentSession().createQuery(jpql, Student.class).setParameter("studId", studId).getSingleResult();
	}

	@Override
	public String updatePassword(Integer studId,String pwd) {
		String jpql="select s from Student s where s.id = :studId";
		Session hs = sf.getCurrentSession();
		Transaction tx = hs.beginTransaction();
		try {
			Student s = hs.createQuery(jpql, Student.class).getSingleResult();
			s.setPassword(pwd);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return "Password changed successfully";
	}

	@Override
	public List<Marks> getMarks(Integer studId) {
		String jpql="select s from Student s where s.id = :studId";
		List<Marks> li = null;
		Session hs = sf.getCurrentSession();
		Transaction tx = hs.beginTransaction();
		try {
			Student s = hs.createQuery(jpql, Student.class).getSingleResult();
			li=s.getMarks();
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return li;
	}

	@Override
	public List<Attendance> getAttendance(Integer studId) {
		String jpql="select s from Student s where s.id = :studId";
		List<Attendance> li = null;
		Session hs = sf.getCurrentSession();
		Transaction tx = hs.beginTransaction();
		try {
			Student s = hs.createQuery(jpql, Student.class).getSingleResult();
			li=s.getAttendance();
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return li;
	}

}
