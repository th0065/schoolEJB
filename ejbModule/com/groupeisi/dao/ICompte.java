package com.groupeisi.dao;

import javax.ejb.Local;



@Local
public interface ICompte {
	public int get(String login, String password);

}
