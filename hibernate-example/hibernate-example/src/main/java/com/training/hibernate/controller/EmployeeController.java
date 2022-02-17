package com.training.hibernate.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.training.hibernate.dao.EmployeeDAO;
import com.training.hibernate.dao.impl.EmployeeDAOImpl;
import com.training.hibernate.entity.Employee;

public class EmployeeController {

	public static void main(String[] args) {

		EmployeeDAO employeeDAO = new EmployeeDAOImpl();

		List<Long> phones = new ArrayList<Long>();
		phones.add(6712345123L);
		phones.add(9801231234L);
		phones.add(8012390876L);
		
		Map<String, String> emails = new HashMap<String, String>();
		emails.put("personal", "rahul@gmail.com");
		emails.put("professional", "rahul@google.com");
		Employee employee = new Employee("Admin", emails, "Noida", 23, 45000.00, phones);
		Employee saveEmployee = employeeDAO.saveEmployee(employee);
		System.out.println(saveEmployee);

//		Employee emp = employeeDAO.getEmployeeById(1);
//		
//		
//		List<Long> phones = emp.getPhoneNumber();
//		phones.forEach(System.out::println);

	}
}
