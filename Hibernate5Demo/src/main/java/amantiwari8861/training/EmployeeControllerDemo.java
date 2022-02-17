package amantiwari8861.training;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class EmployeeControllerDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {

//      prior to hibernate 4
		Configuration config=new Configuration();
		config=config.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=config.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
//		Configuration configuration = new Configuration();
//		configuration = configuration.configure();
//		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
//		builder = builder.applySettings(configuration.getProperties());
//		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
//		Session session=sessionFactory.openSession();
//		Transaction transaction=session.beginTransaction();
		
		//All operations goes inside
		Employee emp=new Employee(109, "Aman", 10000.00, 9891062743L, "amantiwari8861@gmail.com", 22, "Delhi");
		System.out.println(emp);
		session.save(emp);
		transaction.commit();
		session.close();
	}

}
