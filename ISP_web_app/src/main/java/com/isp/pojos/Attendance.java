package com.isp.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Attendance {

	private Integer id;
	private int attended;
	private int totalLectures;

	private Student studentID;
	private Module moduleID; 
	
	public Attendance() {
		super();
		System.out.println("In Attendance default ctor");
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	@ManyToOne
	@JoinColumn(name="StudenID_FK")
	public Student getStudentID() {
		return studentID;
	}

	public void setStudentID(Student studentID) {
		this.studentID = studentID;
	}

	@ManyToOne
	@JoinColumn(name="ModuleID_FK")
	public Module getModuleID() {
		return moduleID;
	}

	public void setModuleID(Module moduleID) {
		this.moduleID = moduleID;
	}

	@Override
	public String toString() {
		return "Attendance [attended=" + attended + ", totalLectures=" + totalLectures + ", studentID=" + studentID
				+ ", moduleID=" + moduleID + "]";
	}
	
}
