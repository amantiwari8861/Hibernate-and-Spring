package com.pack.Connection;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pack.entity.Employee;

public class ConnectionsObject {

	public static SessionFactory getSessionFactory() {

		Configuration config=new Configuration();
		config=config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Employee.class);
		SessionFactory sessionFactory=config.buildSessionFactory();
		return sessionFactory;
	}
}
