package com.pack.Hibernate.DAO;

import java.util.List;
import com.pack.entity.Employee;

public  interface EmployeeDAO {
	
	public Employee saveEmployee(Employee employee);
	
	public Employee updateEmployee(Employee employee);
	
	public boolean deleteEmployee(Integer id);
	
	public Employee getEmployeebyID(Integer id);
	
	public List<Employee> findAll();
}
