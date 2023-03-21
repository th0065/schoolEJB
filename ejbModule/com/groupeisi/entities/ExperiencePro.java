package com.groupeisi.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

/**
 * Entity implementation class for Entity: ExperiencePro
 *
 */
@Entity
@NamedQuery(name="ExperiencePro.getAll",query="SELECT e from ExperiencePro e")

public class ExperiencePro implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotNull
	@Length(max=20)
	private String Debut;
	
	@NotNull
	@Length(max=20)
	private String Fin;
	
	@NotNull
	@Length(max=80)
	private String nom;
	
	@NotNull
	@Length(max=255)
	private String details;
	
	@ManyToOne()
	@JoinColumn(name="CV_ID")
	private Cv cv;
   
	
   
	private static final long serialVersionUID = 1L;

	public ExperiencePro() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getDebut() {
		return this.Debut;
	}

	public void setDebut(String Debut) {
		this.Debut = Debut;
	}   
	public String getFin() {
		return this.Fin;
	}

	public void setFin(String Fin) {
		this.Fin = Fin;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
   
}
