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
@Table(name="Notices")
public class Notice {

	private Integer noticeID;
	private String title;
	private String data;
	private Date createdOn;
	private Date updatedOn;
	private Course courseID;

	public Notice() {
		super();
		System.out.println("In Notice default ctor");
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getNoticeID() {
		return noticeID;
	}

	public void setNoticeID(Integer noticeID) {
		this.noticeID = noticeID;
	}
	@Column(nullable=false)
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
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
		return "Notice [title=" + title + ", createdOn=" + createdOn + ", courseID=" + courseID
				+ "]";
	}
	
	
}
