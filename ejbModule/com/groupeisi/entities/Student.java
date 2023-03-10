package com.groupeisi.entities;

import java.io.Serializable;
import java.lang.String;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

/**
 * Entity implementation class for Entity: Student
 *
 */
@Entity
@NamedQuery(name="Student.getAll",query="SELECT s from Student s")
public class Student implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotNull
	@Length(max=80)
	private String firstName;
	
	@NotNull
	@Length(max=80)
	private String lastName;
	 
	@NotNull
	private LocalDate birthdate;
	 
	@NotNull
	@Length(max=20)
	private String phone;
	
	
	@OneToMany(mappedBy="student",fetch = FetchType.EAGER)
	
	private List<Inscription> inscriptions;
	
	private static final long serialVersionUID = 1L;

	public Student() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}   
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}   
	public LocalDate getBirthdate() {
		return this.birthdate;
	}

	public List<Inscription> getInscriptions() {
		return inscriptions;
	}
	public void setInscriptions(List<Inscription> inscriptions) {
		this.inscriptions = inscriptions;
	}
	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}   
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
   
}
