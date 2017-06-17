package com.jpaProjet;



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.model.Profil;



@SpringBootApplication
public class JpaProjetApplication {

	public static void main(String[] args) {
//		SpringApplication.run(JpaProjetApplication.class, args);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manager1");
		EntityManager entityManager = emf.createEntityManager();
		
		EntityTransaction tx = entityManager.getTransaction();
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date beginDate;
		
    	try{
    		
			tx.begin();
			
			beginDate = dateFormat.parse("03/05/2017");
			
			Profil p = new Profil("NomTest","PrenomTest", beginDate,"Paris","Univ Test","2017","test@test.fr");
			
			entityManager.persist(p);
				
			tx.commit();			
		
		}catch(Exception e){
			tx.rollback();
		}
		
	}
		
}
