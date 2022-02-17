package com.training.hibernate.dao;

import java.util.List;

import com.training.hibernate.entity.Employee;

public interface EmployeeDAO {

	public Employee saveEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	public boolean deleteEmployee(Integer id);

	public Employee getEmployeeById(Integer id);

	public List<Employee> findAll();

}
