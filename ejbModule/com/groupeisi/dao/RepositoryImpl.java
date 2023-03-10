package com.groupeisi.dao;


import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

@Stateless
public class RepositoryImpl<T> implements Repository<T> {

	@PersistenceContext(unitName="schoolEJB")
	private EntityManager em;
	private EntityManagerFactory emf;
	
	 public RepositoryImpl() {
    	 this.emf = Persistence.createEntityManagerFactory("schoolEJB");
		 this.em = emf.createEntityManager();
		  
		  
    }
	@Override
	public int add(T t) {
		int result=1;
		em.persist(t);
		
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public int delete(int id, T t) {
            int result=1;
		
		String table=t.getClass().getSimpleName();
        t=(T) em.createQuery("SELECT t FROM " + table + " t WHERE t.id=:id").setParameter("id", id).getSingleResult();
        em.remove(t);
		return result;
	}

	@Override
	public int update(T t) {
		int result=1;
		em.merge(t);
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> list(T t) {
		   String table=t.getClass().getSimpleName();
	       return (List<T>) em.createQuery("SELECT t FROM " + table + " t "  ).getResultList();
	       
	}
	public List<T> liste(T t,int start,int total) {
		   String table=t.getClass().getSimpleName();
	       return (List<T>) em.createQuery("SELECT t FROM " + table + " t "  )
	    		   .setFirstResult(start-1)
	    		   .setMaxResults(total)
	    		   .getResultList();
	    		 
	       
	}
	

	@SuppressWarnings("unchecked")
	@Override
	public T get(int id, T t) {
		String table=t.getClass().getSimpleName();
        t=(T) em.createQuery("SELECT t FROM " + table + " t WHERE t.id=:id").setParameter("id", id).getSingleResult();
        return t;
	}

	


}
