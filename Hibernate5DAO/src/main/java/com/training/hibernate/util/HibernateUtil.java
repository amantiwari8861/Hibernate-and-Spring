package com.training.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.training.hibernate.entity.Employee;

public class HibernateUtil {

	public static SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration();
		configuration = configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Employee.class);
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
		builder = builder.applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
		return sessionFactory;
	}
}
