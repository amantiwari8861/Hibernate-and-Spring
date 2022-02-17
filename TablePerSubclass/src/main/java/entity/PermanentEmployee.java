package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table
@PrimaryKeyJoinColumn(name = "emp_id")
public class PermanentEmployee extends Employee {

	@Column(name = "salary")
	private Double salary;

	public PermanentEmployee(long id, String name, Double salary) {
		super(id, name);
		this.salary = salary;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

}