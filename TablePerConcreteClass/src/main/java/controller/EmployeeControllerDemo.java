package controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import entity.ContractualEmployee;
import entity.Employee;
import entity.PermanentEmployee;

public class EmployeeControllerDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Configuration config=new Configuration();
		config=config.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=config.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Employee emp=new Employee(15l,"Aman");
		session.save(emp);
		
		ContractualEmployee ce=new ContractualEmployee(100,"Naman",50.5d,1.2f);
		session.save(ce);
		
		PermanentEmployee pe=new PermanentEmployee(102, "ritesh", 5000d);
		session.save(pe);
		transaction.commit();
		session.close();
	}
}
