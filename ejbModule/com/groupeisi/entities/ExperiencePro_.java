package com.groupeisi.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2023-03-21T17:13:41.310+0000")
@StaticMetamodel(ExperiencePro.class)
public class ExperiencePro_ {
	public static volatile SingularAttribute<ExperiencePro, Integer> id;
	public static volatile SingularAttribute<ExperiencePro, String> Debut;
	public static volatile SingularAttribute<ExperiencePro, String> Fin;
	public static volatile SingularAttribute<ExperiencePro, String> nom;
	public static volatile SingularAttribute<ExperiencePro, String> details;
	public static volatile SingularAttribute<ExperiencePro, Cv> cv;
}
