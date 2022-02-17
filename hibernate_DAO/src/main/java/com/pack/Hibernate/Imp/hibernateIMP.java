package com.pack.Hibernate.Imp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

import com.mysql.cj.Query;
import com.pack.Connection.ConnectionsObject;
import com.pack.Hibernate.DAO.EmployeeDAO;
import com.pack.entity.Employee;

public class hibernateIMP implements EmployeeDAO {

	
			
		SessionFactory sessionFactory=ConnectionsObject.getSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
			
	@Override
	public Employee saveEmployee(Employee employee) {
		session.save(employee);
		tx.commit();
		session.close();
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		session.update(employee);
		tx.commit();
		session.close();
		return employee;
	}

	@Override
	public boolean deleteEmployee(Integer id) {
		session.get(Employee.class, id);
			session.delete(id);
			tx.commit();
			session.close();
		return true;
	}

	@Override
	public Employee getEmployeebyID(Integer id) {
		Employee employee=session.get(Employee.class, id);
		tx.commit();
		session.close();
		return employee;
	}

	@Override
	public List<Employee> findAll() {
		Query query =(Query) session.createQuery("From Employee");
		List list=((org.hibernate.query.Query) query).list();
		tx.commit();
		session.close();
		return null;
	}

	
}
