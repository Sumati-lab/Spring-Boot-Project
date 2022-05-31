package com.StudentsManagementSystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@Entity
@Table(name="Course")
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int courseId;
	private String courseName;
	private double courseFee;
	private double courseDuration;
	@Column(length=500)
	private String courseDescription;
	
	@ManyToOne
	private Student student;

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseFee=" + courseFee
				+ ", courseDuration=" + courseDuration + ", courseDescription=" + courseDescription + ", student="
				+ student + "]";
	}

	public Course(int courseId, String courseName, double courseFee, double courseDuration, String courseDescription,
			Student student) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseFee = courseFee;
		this.courseDuration = courseDuration;
		this.courseDescription = courseDescription;
		this.student = student;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
}
