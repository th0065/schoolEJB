package com.groupeisi.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2023-03-20T12:20:10.301+0000")
@StaticMetamodel(Compte.class)
public class Compte_ {
	public static volatile SingularAttribute<Compte, Integer> id;
	public static volatile SingularAttribute<Compte, String> email;
	public static volatile SingularAttribute<Compte, String> password;
	public static volatile ListAttribute<Compte, Cv> cvs;
}
