package controller;

import java.util.ArrayList;

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

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService service;
	
	public StudentController() {
		System.out.println("Created Student Controller");
	}
	
	@GetMapping("/login")
	public String showLogin()
	{
		return "/student/login";
	}
	
	@PostMapping("/login")
	public String validateLogin(Model map,
			@RequestParam String username,@RequestParam String password,HttpSession hs)
	{
		Student s = null;
		s = service.validate(username,password);
		if(s==null)
		{
			map.addAttribute("loginMessage", "Invalid Username or Password");
			return "/student/login";
		}
		else
		{
			hs.setAttribute("studentID", s.getId());
			hs.setAttribute("studentCourseID", s.getCourseID());
			return "redirect:/student/profile";
		}
	}
	
	@GetMapping("/profile")
	public String showProfile(Model map,HttpSession hs)
	{
		Student s = service.getDetails((Integer)hs.getAttribute("studentID"));
		map.addAttribute("studentDetails", s);
		return "/student/profile";
	}
	
	@GetMapping("/notices")
	public String showNotices(Model map, HttpSession hs)
	{
		Integer courseID = (Integer)hs.getAttribute("studentCourseID");
		ArrayList<Notice> notices =service.getNotices(courseID);
		map.addAttribute("notices",notices );
		return "/student/notices";
	}
	
	@GetMapping("/schedules")
	public String showSchedules(Model map, HttpSession hs)
	{
		Integer courseID = (Integer)hs.getAttribute("studentCourseID");
		ArrayList<Schedule> schedules =service.getSchedules(courseID);
		map.addAttribute("schedules",schedules );
		return "/student/schedules";
	}
	
	@GetMapping("/marks")
	public String showMarks(Model map, HttpSession hs)
	{
		Integer studentID = (Integer)hs.getAttribute("studentID");
		ArrayList<Marks> marks =service.getMarks(studentID);
		map.addAttribute("marks",marks );
		return "/student/marks";
	}
	
	@GetMapping("/attendance")
	public String showAttendance(Model map, HttpSession hs)
	{
		Integer studentID = (Integer)hs.getAttribute("studentID");
		ArrayList<Attendance> attendances =service.getAttendance(studentID);
		map.addAttribute("attendances",attendances );
		return "/student/attendance";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession hs)
	{
		hs.invalidate();
		return "/student/welcome";
	}
}
