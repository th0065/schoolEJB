package com.groupeisi.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

/**
 * Entity implementation class for Entity: Courses
 *
 */
@Entity
@NamedQuery(name="Courses.getAll",query="SELECT c from Courses c")
public class Courses implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotNull
	@Length(max=80)
	private String name;
	
	@NotNull
	@Length(max=80)
	private String programme;
	

	@OneToMany(mappedBy="courses")
	private List<Inscription> inscriptions;
	
	public List<Inscription> getInscriptions() {
		return inscriptions;
	}
	public void setInscriptions(List<Inscription> inscriptions) {
		this.inscriptions = inscriptions;
	}

	private static final long serialVersionUID = 1L;

	public Courses() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public String getProgramme() {
		return this.programme;
	}

	public void setProgramme(String programme) {
		this.programme = programme;
	}
   
}
