package com.groupeisi.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

/**
 * Entity implementation class for Entity: Compte
 *
 */
@Entity
@NamedQuery(name="Compte.getAll",query="SELECT co from Compte co")
public class Compte implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotNull
	@Length(max=80)
	private String email;
	
	
	
	

	@NotNull
	@Length(max=80)
	private String password;
	
	@OneToMany(mappedBy="compte",fetch = FetchType.EAGER)
	private List<Cv> cvs;
	
	private static final long serialVersionUID = 1L;

	public Compte() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}  
	
	
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}   
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
   
}
