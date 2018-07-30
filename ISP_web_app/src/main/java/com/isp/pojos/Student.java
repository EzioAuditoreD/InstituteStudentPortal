package com.isp.pojos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Students")
public class Student {

	private Integer id;
	private String name;
	private String username;
	private String password;
	private String Address;
	private String contactNo;
	private char gender;
	private int batch;
	private Date dob;
	private String fathersName;
	private String fathersContact;
	private byte[] photo;
	private String qualification;
	private boolean verified;
	private boolean active;
	
	private Course courseID;
	private List<Marks> marks = new ArrayList<>();
	private List<Attendance> attendance = new ArrayList<>();
	
	public Student() {
		super();
		System.out.println("In student default ctor");
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(nullable=false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(nullable=false)
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Column(unique=true, nullable=false)
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	@Column(nullable=false)
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	@Column(nullable=false)
	public int getBatch() {
		return batch;
	}
	public void setBatch(int batch) {
		this.batch = batch;
	}
	@Column(nullable=false)
	@Temporal(TemporalType.DATE)
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Column(nullable=false)
	public String getFathersName() {
		return fathersName;
	}
	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}
	public String getFathersContact() {
		return fathersContact;
	}
	public void setFathersContact(String fathersContact) {
		this.fathersContact = fathersContact;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	@Column(nullable=false)
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public boolean isVerified() {
		return verified;
	}
	public void setVerified(boolean verified) {
		this.verified = verified;
	}
	@Column(unique=true, nullable=false)
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Column(nullable=false)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Column(nullable=false)
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}

	@ManyToOne
	@JoinColumn(name="CourseID_FK")
	public Course getCourseID() {
		return courseID;
	}

	public void setCourseID(Course course) {
		this.courseID = course;
	}
	
	@OneToMany(mappedBy="studentID",cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	public List<Marks> getMarks() {
		return marks;
	}

	public void setMarks(List<Marks> marks) {
		this.marks = marks;
	}

	@OneToMany(mappedBy="studentID", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	public List<Attendance> getAttendance() {
		return attendance;
	}

	public void setAttendance(List<Attendance> attendance) {
		this.attendance = attendance;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", Address=" + Address + ", contactNo=" + contactNo + ", gender=" + gender
				+ ", batch=" + batch + ", courseID=" + courseID + ", dob=" + dob + ", fathersName=" + fathersName
				+ ", fathersContact=" + fathersContact + ", photo=" + Arrays.toString(photo) + ", qualification="
				+ qualification + "]";
	}

	
}
