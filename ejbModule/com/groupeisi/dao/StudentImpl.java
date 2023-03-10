package com.groupeisi.dao;

import javax.ejb.Stateless;

import com.groupeisi.entities.Student;

@Stateless
public class StudentImpl extends RepositoryImpl<Student> implements IStudent{

}
