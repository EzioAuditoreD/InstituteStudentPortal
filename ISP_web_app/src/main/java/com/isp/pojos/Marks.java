package com.isp.pojos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Marks {

	private Integer marksID;
	private int practicalMarks;
	private int internalMarks;
	private int cceeMarks;
	private Date createdOn;
	private Date updatedOn;
	
	private Student studentID;
	private Module moduleID;
	
	public Marks() {
		super();
		System.out.println("In Marks default ctor");
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getMarksID() {
		return marksID;
	}

	public void setMarksID(Integer marksID) {
		this.marksID = marksID;
	}

	public int getPracticalMarks() {
		return practicalMarks;
	}

	public void setPracticalMarks(int practicalMarks) {
		this.practicalMarks = practicalMarks;
	}

	public int getInternalMarks() {
		return internalMarks;
	}

	public void setInternalMarks(int internalMarks) {
		this.internalMarks = internalMarks;
	}

	public int getCceeMarks() {
		return cceeMarks;
	}

	public void setCceeMarks(int cceeMarks) {
		this.cceeMarks = cceeMarks;
	}
	@Temporal(TemporalType.DATE)
	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	@Temporal(TemporalType.DATE)
	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	@ManyToOne
	@JoinColumn(name="StudentID_FK")
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
		return "Marks [practicalMarks=" + practicalMarks + ", internalMarks=" + internalMarks + ", cceeMarks="
				+ cceeMarks + ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + ", studentID=" + studentID
				+ ", moduleID=" + moduleID + "]";
	}
	
	
	
}
