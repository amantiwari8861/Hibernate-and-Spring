package entity;

import java.util.List;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import org.hibernate.annotations.IndexColumn;

@Entity
@Table(name = "Collections")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_id")
	private int id;
	@Column(name = "employee_name")
	private String name;
	@ElementCollection
	@CollectionTable(name = "emails")
	private Map<String, String> email;
	private String address;
	private int age;
	private double salary;
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "phoneNumber")
	private List<Long> phoneNumber;
	@ElementCollection
	@IndexColumn(name="Address")
	@CollectionTable(name = "EmpAddresses")
	private String[] myArray;
	
	public Employee() {

	}

	public Employee(String name, Map<String, String> email, String address, Integer age, Double salary, List<Long> phoneNumber) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.age = age;
		this.salary = salary;
		this.phoneNumber = phoneNumber;
	}

	public String[] getEmailsArray() {
		return myArray;
	}

	public void setEmailsArray(String[] emailsArray) {
		this.myArray = emailsArray;
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

	public Map<String, String> getEmail() {
		return email;
	}

	public void setEmail(Map<String, String> email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public List<Long> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(List<Long> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", age=" + age
				+ ", salary=" + salary;
	}

}
