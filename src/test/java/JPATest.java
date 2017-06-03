import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.model.Profil;
import com.model.Service;

public class JPATest {

	@Test
	public void test() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date beginDate;
		
		
		try {
			beginDate = dateFormat.parse("03/05/2017");
		
			Profil profilTest = new Profil("NomTest","PrenomTest", beginDate,"Paris","Univ Test","2017","test@test.fr");
			
			Service.persist(profilTest);
		
		} catch (ParseException e) {
			
			fail("Not yet implemented");
		}
		
	}

}
