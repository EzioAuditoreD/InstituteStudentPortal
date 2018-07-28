package com.isp.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Modules")
public class Module {

	private Integer moduleID;
	private String moduleName;
	private int hours;
	private String facultyName;
	private String description;
	private int practicalTotal;
	private int cceeTotal;
	private int internal;
	
	private Course courseID;
	private List<Marks> marks = new ArrayList<>();
	private List<Attendance> attendance = new ArrayList<>();
	
	public Module() {
		super();
		System.out.println("In Module default ctor");
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getModuleID() {
		return moduleID;
	}

	public void setModuleID(Integer moduleID) {
		this.moduleID = moduleID;
	}
	@Column(nullable=false, unique=true)
	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	@Column(nullable=false)
	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
	@Column(nullable=false)
	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	@Column(nullable=false)
	public int getPracticalTotal() {
		return practicalTotal;
	}

	public void setPracticalTotal(int practicalTotal) {
		this.practicalTotal = practicalTotal;
	}
	@Column(nullable=false)
	public int getCceeTotal() {
		return cceeTotal;
	}

	public void setCceeTotal(int cceeTotal) {
		this.cceeTotal = cceeTotal;
	}
	@Column(nullable=false)
	public int getInternal() {
		return internal;
	}

	public void setInternal(int internal) {
		this.internal = internal;
	}

	@ManyToOne
	@JoinColumn(name="CourseID_FK")
	public Course getCourseID() {
		return courseID;
	}

	public void setCourseID(Course courseID) {
		this.courseID = courseID;
	}

	@OneToMany(mappedBy="moduleID", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	public List<Marks> getMarks() {
		return marks;
	}

	public void setMarks(List<Marks> marks) {
		this.marks = marks;
	}

	@OneToMany(mappedBy="moduleID", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	public List<Attendance> getAttendance() {
		return attendance;
	}

	public void setAttendance(List<Attendance> attendance) {
		this.attendance = attendance;
	}

	@Override
	public String toString() {
		return "Module [moduleName=" + moduleName + ", courseID=" + courseID + ", hours=" + hours + ", facultyName="
				+ facultyName + ", description=" + description + ", practicalTotal=" + practicalTotal + ", cceeTotal="
				+ cceeTotal + ", internal=" + internal + "]";
	}
	
	

}
