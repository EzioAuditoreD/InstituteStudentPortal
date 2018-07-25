package com.isp.pojos;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Modules")
public class Module {

	private Integer moduleID;
	private String moduleName;
	private Integer courseID;
	private int hours;
	private String facultyName;
	private String description;
	private int practicalTotal;
	private int cceeTotal;
	private int internal;
	
	public Module() {
		super();
		System.out.println("In Module default ctor");
	}
	public Module(String moduleName, Integer courseID, int hours, String facultyName, String description,
			int practicalTotal, int cceeTotal, int internal) {
		super();
		this.moduleName = moduleName;
		this.courseID = courseID;
		this.hours = hours;
		this.facultyName = facultyName;
		this.description = description;
		this.practicalTotal = practicalTotal;
		this.cceeTotal = cceeTotal;
		this.internal = internal;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getModuleID() {
		return moduleID;
	}

	public void setModuleID(Integer moduleID) {
		this.moduleID = moduleID;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public Integer getCourseID() {
		return courseID;
	}

	public void setCourseID(Integer courseID) {
		this.courseID = courseID;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

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

	public int getPracticalTotal() {
		return practicalTotal;
	}

	public void setPracticalTotal(int practicalTotal) {
		this.practicalTotal = practicalTotal;
	}

	public int getCceeTotal() {
		return cceeTotal;
	}

	public void setCceeTotal(int cceeTotal) {
		this.cceeTotal = cceeTotal;
	}

	public int getInternal() {
		return internal;
	}

	public void setInternal(int internal) {
		this.internal = internal;
	}

	@Override
	public String toString() {
		return "Module [moduleName=" + moduleName + ", courseID=" + courseID + ", hours=" + hours + ", facultyName="
				+ facultyName + ", description=" + description + ", practicalTotal=" + practicalTotal + ", cceeTotal="
				+ cceeTotal + ", internal=" + internal + "]";
	}
	
	

}
