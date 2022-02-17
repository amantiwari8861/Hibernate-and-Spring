package com.training.hibernate.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.training.hibernate.dao.EmployeeDAO;
import com.training.hibernate.entity.Employee;
import com.training.hibernate.util.HibernateUtil;

public class EmployeeDAOImpl implements EmployeeDAO {

	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	
	public Employee saveEmployee(Employee employee) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(employee);
		tx.commit();
		session.close();
		return employee;
	}

	public Employee updateEmployee(Employee employee) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(employee);
		tx.commit();
		session.close();
		return employee;
	}

	
	public boolean deleteEmployee(Integer id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Employee employee = session.get(Employee.class, id);
		session.delete(employee);
		tx.commit();
		session.close();
		return true;
	}

	public Employee getEmployeeById(Integer id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Employee employee = session.get(Employee.class, id);
		tx.commit();
		session.close();
		return employee;
	}

	public List<Employee> findAll() {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
//		Query query =(Query) session.createQuery("From Employee");
//		List employees=((org.hibernate.query.Query) query).list();
        List<Employee> employees = session.createQuery("FROM Employee").list(); 
		tx.commit();
		session.close();
		return employees;
	}

}
