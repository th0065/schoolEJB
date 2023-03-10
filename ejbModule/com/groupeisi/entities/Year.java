package com.groupeisi.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

/**
 * Entity implementation class for Entity: Year
 *
 */
@Entity
@NamedQuery(name="Year.getAll",query="SELECT y from Year y")

public class Year implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotNull
	@Length(max=40)
	private String name;
	
	@OneToMany(mappedBy="year")
	private List<Inscription> inscriptions;
	
	public List<Inscription> getInscriptions() {
		return inscriptions;
	}
	public void setInscriptions(List<Inscription> inscriptions) {
		this.inscriptions = inscriptions;
	}

	private static final long serialVersionUID = 1L;

	public Year() {
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
   
}
