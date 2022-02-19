package entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CheckCollections {

	public static void main(String[] args) {
		
		SessionFactory sf=ConnectionProvider.getSessionFactory();
		Session session=sf.openSession();
		Transaction tx = session.beginTransaction();
		
		List<Long> phones = new ArrayList<Long>();
		phones.add(6712345123L);
		phones.add(9801231234L);
		phones.add(8012390876L);			
		
		Map<String, String> emails = new HashMap<String, String>();
		emails.put("personal", "amantiwari8861@gmail.com");
		emails.put("professional", "amantiwari2743@gmail.com");
		Employee employee = new Employee("Admin", emails, "Noida", 23, 45000.00, phones);
		employee.setEmailsArray(new String []{"emailaddress1@provider1.com", "emailaddress2@provider2.com", "emailaddress3@provider3.com", "emailaddress4@provider4.com"});

		session.save(employee);
		tx.commit();
		session.close();

	}

}
