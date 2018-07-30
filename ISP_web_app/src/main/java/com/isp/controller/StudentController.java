package com.isp.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.isp.pojos.Attendance;
import com.isp.pojos.Marks;
import com.isp.pojos.Notice;
import com.isp.pojos.Schedule;
import com.isp.pojos.Student;
import com.isp.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService service;
	
	public StudentController() 
	{
		System.out.println("Created Student Controller");
	}
	
	@GetMapping("/login")
	public String showLogin()
	{
		return "/login";
	}
	
	@PostMapping("/login")
	public String validateLogin(Model map,
			@RequestParam String username,@RequestParam String password,HttpSession hs)
	{
		Student s = null;
		System.out.println(username+password);
		try
		{
			s = service.validateStudent(username,password);
			hs.setAttribute("studentID", s.getId());
			hs.setAttribute("studentCourseID", s.getCourseID().getCourseID());
			return "redirect:/profile";
		}
		catch(RuntimeException e)
		{
			map.addAttribute("loginMessage", "Invalid Username or Password");
			return "/student/login";
		}
	}
	
	@GetMapping("/profile")
	public String showProfile(Model map,HttpSession hs)
	{
		Student s = service.getStudentDetails((Integer)hs.getAttribute("studentID"));
		map.addAttribute("studentDetails",s);
		return "/student/profile";
	}
	
	@GetMapping("/notices")
	public String showNotices(Model map, HttpSession hs)
	{
		System.out.println(hs.getAttribute("studentCourseID"));
		Integer courseID = (Integer)hs.getAttribute("studentCourseID");
		List<Notice> notices = service.getNotices(courseID);
		map.addAttribute("notices",notices);
		return "/student/notices";
	}
	
	@GetMapping("/schedules")
	public String showSchedules(Model map, HttpSession hs)
	{
		Integer courseID = (Integer)hs.getAttribute("studentCourseID");
		List<Schedule> schedules = service.getSchedules(courseID);
		map.addAttribute("schedules",schedules);
		return "/student/schedules";
	}
	
	@GetMapping("/marks")
	public String showMarks(Model map, HttpSession hs)
	{
		Integer studentID = (Integer)hs.getAttribute("studentID");
		List<Marks> marks =service.getMarks(studentID);
		map.addAttribute("marks",marks);
		return "/student/marks";
	}
	
	@GetMapping("/attendance")
	public String showAttendance(Model map, HttpSession hs)
	{
		Integer studentID = (Integer)hs.getAttribute("studentID");
		List<Attendance> attendances =service.getAttendance(studentID);
		map.addAttribute("attendances",attendances);
		return "/student/attendance";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession hs)
	{
		hs.invalidate();
		return "/student/welcome";
	}
}
