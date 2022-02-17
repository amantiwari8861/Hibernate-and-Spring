package com.training.niit;

public class Employee {

	private Integer id;
	private String name;
	private Double salary;
	private Long phoneNumber; 
	private String email;
	private Integer age;
	private String address;
	public Employee(){	}
	public Employee(Integer id, String name, Double salary, Long phoneNumber, String email, Integer age,
			String address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.age = age;
		this.address = address;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
