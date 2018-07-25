package com.isp.pojos;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Notice {

	private Integer noticeID;
	private String title;
	private Date createdOn;
	private String data;
	private Integer courseID;

	public Notice() {
		super();
		System.out.println("In Notice default ctor");
	}


	public Notice(String title, Date createdOn, String data, Integer courseID) {
		super();
		this.title = title;
		this.createdOn = createdOn;
		this.data = data;
		this.courseID = courseID;
	}

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getNoticeID() {
		return noticeID;
	}

	public void setNoticeID(Integer noticeID) {
		this.noticeID = noticeID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Integer getCourseID() {
		return courseID;
	}

	public void setCourseID(Integer courseID) {
		this.courseID = courseID;
	}

	@Override
	public String toString() {
		return "Notice [title=" + title + ", createdOn=" + createdOn + ", data=" + data + ", courseID=" + courseID
				+ "]";
	}
	
	
}
