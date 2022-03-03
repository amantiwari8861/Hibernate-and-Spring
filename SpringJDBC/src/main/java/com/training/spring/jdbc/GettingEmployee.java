package com.training.spring.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class GettingEmployee {

	private static JdbcTemplate jdbcTemplate = JDBCcontroller.jdbcTemp;

	public static List<Employee> getAllEmployees() {
		// 1. ResultSetExecutor Example
		return jdbcTemplate.query("select * from employee", new ResultSetExtractor<List<Employee>>() {
			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Employee> list = new ArrayList<Employee>();
				while (rs.next()) {
					Employee employee = new Employee();
					employee.setId(rs.getInt(1));
					employee.setName(rs.getString(2));
					employee.setEmail(rs.getString(3));
					employee.setAddress(rs.getString(4));
					employee.setAge(rs.getInt(5));
					employee.setSalary(rs.getDouble(6));
					employee.setPhoneNumber(rs.getLong(7));
					list.add(employee);
				}
				return list;
			}
		});
	}

	public static List<Employee> getAllEmployees2() {
		// 2. RowMapper Example
		return jdbcTemplate.query("select * from employee", new RowMapper<Employee>() {
			@Override
			public Employee mapRow(ResultSet rs, int rownumber) throws SQLException {

				Employee employee = new Employee();
				employee.setId(rs.getInt(1));
				employee.setName(rs.getString(2));
				employee.setEmail(rs.getString(3));
				employee.setAddress(rs.getString(4));
				employee.setAge(rs.getInt(5));
				employee.setSalary(rs.getDouble(6));
				employee.setPhoneNumber(rs.getLong(7));
				return employee;
			}
		});
	}

	public static List<Employee> getAllEmployees3() {
		// 3. By using BeanPropertyRowMapper
		String sql = "SELECT * FROM employee";
		RowMapper<Employee> rowMapper = new BeanPropertyRowMapper<>(Employee.class);
		return jdbcTemplate.query(sql, rowMapper);
	}

}
