package com.isp.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Schedule {

	private Integer scheduleID;
	private Integer courseID;
	private int weekNo;
	private String data;
	
	public Schedule() {
		super();
		System.out.println("In Schedule default ctor");
	}

	public Schedule(Integer courseID, int weekNo, String data) {
		super();
		this.courseID = courseID;
		this.weekNo = weekNo;
		this.data = data;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getScheduleID() {
		return scheduleID;
	}

	public void setScheduleID(Integer scheduleID) {   
		this.scheduleID = scheduleID;
	}

	public Integer getCourseID() {
		return courseID;
	}

	public void setCourseID(Integer courseID) {
		this.courseID = courseID;
	}

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
	@Override
	public String toString() {
		return "Schedule [courseID=" + courseID + ", weekNo=" + weekNo + ", data=" + data + "]";
	}

	

}
