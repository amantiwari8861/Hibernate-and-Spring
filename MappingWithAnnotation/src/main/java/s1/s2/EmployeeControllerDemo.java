package s1.s2;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeControllerDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Configuration config=new Configuration();
		config=config.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=config.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		

		Employee emp=new Employee("Aman", 10000.00, 9891062743L, "amantiwari8861@gmail.com", 22, "Delhi");
		System.out.println(emp);
		session.save(emp);
		transaction.commit();
		session.close();
	}

}
