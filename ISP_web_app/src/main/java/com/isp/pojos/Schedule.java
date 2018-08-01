package com.isp.pojos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Schedules")
public class Schedule {

	private Integer scheduleID;
	private int weekNo;
	private String data;
	private Date createdOn;
	private Date updatedOn;
	
	private Course courseID;
	
	public Schedule() {
		super();
		System.out.println("In Schedule default ctor");
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getScheduleID() {
		return scheduleID;
	}

	public void setScheduleID(Integer scheduleID) {   
		this.scheduleID = scheduleID;
	}
	@Column(nullable=false)
	public int getWeekNo() {
		return weekNo;
	}

	public void setWeekNo(int weekNo) {
		this.weekNo = weekNo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	@ManyToOne
	@JoinColumn(name="CourseID_FK")
	public Course getCourseID() {
		return courseID;
	}

	public void setCourseID(Course courseID) {
		this.courseID = courseID;
	}

	@Override
	public String toString() {
		return "Schedule [courseID=" + courseID + ", weekNo=" + weekNo + "]";
	}
}
