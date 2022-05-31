package com.StudentsManagementSystem.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="Student")
public class Student {

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getStudentContact() {
		return studentContact;
	}

	public void setStudentContact(String studentContact) {
		this.studentContact = studentContact;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	public List<CourseList> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<CourseList> courseList) {
		this.courseList = courseList;
	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId;
	
	@NotBlank(message="name Feild is required!")
	@Size(min=2,max=20,message="Minimum 2 and maximum 15 charachters are allowed !")
	private String studentName;
	
	@Column(unique = true)
	private String studentEmail;
	
	private String password;
	
	private boolean enabled;
	
	private String studentContact;
	
	private String imageURL;
	
	private String role;
	
	
	
	/*
	 * @Override public String toString() { return "Student [studentId=" + studentId
	 * + ", studentName=" + studentName + ", studentEmail=" + studentEmail +
	 * ", password=" + password + ", enabled=" + enabled + ", studentContact=" +
	 * studentContact + ", imageURL=" + imageURL + ", role=" + role + ", course=" +
	 * course + "]"; }
	 */




	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy="student")
	private List<Course> course=new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy="student")
	private List<CourseList> courseList=new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy="student")
	private List<Book> book=new ArrayList<>();
	
	
	
	
	
	
	

	
}
