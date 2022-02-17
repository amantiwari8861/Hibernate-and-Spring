package com.training.hibernate.controller;

import java.util.List;

import com.training.hibernate.dao.EmployeeDAO;
import com.training.hibernate.dao.impl.EmployeeDAOImpl;
import com.training.hibernate.entity.Employee;

public class EmployeeController {

	public static void main(String[] args) {

		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		
//		Employee employee = new Employee("Admin", "amantiwari8861@gmail.com", "Noida", 23, 45000.00, 9891062743l);
		
		//save employee
//		Employee saveEmployee = employeeDAO.saveEmployee(employee);
//		employeeDAO.saveEmployee(new Employee("SuperAdmin", "amantiwari8862@gmail.com", "Noida", 23, 45000.00, 9891062743l));
//		employeeDAO.saveEmployee(new Employee("SuperAdmin2", "amantiwari8863@gmail.com", "Noida", 23, 45000.00, 9891062743l));
//		employeeDAO.saveEmployee(new Employee("SuperAdmin3", "amantiwari8864@gmail.com", "Noida", 23, 45000.00, 9891062743l));
//		System.out.println(saveEmployee);
		
//		//update emp
		Employee employee = new Employee("user", "chaman", "Delhi", 23, 45000.00, 9891062743l);
		Employee updateEmp = employeeDAO.updateEmployee(employee);
		System.out.println(updateEmp);
//		
//		//delete emp
//		boolean deleteEmployee = employeeDAO.deleteEmployee(1);
//		System.out.println(deleteEmployee);
//		
//		//get emp by id
//		Employee getEmp = employeeDAO.getEmployeeById(2);
//		System.out.println(getEmp);
//
//		//find all emp
//		List<Employee> list = employeeDAO.findAll();
//		list.forEach(System.out::println);
		
	}
}
