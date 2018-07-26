package com.isp.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Courses")
public class Course {

	private Integer courseID;
	private String name;
	private String description;
	private String coordinatorName;
	
	private List<Module> modules = new ArrayList<>();
	private List<Student> students= new ArrayList<>();
	private List<Schedule> schedules = new ArrayList<>();
	private List<Notice> notices = new ArrayList<>();
	
	public Course() {
		super();
		System.out.println("In course default ctor");
	}
	
	public Course(String name, String description, String coordinatorName, List<Module> modules, List<Student> students,
			List<Schedule> schedules, List<Notice> notices) {
		super();
		this.name = name;
		this.description = description;
		this.coordinatorName = coordinatorName;
		this.modules = modules;
		this.students = students;
		this.schedules = schedules;
		this.notices = notices;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getCourseID() {
		return courseID;
	}

	public void setCourseID(Integer courseID) {
		this.courseID = courseID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCoordinatorName() {
		return coordinatorName;
	}

	public void setCoordinatorName(String coordinatorName) {
		this.coordinatorName = coordinatorName;
	}

	@OneToMany(mappedBy="courseID", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	public List<Module> getModules() {
		return modules;
	}

	public void setModules(List<Module> modules) {
		this.modules = modules;
	}
	
	@OneToMany(mappedBy="courseID", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@OneToMany(mappedBy="courseID", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	public List<Schedule> getSchedules() {
		return schedules;
	}

	public void setSchedules(List<Schedule> schedules) {
		this.schedules = schedules;
	}

	@OneToMany(mappedBy="courseID", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	public List<Notice> getNotices() {
		return notices;
	}

	public void setNotices(List<Notice> notices) {
		this.notices = notices;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", description=" + description + "]";
	}
	
	

}
