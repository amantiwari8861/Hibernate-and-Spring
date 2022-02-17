package com.training.hibernate.dao.impl;

import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
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
//		sessionFactory.getCurrentSession().save(employee);
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
//		Criteria criteria = session.createCriteria(Employee.class);
//		criteria.addOrder(Order.asc("age"));
//		criteria.add(Restrictions.lt("age", 25));
//		List list = criteria.list();
		Query query = session.createQuery("from Employee"); // Employee is the Java class name
		List list = query.list();
		tx.commit();
		session.close();
		return list;
	}

}
