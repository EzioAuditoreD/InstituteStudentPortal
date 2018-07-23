package com.isp.pojos;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Marks {

	private Integer marksID;
	private Integer studentID;
	private Integer moduleID;
	private int practicalMarks;
	private int internalMarks;
	private int cceeMarks;
	private Date createdOn;
	private Date updatedOn;
	
	public Marks(Integer studentID, Integer moduleID, int practicalMarks, int internalMarks, int cceeMarks,
			Date createdOn, Date updatedOn) {
		super();
		this.studentID = studentID;
		this.moduleID = moduleID;
		this.practicalMarks = practicalMarks;
		this.internalMarks = internalMarks;
		this.cceeMarks = cceeMarks;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getMarksID() {
		return marksID;
	}

	public void setMarksID(Integer marksID) {
		this.marksID = marksID;
	}

	public Integer getStudentID() {
		return studentID;
	}

	public void setStudentID(Integer studentID) {
		this.studentID = studentID;
	}

	public Integer getModuleID() {
		return moduleID;
	}

	public void setModuleID(Integer moduleID) {
		this.moduleID = moduleID;
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

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}
	
	
	
}
