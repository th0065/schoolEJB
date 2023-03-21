package com.groupeisi.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2023-03-15T18:45:55.254+0000")
@StaticMetamodel(Cv.class)
public class Cv_ {
	public static volatile SingularAttribute<Cv, Integer> id;
	public static volatile SingularAttribute<Cv, String> nom;
	public static volatile SingularAttribute<Cv, String> prenom;
	public static volatile SingularAttribute<Cv, Integer> age;
	public static volatile SingularAttribute<Cv, String> adresse;
	public static volatile SingularAttribute<Cv, String> telephone;
	public static volatile SingularAttribute<Cv, String> specialite;
	public static volatile SingularAttribute<Cv, String> niveauEtude;
	public static volatile SingularAttribute<Cv, Compte> compte;
	public static volatile ListAttribute<Cv, ExperiencePro> experiences;
}
