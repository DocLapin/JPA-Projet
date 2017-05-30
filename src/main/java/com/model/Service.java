package com.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public final class Service {
	static private EntityManagerFactory emf = Persistence.createEntityManagerFactory("manager1");
	static private EntityManager entityManager = emf.createEntityManager();
	static private EntityTransaction tx;
	
	private Service() {
		tx = entityManager.getTransaction();
	}
	
	public static Boolean persist(Object obj) {
		try{
			
			tx.begin();
			
			entityManager.persist(obj);
				
			tx.commit();
			
			return Boolean.TRUE;
		
		}catch(Exception e){
			tx.rollback();
			
			return Boolean.FALSE;
		}
	}
	
	
}
