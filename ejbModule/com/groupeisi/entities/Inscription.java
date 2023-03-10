package com.groupeisi.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

/**
 * Entity implementation class for Entity: Inscription
 *
 */
@Entity
@NamedQuery(name="Inscription.getAll",query="SELECT i from Inscription i")
public class Inscription implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotNull
	@Length(max=100)
	private String details;
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Courses getCourses() {
		return courses;
	}
	public void setCourses(Courses courses) {
		this.courses = courses;
	}
	public Year getYear() {
		return year;
	}
	public void setYear(Year year) {
		this.year = year;
	}

	@ManyToOne()
	@JoinColumn(name="STUDENT_ID")
	private Student student;
	
	@ManyToOne
	@JoinColumn(name="COURSE_ID")
	private Courses courses;
	
	@ManyToOne
	@JoinColumn(name="YEAR_ID")
	private Year year;
	 
	private static final long serialVersionUID = 1L;

	public Inscription() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	
   
}
