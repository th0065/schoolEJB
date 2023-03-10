package com.groupeisi.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import com.groupeisi.entities.Compte;

@Stateless
public class CompteImpl implements ICompte{

	@PersistenceContext(unitName="schoolEJB")
	private EntityManager em;
	private EntityManagerFactory emf;
	
	 public CompteImpl() {
    	 this.emf = Persistence.createEntityManagerFactory("schoolEJB");
		 this.em = emf.createEntityManager();
    }
	
	public int get(String login , String password) {
		int result = 0;
		 Compte compte = null;
		 compte = (Compte) em.createQuery("SELECT c FROM Compte c WHERE c.login=:login").setParameter("login", login).getSingleResult();
		 if(compte != null && compte.getPassword().equals(password)) {
			
			 result=1;
		 }
		 if(compte == null) {
			 result=0;
		 }
		 
		 return result;
		
	}

}
