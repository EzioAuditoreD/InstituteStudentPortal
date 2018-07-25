package com.isp.pojos;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Attendance {

	private Integer id;
	private Integer studentId;
	private Integer moduleId; 
	private int attended;
	private int totalLectures;
	private List<Student> students;
	
	public Attendance() {
		super();
		System.out.println("In Attendance default ctor");
	}
	public Attendance(Integer studentId, Integer moduleId, int attended, int totalLectures, List<Student> students) {
		super();
		this.studentId = studentId;
		this.moduleId = moduleId;
		this.attended = attended;
		this.totalLectures = totalLectures;
		this.students = students;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public Integer getModuleId() {
		return moduleId;
	}

	public void setModuleId(Integer moduleId) {
		this.moduleId = moduleId;
	}

	public int getAttended() {
		return attended;
	}

	public void setAttended(int attended) {
		this.attended = attended;
	}

	public int getTotalLectures() {
		return totalLectures;
	}

	public void setTotalLectures(int totalLectures) {
		this.totalLectures = totalLectures;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
	
}
