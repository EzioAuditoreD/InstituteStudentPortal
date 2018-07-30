package com.isp.service;

import java.util.List;

import com.isp.pojos.Attendance;
import com.isp.pojos.Marks;
import com.isp.pojos.Notice;
import com.isp.pojos.Schedule;
import com.isp.pojos.Student;

public interface StudentService {
	Student validateStudent(String em,String pass);
	List<Notice> getNotices(Integer studentId);
	List<Schedule> getSchedules(Integer courseId);
	Student getStudentDetails(Integer courseId);
	String updatePassword(Integer studId,String pwd);
	List<Marks> getMarks(Integer studId);
	List<Attendance> getAttendance(Integer studId);
}
