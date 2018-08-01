package com.isp.controller;

import java.util.ArrayList;
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
		System.out.println("login page");
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
			return "redirect:/student/profile";
		}
		catch(RuntimeException e)
		{
			map.addAttribute("loginMessage", "Invalid Username or Password");
			return "/login";
		}
	}
	
	@GetMapping("/profile")
	public String showProfile(Model map,HttpSession hs)
	{
		try {
		Student s = service.getStudentDetails((Integer)hs.getAttribute("studentID"));
		map.addAttribute("studentDetails",s);
		return "/profile";
		}
		catch(RuntimeException e)
		{
			System.out.println(e.getMessage());
			return "redirect:/student/login";
		}
	}
	
	@GetMapping("/notices")
	public String showNotices(Model map, HttpSession hs)
	{
		try {
		System.out.println(hs.getAttribute("studentCourseID"));
		Integer courseID = (Integer)hs.getAttribute("studentCourseID");
		List<Notice> notices = service.getNotices(courseID);
		map.addAttribute("notices",notices);
		return "/notices";
		}
		catch(RuntimeException e)
		{
			System.out.println(e.getMessage());
			return "redirect:/student/login";
		}
	}
	
	@GetMapping("/schedules")
	public String showSchedules(Model map, HttpSession hs)
	{
		try {
		Integer courseID = (Integer)hs.getAttribute("studentCourseID");
		List<Schedule> schedules = service.getSchedules(courseID);
		map.addAttribute("schedules",schedules);
		return "/schedules";
		}
		catch(RuntimeException e)
		{
			System.out.println(e.getMessage());
			return "redirect:/student/login";
		}
	}
	
	@GetMapping("/marks")
	public String showMarks(Model map, HttpSession hs)
	{
		try {
			int megaTotal=0,total,cceeTotal=0;
		Integer studentID = (Integer)hs.getAttribute("studentID");
		ArrayList<Integer> totals = new ArrayList<>();
		List<Marks> marks =service.getMarks(studentID);
		for(Marks mark : marks)
		{
			cceeTotal+=mark.getCceeMarks();
			total =mark.getCceeMarks()+mark.getInternalMarks()+mark.getPracticalMarks();
			totals.add(total);
			megaTotal+=total;
		}
		map.addAttribute("cceeTotal", cceeTotal);
		map.addAttribute("totalList",totals);
		map.addAttribute("megaTotal", megaTotal);
		map.addAttribute("marks",marks);
		return "/marks";
		}
		catch(RuntimeException e)
		{
			System.out.println(e.getMessage());
			return "redirect:/student/login";
		}
	}
	
	@GetMapping("/attendance")
	public String showAttendance(Model map, HttpSession hs)
	{
		try {
			int totalAttended=0,totalOccured=0,totalPercentage=0,percentage;
		Integer studentID = (Integer)hs.getAttribute("studentID");
		List<Attendance> attendances =service.getAttendance(studentID);
		ArrayList<Integer> attendancePercentages = new ArrayList<>();
		for(Attendance a:attendances)
		{
			totalAttended+=a.getAttended();
			totalOccured+=a.getTotalLectures();
			percentage = 100*a.getAttended()/a.getTotalLectures();
			attendancePercentages.add(percentage);
		}
		totalPercentage=100*totalAttended/totalOccured;
		map.addAttribute("percentages", attendancePercentages);
		map.addAttribute("totalPercentage", totalPercentage);
		map.addAttribute("totalAttended", totalAttended);
		map.addAttribute("totalOccured", totalOccured);
		map.addAttribute("attendances",attendances);
		return "/attendance";
		}
		catch(RuntimeException e)
		{
			System.out.println(e.getMessage());
			return "redirect:/student/login";
		}
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession hs)
	{
		hs.invalidate();
		return "redirect:/student/login";
	}
}
