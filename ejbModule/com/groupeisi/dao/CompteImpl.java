package com.groupeisi.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import com.groupeisi.entities.Compte;


@Stateless
public class CompteImpl extends RepositoryImpl<Compte> implements ICompte{

	@PersistenceContext(unitName="CvEJB")
	private EntityManager em;
	private EntityManagerFactory emf;
	
	 public CompteImpl() {
    	 this.emf = Persistence.createEntityManagerFactory("CvEJB");
		 this.em = emf.createEntityManager();
    }
	
	public int get(String email , String password) {
		int result = 0;
		 Compte compte = null;
		 compte = (Compte) em.createQuery("SELECT c FROM Compte c WHERE c.email=:email").setParameter("email", email).getSingleResult();
		 if(compte != null && compte.getPassword().equals(password)) {
			
			 result=compte.getId();
		 }
		 if(compte == null) {
			 result=0;
		 }
		 
		 return result;
		
	}

}
