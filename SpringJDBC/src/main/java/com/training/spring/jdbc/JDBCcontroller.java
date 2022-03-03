package com.training.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class JDBCcontroller {

	static JdbcTemplate jdbcTemp;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		jdbcTemp = jdbcTemplate;
	}

	public static void main(String[] args) {

		ApplicationContext application = new ClassPathXmlApplicationContext("applicationcontext.xml");

		Employee employee = (Employee) application.getBean("employee");

		saveEmployee(employee);
//		updateEmployee(employee);
//		deleteEmployee(employee);

//		Employee employeeById = getEmployeeById(101);
//		System.out.println(employeeById);
		
		List<Employee> allEmployees = GettingEmployee.getAllEmployees();
		List<Employee> allEmployees2 = GettingEmployee.getAllEmployees2();
		List<Employee> allEmployees3 = GettingEmployee.getAllEmployees3();
		
		System.out.println(allEmployees);
		System.out.println(allEmployees2);
		System.out.println(allEmployees3);		
		
		((ConfigurableApplicationContext) application).close();

	}

	public static boolean saveEmployee(Employee employee) {
		/*
		 * String query = "insert into employee values('" + employee.getId() + "','" +
		 * employee.getName() + "','" + employee.getAddress() + "','" +
		 * employee.getEmail() + "','" + employee.getMobile() + "')"; try {
		 * jdbcTemplate.update(query); return true; } catch (DataAccessException e) {
		 * e.printStackTrace(); return false; }
		 */
		String query = "insert into employee values(?,?,?,?,?,?,?)";
		try {
			jdbcTemp.update(query, employee.getId(), employee.getName(), employee.getEmail(), employee.getAddress(),
					employee.getAge(), employee.getSalary(), employee.getPhoneNumber());
			return true;
		} catch (DataAccessException e) {
			e.printStackTrace();
			return false;
		}
	}

	public static boolean updateEmployee(Employee employee) {
		String query = "update employee set name=?, address=?,email=?,phonenumber=? where id =?";
		try {
			jdbcTemp.update(query, employee.getName(), employee.getAddress(), employee.getEmail(),
					employee.getPhoneNumber(), employee.getId());
			return true;
		} catch (DataAccessException e) {
			e.printStackTrace();
			return false;
		}
	}

	public static boolean deleteEmployee(Employee employee) {
		String query = "delete from employee where id =?";
		try {
			jdbcTemp.update(query, employee.getId());
			return true;
		} catch (DataAccessException e) {
			e.printStackTrace();
			return false;
		}
	}

	public static Employee getEmployeeById(int id) {
		String query = "select * from employee where id = ?";
		RowMapper<Employee> rowMapper = new BeanPropertyRowMapper<Employee>(Employee.class);
		return jdbcTemp.queryForObject(query, rowMapper, id);
	}
}
