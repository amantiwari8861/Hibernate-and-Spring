package com.pack.entity;

import java.util.List;

import com.pack.Hibernate.DAO.EmployeeDAO;
import com.pack.Hibernate.Imp.hibernateIMP;

public class EmployeeController {

	public static void main(String[] args) {
		hibernateIMP obj=new hibernateIMP();
//		obj.saveEmployee(new Employee(105, "kamal", 10200d, 98121062743l, "kamalsingh8861@gmail.com", 12, "london"));
		List<Employee> list = obj.findAll();
		list.forEach(System.out::println);
	}

}