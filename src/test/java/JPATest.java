import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.Test;

import com.model.Profil;

public class JPATest {

	@Test
	public void test() {
		
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("manager1");
		EntityManager entityManager = emf.createEntityManager();
		
		EntityTransaction tx = entityManager.getTransaction();
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date beginDate;
		
    	try{
    		
			tx.begin();
			
			beginDate = dateFormat.parse("03/05/2017");
			
			Profil profilTest = new Profil("NomTest","PrenomTest", beginDate,"Paris","Univ Test","2017","test@test.fr");
			
			entityManager.persist(profilTest);
				
			tx.commit();			
		
		}catch(Exception e){
			tx.rollback();
			fail("rollback");
		}
	
	}

}
