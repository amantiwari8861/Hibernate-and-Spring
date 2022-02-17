package com.training.niit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class EmployeeController {

	public static void main(String[] args) {

		
//		Configuration config=new Configuration();
//		config=config.configure("hibernate.cfg.xml");
//		SessionFactory sessionFactory=config.buildSessionFactory();
		
		Configuration configuration = new Configuration();
		configuration = configuration.configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
		builder = builder.applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
		
		
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		//All operations goes inside
		Employee emp=new Employee(100, "Aman", 10000.00, 9891062743L, "amantiwari8861@gmail.com", 22, "Delhi");
		session.save(emp);
		transaction.commit();
		session.close();
	}
}
//ctrl+1 at last for getting return type reference variable
//ctrl+shift+o to remove unused import
//ctrl + shift +s for getter setters