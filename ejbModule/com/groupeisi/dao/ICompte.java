package com.groupeisi.dao;

import javax.ejb.Local;

import com.groupeisi.entities.Compte;



@Local
public interface ICompte extends Repository<Compte>{
	public int get(String email, String password);

}
