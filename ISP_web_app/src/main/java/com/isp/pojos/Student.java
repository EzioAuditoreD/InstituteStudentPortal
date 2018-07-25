package com.isp.pojos;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Students")
public class Student {

	private Integer id;
	private String name;
	private String Address;
	private String contactNo;
	private char gender;
	private int batch;
	private int courseID;
	private Date dob;
	private String fathersName;
	private String fathersContact;
	private byte[] photo;
	private String qualification;
		
	public Student() {
		super();
		System.out.println("In student default ctor");
	}
	public Student(String name, String address, String contactNo, char gender, int batch, int courseID, Date dob,
			String fathersName, String fathersContact, byte[] photo, String qualification) {
		super();
		this.name = name;
		Address = address;
		this.contactNo = contactNo;
		this.gender = gender;
		this.batch = batch;
		this.courseID = courseID;
		this.dob = dob;
		this.fathersName = fathersName;
		this.fathersContact = fathersContact;
		this.photo = photo;
		this.qualification = qualification;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getBatch() {
		return batch;
	}
	public void setBatch(int batch) {
		this.batch = batch;
	}
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
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
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", Address=" + Address + ", contactNo=" + contactNo + ", gender=" + gender
				+ ", batch=" + batch + ", courseID=" + courseID + ", dob=" + dob + ", fathersName=" + fathersName
				+ ", fathersContact=" + fathersContact + ", photo=" + Arrays.toString(photo) + ", qualification="
				+ qualification + "]";
	}

	
}
