package entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
@DiscriminatorValue(value = "CE")
public class ContractualEmployee extends Employee {

	@Column(name = "hourly_rate")
	private Double HourlyRate;

	@Column(name = "contract_period")
	private Float ContractPeriod;

	
	
	public ContractualEmployee(long id, String name, Double hourlyRate, Float contractPeriod) {
		super(id, name);
		HourlyRate = hourlyRate;
		ContractPeriod = contractPeriod;
	}

	public Double getHourlyRate() {
		return HourlyRate;
	}

	public void setHourlyRate(Double hourlyRate) {
		HourlyRate = hourlyRate;
	}

	public Float getContractPeriod() {
		return ContractPeriod;
	}

	public void setContractPeriod(Float contractPeriod) {
		ContractPeriod = contractPeriod;
	}

}