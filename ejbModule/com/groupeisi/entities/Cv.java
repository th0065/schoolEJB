package com.groupeisi.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

/**
 * Entity implementation class for Entity: Cv
 *
 */
@Entity
@NamedQuery(name="Cv.getAll",query="SELECT c from Cv c")

public class Cv implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotNull
	@Length(max=80)
	private String nom;
	
	@NotNull
	@Length(max=80)
	private String prenom;
	
	@NotNull
	private int age;
	
	@NotNull
	@Length(max=100)
	private String adresse;
	
	@NotNull
	@Length(max=20)
	private String telephone;
	
	@NotNull
	@Length(max=100)
	private String specialite;
	
	@NotNull
	@Length(max=80)
	private String niveauEtude;
	
	@ManyToOne()
	@JoinColumn(name="COMPTE_ID")
	private Compte compte;
	
	public Compte getCompte() {
		return compte;
	}
	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	@OneToMany(mappedBy="cv",fetch = FetchType.EAGER)
	private List<ExperiencePro> experiences;
	 
	private static final long serialVersionUID = 1L;

	public Cv() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}   
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}   
	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}   
	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}   
	public String getSpecialite() {
		return this.specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}   
	public String getNiveauEtude() {
		return this.niveauEtude;
	}

	public void setNiveauEtude(String niveauEtude) {
		this.niveauEtude = niveauEtude;
	}
   
}
