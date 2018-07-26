package com.isp.dao;

import java.util.List;

import com.isp.pojos.Attendance;
import com.isp.pojos.Marks;
import com.isp.pojos.Notice;
import com.isp.pojos.Schedule;
import com.isp.pojos.Student;

public interface StudentDao {
	Student validateStudent(String usn,String pwd);
	List<Notice> getNotices(Integer courseId);
	List<Schedule> getSchedules(Integer courseId);
	Student getDetails(Integer studId); 
	String updatePassword(Integer studId,String pwd);
	List<Marks> getMarks(Integer studId);
	List<Attendance> getAttendance(Integer studId);
	
}
