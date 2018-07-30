package com.isp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isp.dao.StudentDao;
import com.isp.pojos.Attendance;
import com.isp.pojos.Marks;
import com.isp.pojos.Notice;
import com.isp.pojos.Schedule;
import com.isp.pojos.Student;
import com.isp.utils.IspUtils;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao dao;
	@Override
	public Student validateStudent(String em, String pass) {
		//return dao.validateStudent(em, IspUtils.passwordEncoder().encode(pass));
		return dao.validateStudent(em, pass);
	}

	@Override
	public List<Notice> getNotices(Integer courseId) {
		return dao.getNotices(courseId);
	}

	@Override
	public List<Schedule> getSchedules(Integer courseId) {
		return dao.getSchedules(courseId);
	}

	@Override
	public Student getStudentDetails(Integer studentId) {
		return dao.getDetails(studentId);
	}

	@Override
	public String updatePassword(Integer studId, String pwd) {
		return dao.updatePassword(studId, IspUtils.passwordEncoder().encode(pwd));
	}

	@Override
	public List<Marks> getMarks(Integer studId) {
		return dao.getMarks(studId);
	}

	@Override
	public List<Attendance> getAttendance(Integer studId) {
		return dao.getAttendance(studId);
	}

}