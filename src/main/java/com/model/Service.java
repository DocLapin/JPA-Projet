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
		
	}
	
	public static Boolean persist(Object obj) {
		try{
			
			tx = entityManager.getTransaction();
			
			tx.begin();
			
			entityManager.persist(obj);
				
			tx.commit();
			
			return Boolean.TRUE;
		
		}catch(Exception e){
			tx.rollback();
			System.out.println("Erreur dans la persistence, rollback");
			return Boolean.FALSE;
		}
	}
	
	//Rechercher une classe et la supprimer de la base
	public static Boolean suppression(Object obj) {
		try {
			Object obj_searched = entityManager.find(obj.getClass(), 1);
			tx.begin();
			entityManager.remove(obj_searched);
			tx.commit();
		}catch(Exception e) {
			tx.rollback();
			System.out.println("Erreur lors de la suppression, rollback");
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	
	}
	
	
}
